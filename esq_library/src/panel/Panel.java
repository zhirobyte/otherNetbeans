/*21

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;


import java.sql.*;
import daomodel.ChildrenDao;
import daomodel.FictionDao;
import daomodel.HistoryDao;
import daomodel.UserDao;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import model.Children;
import model.Fiction;
import model.History;
import model.User;
import static panel.BugInfo.auth;
import static panel.BugInfo.bug;
import static panel.Option.showChildren;
import static panel.Option.showFiction;
import static panel.Option.showHistory;
import static panel.Pinjam.usertable;

/**
 *
 * @author faiz hanafi
 */
public class Panel {

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

 public static void main(String[] args) {
   loginAdmin();
 }
 
    public static void loginAdmin(){
        /*
        sebuah function ini ditampilkan dalam awal sebuha program unutk memebrikan user authentication 
        hanya admin user super user yang dapat mengakases aplikasi library ini
        */
     Scanner input = new Scanner (System.in);
        String username, password;
        System.out.println("--------+[ Assalamualaikum Warrahmatullahi Wabarakatuh]+--------");
        System.out.println("--------+[    Selamat datang di aplikasi esq library  ]+--------");
        System.out.println("---------[============================================]---------");
        System.out.print("  >>>  Masukkan Username anda :");
        username = input.nextLine();
        System.out.print("  >>>  Masukkan Password anda :");
        password = input.nextLine();
        if(username.equals("admin") && (password.equals("root"))){
            System.out.println("---------[=== LOGIN BERHASIL ====]---------");
             showMenu();
        }else 
            System.out.println("Data yang anda masukkan salah ");{
        loginAdmin();
    }
       
    }

   
    static void showMenu() {
        /*
        dalam show menu setelah masuk ini saya memberikan sentuhan dalam interface
        dengan menambahkan berabgai macam output line dengan kombinasi karakter dan symbol
        saya membuat hal in semata mata untuk memebrikan kesan elegan dalam apliaksi saya 
        saya tidak menggunakan java berbasi GUI karena dalam pembelajaran ini say ingin benar2 
        memahami logic dalam setiap alur perjalanan aplikasi
        */
        int pilihan = 0;
        do {
            System.out.println("-----------------------------------------------------------------------------------+");        
            System.out.println("+--------------------------------------------+");        
            System.out.println("+---oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo-+");
            System.out.println("+   |_________|{=========}      // / /{=========}    *******  %%%%%%%%%   |#|-----+");
            System.out.println("+   |_Science_|{_________}     // / / |_________| {_biology_} {_________} |#|------+");
            System.out.println("+   |_________|{_________}    // / /  |_Children_|{_________} {_islamic_} |#|-----+");
            System.out.println("+   |_________|{_geology_}   // / /   | _________|{_history_} |_________| |#|-----+");
            System.out.println("+---ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo-+");        
            System.out.println("                                      _          __                          [][][][]");               
            System.out.println("                               ,-----' |   _   <'__`                          |||||  ");              
            System.out.println("                               | //  : | -'     )o }}                         ||||| " );
            System.out.println("                               | //  : |  ---   {__;`                         ||||| " );
            System.out.println("                               | //  : | -._      |))                         ||||| " );     
            System.out.println("                               `-----._|     __  // ( )|                      ||||| " );      
            System.out.println("                                _/___|_    //)_`//  | ||]                     ||||| ");          
            System.out.println("                          ____[________]_[~~-_ (.L_/  ||                      ||||| ");
            System.out.println("                         [____________________]' _`_,/'/  <--->               ||||| ");
            System.out.println("                         ||| /          |||  ,___,'./ /   {^ ^}  {}           ||||| ");
            System.out.println("             ============||| |         |||,'______|  /    {   } //            ||||| ");
            System.out.println("            /            ||| |          /|| I==||  _      | | |//             ||||| ");
            System.out.println("]==========/             ||| |       __/_||  __||_        (_)(_)              ||||| ");
            System.out.println("+---oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo-+");        
            System.out.println("+---oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo-+");
            System.out.println("+---       SILAHKAN PILIH MENU BUKU        ---+");        
            System.out.println("####### [1] Pilih jenis buku           #######");
            System.out.println("####### [0] Keluar                     #######");
            System.out.println("-[============================================]-");
            System.out.println("");
            System.out.print("#######>>> ");

            try {
                pilihan = Integer.parseInt(input.readLine());

                switch (pilihan) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        showCategory();
                        break; 
                    default:
                        System.out.println("Pilihan salah!");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (pilihan != 0);
    }

    static void showCategory() {
        System.out.println("+--------------------------------+");
        System.out.println("|    DATA BUKU PERPUSTAKAAN      |");
        System.out.println("+--------------------------------+");
        System.out.println("----------------------------------");
        int pilihan = 0;
        do {
            /*
            pilihan untuk melihat tampilan databse dari jenis dan kategory buku yang tesedi adalm perpustakaan 
            */
            System.out.println("\n========= MENU UTAMA =========");
            System.out.println("[1]Buku Anak        [5]BUG and Info");
            System.out.println("[2]Buku Sejarah     [6]Author");
            System.out.println("[3]Buku Fiksi       ");
            System.out.println("[4]User Tables      ");
            System.out.println("0. Keluar");
            System.out.println("--------------------------------");
            System.out.print("PILIHAN> ");
            try {
                pilihan = Integer.parseInt(input.readLine());
                switch (pilihan) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        showChildren();
                        break;
                    case 2:
                        showHistory();
                        break;
                    case 3:
                        showFiction();
                        break;                        
                    case 4:
                        usertable();                                    
                    case 5:
                        bug();
                        break;
                    case 6:
                        auth();
                     break;
                    default:
                        System.out.println("Pilihan salah!");
                }       
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } while (pilihan != 0);
        }
    
}




