/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import daomodel.ChildrenDao;
import daomodel.FictionDao;
import daomodel.HistoryDao;
import daomodel.UserDao;
import database.Koneksi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import model.Children;
import model.Fiction;
import model.History;
import model.User;
import static panel.Option.listAll;
import static panel.Panel.fiction;
import static panel.Panel.input;
import static panel.Panel.showCategory;
import static panel.Pinjam.backMenu;
import static panel.userInput.fiction;
//
///**
// *
// * @author zhiro
// */
public class userInput {


    
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    static ChildrenDao childrenDao = new ChildrenDao();
    static Children children;
    static HistoryDao historyDao = new HistoryDao();
    static History history;
    static FictionDao fictionDao = new FictionDao();
    static Fiction fiction;
    static User user;
    static UserDao userDao = new UserDao();
    /*
    dekslarasi varibale dalam sebuah methode 
    yang dideklarasikan dalam bentuk public agar dapat dipanggil antar method
    yang berbeda dalam suatu kelas 
    */
    public static int price;
    public static int stock;
    public static String name;
    public static String isbn;
    public static String key_id;
    public static int book_id;
    public static int jumBuku;
    public static int total;
    public static String opsiClient;
    public static String user_id;
    public static String category;
    public static int akhir;
    public static int saldo;
    public static String nama;
    public static int balance;
    public static int minus;
    public static int diskon;
    public static int diskon1;
    public static int jumKitab;
    private static int sisa;
    private static int idBuku;
    private static String keyid;
    private static String Judul;
    private static String judul;
    
////////////////////////================================/////////////////////////
    
     static void userinput() {
    //digunakan untuk mengambil suatu data menggunakan query       
            try{
                Scanner input = new Scanner (System.in);
                System.out.print("Masukkan nama anda :");
                nama = input.nextLine();
                String sql = "SELECT * FROM user WHERE name = '"+nama+"'"; 
                ResultSet rs;
                    Statement stmt = Koneksi.getConnection().createStatement();
                    rs = stmt.executeQuery(sql);
                while (rs.next()){
//                /*
//                    sebuah fucntion untuk memilih dan menampilkan 
//                    user dan admin yang digunakan dalam meminjam buku 
//                    yang ingin digunakan
//                    */
                System.out.println(("-----[hasil pencarian]-----"));
                System.out.println(("[NO]-[   NAME  ][CATEGORY][      SALDO    ]-"));
                System.out.print(rs.getString("user_id" )+"\t");
                System.out.print(rs.getString("name")+"\t");
                System.out.print(rs.getString("category")+"\t");
                System.out.println(rs.getInt("balance")+"\t");
                 balance = rs.getInt("balance");
                 category = rs.getString("category");
                  System.out.println("=====================================");
                  }   
                
                }catch (Exception e) {
               e.printStackTrace();
        } 
            {userPinjam();        }
    }
    
        static void userPinjam(){
           Scanner input = new Scanner (System.in);
              
//               /*
//                dalam method ini saya menggunakan if else dimana sebuah query dapat dipanggil dengan mudah tanpa harus memindahkan
//                kedalam sebuah claas lain, demi mempersingkat pemanggilan user input saat mmemilih kategori buku 
//                dan memimnam dengan directly dalam satu method
//                */
                {       
                listAll();
                }
                System.out.print("Masukkan kode buku :");
                String code = input.nextLine();
                
                if(code.equals("C1") || code.equals ("C2") || code.equals("C3") || code.equals("C4") || code.equals("C5") || code.equals("C6") ){
                    try{
                        
                    //ini digunakan untuk memilih query dalam sql dengan memanggil user input berdasarkan KEY dalam database
                    String sql = "SELECT * FROM children WHERE key_id  ='"+code+"'"; 
                    ResultSet rs;
                    Statement stmt = Koneksi.getConnection().createStatement();
                    rs = stmt.executeQuery(sql);

                    while (rs.next()){
                    System.out.println("No.|         Judul            |    Harga   |      Isbn        | Stock| KEY |");
                    System.out.println("+----------------------------------------------------------------------------+");        
                    System.out.print(rs.getInt("book_id" )+"\t");
                    System.out.print(rs.getString("name")+"\t");
                    System.out.print(rs.getInt("price")+"\t");
                    System.out.print(rs.getString("isbn")+"\t");
                    System.out.print(rs.getInt("Stock")+"\t");
                    System.out.println(rs.getString("key_id")+"\t");
                    System.out.println("+-----------------------------------------------------------------------------+");
                    book_id = rs.getInt("book_id");
                    name = rs.getString("name");
                    price = rs.getInt("price");
                    isbn = rs.getString("isbn");
                    stock = rs.getInt("stock");
                    key_id = rs.getString("key_id");                       
                
                    }                
                }catch (Exception e) {
               e.printStackTrace();
                }                 
                }else if(code.equals("H1") || code.equals ("H2") || code.equals("H3") || code.equals("H4") || code.equals("H5") || code.equals("H6") ){
                    try{
                        
                    //ini digunakan untuk memilih query dalam sql dengan memanggil user input berdasarkan KEY dalam database
                    String sql = "SELECT * FROM history WHERE key_id  ='"+code+"'"; 
                    ResultSet rs;
                    Statement stmt = Koneksi.getConnection().createStatement();
                    rs = stmt.executeQuery(sql);

                    while (rs.next()){
                    System.out.println("No.|         Judul            |    Harga   |      Isbn        | Stock| KEY |");
                    System.out.println("+----------------------------------------------------------------------------+");        
                    System.out.print(rs.getInt("book_id" )+"\t");
                    System.out.print(rs.getString("name")+"\t");
                    System.out.print(rs.getInt("price")+"\t");
                    System.out.print(rs.getString("isbn")+"\t");
                    System.out.print(rs.getInt("Stock")+"\t");
                    System.out.println(rs.getString("key_id")+"\t");
                    System.out.println("+-----------------------------------------------------------------------------+");        
                     book_id = rs.getInt("book_id");
                    name = rs.getString("name");
                    price = rs.getInt("price");
                    isbn = rs.getString("isbn");
                    stock = rs.getInt("stock");
                    key_id = rs.getString("key_id");                       
              
                    }                
                }catch (Exception e) {
               e.printStackTrace();
                } 
                }else if(code.equals("F1") || code.equals ("F2") || code.equals("F3") || code.equals("F4") || code.equals("F5") || code.equals("F6") ){
                    try{
                        
                    //ini digunakan untuk memilih query dalam sql dengan memanggil user input berdasarkan KEY dalam database
                    String sql = "SELECT * FROM fiction WHERE key_id  ='"+code+"'"; 
                    ResultSet rs;
                    Statement stmt = Koneksi.getConnection().createStatement();
                    rs = stmt.executeQuery(sql);

                    while (rs.next()){
                    System.out.println("No.|         Judul          |    Harga   |      Isbn        | Stock| KEY |");
                    System.out.println("+------------------------------------------------------------------------+");        
                    System.out.print(rs.getInt("book_id" )+"\t");
                    System.out.print(rs.getString("name")+"\t");
                    System.out.print(rs.getInt("price")+"\t");
                    System.out.print(rs.getString("isbn")+"\t");
                    System.out.print(rs.getInt("Stock")+"\t");
                    System.out.println(rs.getString("key_id")+"\t");
                    System.out.println("+-----------------------------------------------------------------------+"); 
                    book_id = rs.getInt("book_id");
                    name = rs.getString("name");
                    price = rs.getInt("price");
                    isbn = rs.getString("isbn");
                    stock = rs.getInt("stock");
                    key_id = rs.getString("key_id");                       
              
                    }
                    
                }catch (Exception e) {
               e.printStackTrace();
                }
                  
                }else{
                    System.out.println("Input yang anda masukkan salah!");
                    userPinjam();
                }
//                
//                /* sebuah fungsi ini digunakan untuk membuat sebuha kalkulasi dari perhitungan 
//                balance, saldo dan harga dari jumlah buku yang dipinjam dalam berbagai user yang dioutputkan
//                */
//                
                System.out.println("-----------------------------------");
                System.out.print("Masukkan Jumlah buku yang diinginkan:");
                jumBuku = input.nextInt();                
                System.out.println("-----------------------------------");
                sisa = stock - jumBuku;

                    if(jumBuku >= stock){
                        System.out.println("maaf stok tidak tersedia dalam jumlah tersebut");
                        System.out.println("Silahkan Coba Lagi");
                        userPinjam();
                    }else{
                     userCal();                  
                    }   
        }
        static void userCal(){
                
                Scanner in = new Scanner (System.in);
                int rego = price*jumBuku;
                jumKitab += jumBuku;
                total  += rego ;
                minus = stock-jumBuku;
                diskon = (total *20)/100;
                diskon1 = (total *25)/100;
                if(category.equals("A") && (jumBuku > 2)){
                    System.out.println(diskon);
                }else if (category.equals("B") && (jumBuku > 2)){
                    System.out.println(diskon1);
                }
               if (category.equals("A")){
                int sisa = balance - total;
                System.out.println("Jumlah sisa saldo anda : Rp." +sisa);
                System.out.println("==============================+");
                System.out.println(" Rincian Hasil Peminjaman Buku ");                 ;
                System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");;
                System.out.println(" _______________________________");
                System.out.println("");
                System.out.println("|*| Nama User    :  " +nama );
                System.out.println("|*| Jumlah Pinjam:  " +jumKitab );
                System.out.println("|*| Biaya Total  :Rp." +total   );
                System.out.println("|*| Kategory     :  " +category );
                System.out.println("________________________________");
                System.out.println("|*| Potongan Harga :Rp." +diskon );
                System.out.println("");
                System.out.println("");
                System.out.println("            by admin");
                System.out.println("          ESQ LIBRARY         ");
                System.out.println("==============================+");
                }else{
                int sisa = balance - total;
                System.out.println("Jumlah sisa saldo anda : Rp." +sisa);
                System.out.println("==============================+");
                System.out.println(" Rincian Hasil Peminjaman Buku ");                 ;
                System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");;
                System.out.println(" _______________________________");
                System.out.println("");
                System.out.println("|*| Nama User    :  " +nama );
                System.out.println("|*| Jumlah Pinjam:  " +jumKitab );
                System.out.println("|*| Biaya Total  :Rp." +total   );
                System.out.println("|*| Kategory     :  " +category );
                System.out.println("________________________________");
                System.out.println("|*| Potongan Harga :Rp." +diskon1 );
                System.out.println("[--------------------------------]");
                System.out.println("");
                System.out.println("            by admin");
                System.out.println("          ESQ LIBRARY         ");
                System.out.println("==============================+");
                }
                System.out.println("+[]===================================[]+");
                System.out.println("Pinjam lagi? :");
                System.out.println("[1] Ya tentu");
                System.out.println("[2] Nope, Sudah Cukup");
                System.out.println("+------------------------------------+");
                System.out.print(">>> Y/N :");                                         
                             
                    int press = 0;
                      do {
                        try {
                          press = Integer.parseInt(input.readLine());

                          switch (press) {
                              case 1:
                              userPinjam();
                              break;
                              case 2:
                              showCategory();
                              break;
                              default:
                               System.out.println("Pilihan salah!");
                                }
                           
                      } catch (Exception e) {
                          e.printStackTrace();
                      }

                  } while (press != 0);
        }
        
       
}   


        

 


