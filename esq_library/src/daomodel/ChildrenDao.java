/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomodel;

import dao.Dao;
import database.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Children;
//
/**
 *
 * @author faiz hanafi*/
public class ChildrenDao implements Dao<Children> {

    @Override
    public List<Children> getAll() {
        String sql = "SELECT * FROM children";
        List<Children> listBuku = new ArrayList<>();
        ResultSet rs;
        
        try {
            Statement stmt = Koneksi.getConnection().createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int idBuku = rs.getInt("book_id");
                String judul = rs.getString("name");
                String isbn = rs.getString("isbn");
                int stock = rs.getInt("stock");
                int price = rs.getInt("price");
                String keyid =rs.getString("key_id");

                Children children = new Children(idBuku, judul, price, isbn, stock,keyid);
                listBuku.add(children);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listBuku;
    }

    @Override
    public void save(Children t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Children t) {
       
     String sql = "UPDATE history SET book_id =?, name =?, price =?, isbn =?, stock =? WHERE key_id =?";
     try {
         PreparedStatement pstmt = Koneksi.getConnection().prepareStatement(sql);
         pstmt.setInt(1, t.getIdBuku());
         pstmt.setString(2, t.getJudul());
         pstmt.setInt(3, t.getPrice());
         pstmt.setString(4, t.getIsbn());
         pstmt.setInt(5, t.getStock());
         pstmt.setString(6, t.getkeyid());
         pstmt.executeUpdate();

       
        } catch (Exception e) {
            e.printStackTrace();
        }
 
}

    @Override
    public void delete(Children t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
