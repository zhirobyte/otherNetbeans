/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algojo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author zhirobyte
 */
public class Algojo {
  
    public static String nama;
    public static String barang;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
  
    Node head;
    
   private class Node{
   String akun;
   
   Node prev;
   Node next;
   
   Node(String new_akun){
   this.akun = new_akun;
   }
   }
 
   public void tambah(String new_akun)
   {
            Node new_node = new Node(new_akun);
            Node last = head;
            new_node.next = null;

            if (head == null){
            new_node.prev = null;
            head = new_node;
            return;
               }

            while (last.next != null)
            last = last.next;
            last.next = new_node;
            new_node.prev = last;
   }
   
   public void printlist(Node node)
   {
        Node last = null;
        while (node != null){

            System.out.println("");
            System.out.println(node.akun);
            last = node;
            node = node.next;

               }
   }
   
   /*---------------------------------------------------------------------------
   ini adalah batas negara yang harus diperhatikan untuk tugas ini woy
   */
   public static void main(String[] args)   
   {
    menuUtama();
   } 
   
     Scanner in = new Scanner (System.in);
        /*
     method ini digunakan untuk menu utana awal interface user
     >>>>>>>>>>>>>>>>>>     */     
     static void menuUtama(){
         
        int pilihan = 0;
        do {
            System.out.println("+---       SILAHKAN PILIH MENU            ---+");        
            System.out.println("####### [1] Tampilkan Semua Data       #######");                    
            System.out.println("####### [2] Masukkan Data User         #######");
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
                           
                    case 2:
                        addUser();
                        break;
                    default:
                        System.out.println("Pilihan salah!");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (pilihan != 0);
    }
     
     /*
     ini adlah method untuk after node
     */
     /*
     method ini digunakan untuk menampilkan semua data yang ada dalam stack
     >>>>>>>>>>>>>>>>>>     */      
  
   
   public static void addUser(){
            Algojo dll = new Algojo();
            Scanner in = new Scanner (System.in);
            System.out.println("Masukkan Nama");
            nama = in.nextLine();

             dll.tambah(nama); 
             dll.printlist(dll.head);  

   }
     
      
 }



