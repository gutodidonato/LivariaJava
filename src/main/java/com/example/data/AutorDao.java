package com.example.data;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Autor;

public class AutorDao {

    private final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private final String USER = "rm99433";
    private final String PASS = "090397";
    
    public void inserir(Autor autor) throws SQLException{
        var con = DriverManager.getConnection(URL, USER, PASS);

        var ps = con.prepareStatement("INSERT INTO autores (nome, lingua) VALUES (?, ?)");
        ps.setString(1, autor.getNome());
        ps.setString(2, autor.getLingua());

        ps.executeUpdate();
        con.close();
    }

    public List<Autor> buscarTodos() throws SQLException{
        var autores = new ArrayList<Autor>();
        var con = DriverManager.getConnection(URL, USER, PASS);
        var rs = con.createStatement().executeQuery("SELECT * FROM autores");

        while(rs.next()){
            autores.add(new Autor(
                rs.getInt("id"),
                rs.getString("nome"), 
                rs.getString("lingua") 
            ));
        }

        con.close();
        return autores;
    }
    public void atualizar(Autor autor) throws SQLException {
        var con = DriverManager.getConnection(URL, USER, PASS);
        var ps = con.prepareStatement("UPDATE autores SET lingua=?, nome=? WHERE id=?");
        ps.setString(1, autor.getLingua());
        ps.setString(2, autor.getNome());
        ps.setInt(3, autor.getId());
        
        ps.executeUpdate();
        con.close();

    }

    public void apagar(Autor autor) throws SQLException {
        var con = DriverManager.getConnection(URL, USER, PASS);
        var ps = con.prepareStatement("DELETE FROM autores WHERE id=?"); 
        ps.setInt(1, autor.getId());
        ps.executeUpdate();
        con.close();
    }


}
