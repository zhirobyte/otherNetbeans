/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomodel;

import dao.Dao;
import database.Koneksi;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author zhiro
 */
public class UserDao implements Dao<User> {

    @Override
    public List<User> getAll() {
        String sql = "SELECT * FROM User";
        List<User> listUser = new ArrayList<>();
        ResultSet rs;
        
        try {
            Statement stmt = Koneksi.getConnection().createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int user_id  = rs.getInt("user_id");
                String name = rs.getString("name");
                String category = rs.getString("category");
                int balance  = rs.getInt("balance");
                
                
                User user = new User(user_id, name,category,balance);
                listUser.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listUser;
    }

    @Override
    public void save(User t) {
        String sql = "INSERT INTO  user (user_id, name, category, balance) VALUES (?, ?, ?, ?)";
        try {
         PreparedStatement pstmt = Koneksi.getConnection().
         prepareStatement(sql);
         pstmt.setInt(1, t.getIdUser());
         pstmt.setString(2, t.getnama());
         pstmt.setString(3, t.getkategori());
         pstmt.setInt(4, t.getsaldo());
         pstmt.executeUpdate();
       
        } catch (Exception e) {
            e.printStackTrace();
        }
 
                
    }

    @Override
    public void update(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



   
}
