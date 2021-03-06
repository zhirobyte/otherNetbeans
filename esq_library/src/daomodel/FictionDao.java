/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Fiction;

/**
 *
 * @author faizzhiro
 */
public class FictionDao implements Dao<Fiction> {



    @Override
    public List<Fiction> getAll() {
        String sql = "SELECT * FROM Fiction";
        List<Fiction> listFiction = new ArrayList<>();
        ResultSet rs;
        
        try {
            Statement stmt = Koneksi.getConnection().createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int book_id  = rs.getInt("book_id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String isbn = rs.getString("isbn");
                int stock   = rs.getInt("stock");
                String keyid =rs.getString("key_id");

              
                Fiction fiction = new Fiction(book_id, name, (int) price, isbn, stock, keyid);
                listFiction.add(fiction);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listFiction;
    }

    @Override
    public void save(Fiction t) {
    
    }

    @Override
    public void update(Fiction t) {
    String sql = "UPDATE fiction SET book_id =?, name =?, price =?, isbn =?, stock =? WHERE key_id =?";
     try {
         PreparedStatement pstmt = Koneksi.getConnection().prepareStatement(sql);
         pstmt.setInt(1, t.getIdBuku());
         pstmt.setString(2, t.getJudul());
         pstmt.setInt(3, t.getPrice());
         pstmt.setString(4, t.getIsbn());
         pstmt.setInt(5, t.getStock());
         pstmt.setString(6, t.getkeyid());
        
       
        } catch (Exception e) {
            e.printStackTrace();
        }
 
               
 }

    @Override
    public void delete(Fiction t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}