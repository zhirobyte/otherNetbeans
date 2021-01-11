/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package panel;

import java.util.List;
import model.Children;
import model.Fiction;
import model.History;
import static panel.Panel.childrenDao;
import static panel.Panel.fictionDao;
import static panel.Panel.historyDao;
import static panel.Panel.input;
import static panel.Panel.showCategory;
import static panel.Pinjam.backMenu;
import static panel.Pinjam.pinjamMenu;


public class Option {
    /*
    methode ini digunkan untuk memebrikan sebuah user option 
    dalam pemilihan buku apakah meminjam atau tidak 
    */
    public static void Deskripsi(){
            System.out.println("\n========= MENU UTAMA =========");
            System.out.println("Pinjam Buku? ");
            System.out.println("[1] Ya tentu ");
            System.out.println("[2] Tidak,kembali ");
            System.out.println("--------------------------------");
            System.out.print(">>> ");
            
    }
     static void showChildren() {
         /*
         methode ni digunakan untuk memberikan hasil output dari databse buku yag dipilih 
         sebuah database terkoneksi dengan program java, maka sebuah table akan ditampilkan dengan
         sebuah output yang diambil dengan database tabel children
         */
        System.out.println("No.|                  Judul            |    Harga   |        Isbn            | Stock| KEY |");
        System.out.println("+-------------------------------------------------------------------------------------------+");        
        List<Children> listBuku = childrenDao.getAll();
        listBuku.forEach(children -> System.out.println(String.format("[%d]%s  \t \t |Rp.%s | \t %s  |(%s)| %s |",
        children.getIdBuku(),children.getJudul(), children.getPrice(), children.getIsbn(), children.getStock(),children.getkeyid())));
        System.out.println("+-----------------------------------------------------------------------------------+");
         int pilihan = 0;
          do{
              {Deskripsi();
              }
            try {
                pilihan = Integer.parseInt(input.readLine());
                switch (pilihan) {
                    case 1:
                        pinjamMenu();
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
            
        } while (pilihan != 0);
    }
             
      
    static void showHistory() {
        /*
         methode ni digunakan untuk memberikan hasil output dari databse buku yag dipilih 
         sebuah database terkoneksi dengan program java, maka sebuah table akan ditampilkan dengan
         sebuah output yang diambil dengan database tabel history
         */
        List<History> listBuku = historyDao.getAll();
        System.out.println("No.|                  Judul            |    Harga   |        Isbn            | Stock| KEY |");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        listBuku.forEach(history -> System.out.println(String.format("[%d]%s  \t \t |Rp.%s | \t %s  |(%s)| %s |",
        history.getIdBuku(), history.getJudul(), history.getPrice(), history.getIsbn(), history.getStock(),history.getkeyid())));
        System.out.println("+-----------------------------------------------------------------------------------+");
         int pilihan = 0;
          do{     
              {Deskripsi();
              }
            try {
                pilihan = Integer.parseInt(input.readLine());
                switch (pilihan) {
                    case 1:
                        pinjamMenu();
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
            
        } while (pilihan != 0);
    }
        
        
    
    static void showFiction() {
        /*
         methode ni digunakan untuk memberikan hasil output dari databse buku yag dipilih 
         sebuah database terkoneksi dengan program java, maka sebuah table akan ditampilkan dengan
         sebuah output yang diambil dengan database tabel ficiton
         */
        List<Fiction> listBuku = fictionDao.getAll();
        System.out.println("No.|                  Judul            |    Harga   |        Isbn            | Stock| KEY |");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        listBuku.forEach(fiction -> System.out.println(String.format("[%d]%s  \t \t |Rp.%s | \t %s  |(%s)| %s |",
        fiction.getIdBuku(), fiction.getJudul(), fiction.getPrice(), fiction.getIsbn(), fiction.getStock(),fiction.getkeyid())));
        System.out.println("+-----------------------------------------------------------------------------------+");
        int pilihan = 0;
          do{     
              {Deskripsi();
              }
            try {
                pilihan = Integer.parseInt(input.readLine());
                switch (pilihan) {
                    case 1:
                        pinjamMenu();
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
            
        } while (pilihan != 0);
    }
    static void listAll(){
        System.out.println("No.|                  Judul            |    Harga   |        Isbn            | Stock| KEY |");
        System.out.println("+-------------------------------------------------------------------------------------------+");        
        List<Children> listBuku = childrenDao.getAll();
        listBuku.forEach(children -> System.out.println(String.format("[%d]%s  \t \t |Rp.%s | \t %s  |(%s)| %s |",
        children.getIdBuku(),children.getJudul(), children.getPrice(), children.getIsbn(), children.getStock(),children.getkeyid())));
        System.out.println("+-----------------------------------------------------------------------------------+");
        /////////////////////////////////////////////////////////==============================================
        System.out.println("No.|                  Judul            |    Harga   |        Isbn            | Stock| KEY |");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        List<History> listBook1 = historyDao.getAll();
        listBook1.forEach(history -> System.out.println(String.format("[%d]%s  \t \t |Rp.%s | \t %s  |(%s)| %s |",
        history.getIdBuku(), history.getJudul(), history.getPrice(), history.getIsbn(), history.getStock(),history.getkeyid())));
        System.out.println("+-----------------------------------------------------------------------------------+");
         /////======================================////////////////////////=======================================
        System.out.println("No.|                  Judul            |    Harga   |        Isbn            | Stock| KEY |");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        List<Fiction> listBook2 = fictionDao.getAll();
        listBook2.forEach(fiction -> System.out.println(String.format("[%d]%s  \t \t |Rp.%s | \t %s  |(%s)| %s |",
        fiction.getIdBuku(), fiction.getJudul(), fiction.getPrice(), fiction.getIsbn(), fiction.getStock(),fiction.getkeyid())));
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.println("                  Silahkan pilih buku bersesuai pilihan anda              :) ");
    }
            
}



