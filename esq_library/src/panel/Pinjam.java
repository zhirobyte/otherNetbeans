/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import daomodel.UserDao;
import database.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import model.Children;
import model.User;
import static panel.Panel.input;
import static panel.Panel.user;
import static panel.Panel.userDao;
import model.User;
import static panel.Panel.children;
import static panel.userInput.userinput;



/**
 *
 * @author zhiro
 */
public class Pinjam{
 static User user;
 static UserDao userDao = new UserDao();

   
     public static void pinjamMenu() {
          System.out.println("#####---+[   Silahkan Pilih User   ]+---#####");
          System.out.println("##### Pengguna Lama[        Press 1     #####]");
          System.out.println("##### Pengguna Baru[        Press 2     #####]");
          System.out.println("##### exit         [        Press 0     #####]");
          System.out.println("#####___________________________________#####");
          System.out.print("=====>>>");
     
          int press = 0;
            do {
        
            try {
                press = Integer.parseInt(input.readLine());

                switch (press) {
                    case 1:
                    loginOld();
                    break;
                    case 2:
                    loginNew();
                    break;
                    case 0:
                    System.exit(0);
                    break;
                    default:
                     System.out.println("Pilihan salah!");
                }

        
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } while (press != 0);
      

     }
      static void backMenu() {
           pinjamMenu();
       }

    private static void loginOld() {
      {
           userinput();
       }
        
    }
    public static void loginNew() {
        /*
        login ini digunakan unutk user baru yang akan ditambahkan dalam database 
        hanya user baru yang masuk dengan methode ini
        */
            try {
            System.out.print("Nama: ");
            String Nama = input.readLine().trim();
            System.out.print("Category: ");
            String kategori = input.readLine().trim();
            System.out.print("Balance: ");
            int saldo =Integer.parseInt(input.readLine().trim());
            user = new User(Nama, kategori, saldo);
            userDao.save(user);           
             
            System.out.println("Selamat penambahan berhasil :)");
            
         
            {pinjamMenu();}
       
             } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("silahkan masuk dengan akun lama");
    
    }
  public static void usertable() {
        System.out.println("No.|   Name   |   Category  |  Balance  |");
        System.out.println("+-----------------------------+");        
        List<User> listBuku = userDao.getAll();
        listBuku.forEach((User user) -> System.out.println(String.format("[%d]    %s   %s  %s |",
        user.getIdUser(),user.getnama(),user.getkategori(),user.getsaldo())));
        System.out.println("+------------------------------+");
      }

  
}

  
 

    
     

    



   