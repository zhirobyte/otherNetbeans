/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import java.util.Scanner;
import static panel.Option.Deskripsi;
import static panel.Panel.input;
import static panel.Panel.showCategory;
import static panel.Panel.showMenu;
import static panel.Pinjam.loginNew;
import static panel.Pinjam.pinjamMenu;
import static panel.userInput.userPinjam;

/**
 *
 * @author zhiro
 */
public class BugInfo {
   Scanner in = new Scanner (System.in);
    
   static void bug(){
   System.out.println("Dalam pembuatan sebuah aplikasi ini terdapat berbagi macam bug dan kesalahan");
   System.out.println("kami menyadari bahwa sebuah tugas akhir ini dirasa masih sangat kurang maka ");
   System.out.println("sebagai sebuah dokumentasi saya melampirkan BUG LIST dalam aplikasi yang ");
   System.out.println("saya buat sebgai tugas akhir project makul OOP JAVA");
   System.out.println("[]----------------------------------------------------------------------[]");
   System.out.println("[1] INSERT USER (BUG) --- bug ini masih belum dapat diselesaikan ");
   System.out.println("[2] AUTO UPDATE (BUG) --- bug ini membuat database tidak dapat update ketika ada perubahan");   
            {
       showCategory();
               }  
   }
    static void auth(){
   System.out.println("+----------------------------+");
   System.out.println("|Created by Faiz Hanafi");
   System.out.println("|Prodi Computer Science");
   System.out.println("|NIM 1910130008");
   System.out.println("|______________________________");
   System.out.println("");
    
    
    }
   
}
