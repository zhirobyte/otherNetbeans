/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublelinktugas;
import java.util.LinkedList;




/**
 *
 * @author zhirobyte
 */
// Class for Doubly Linked List 
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author zhiro
 */
public class Doublelinktugas {
    Node head;

       
    /**
     * @param args the command line arguments
     */
   
       ///ini digunakan untuk membuat objek linked list---------
      //digunakan untuk menanmpung data mahasiswa nim dan nama
    // 
    
    private class Node {
        String nama;
        int nim;        
        Node prev; 
        Node next; 
  
        // Constructor to create a new node 
        // next and prev is by default initialized as null 
//NOMER [1]
        Node(String new_nama, int new_nim ) 
        { this.nama = new_nama;
          this.nim  = new_nim;
        }
    }
      //==========================================///
        
        
        ///menambahkan titik dalam bariasn depan linked list 
//NOMER [2]
        public void push (String new_nama, int new_nim){
        Node new_Node = new Node(new_nama, new_nim);
        
        new_Node.next = head;
        new_Node.prev = null;
        if (head != null)
            head.prev = new_Node;
        head = new_Node;
               
        }
        
        //menambahkan titik dibelakang list
 //NOMER [3] 
      public void append(String new_nama, int new_nim)
      {
       
       Node new_node = new Node(new_nama, new_nim);
       Node last = head;
       new_node.next = null;
       
       if (head == null){
       new_node.prev = null;
       head = new_node;
       return;
       }
       
       while(last.next != null)
           last = last.next;
       last.next = new_node;
       new_node.prev = last;
             
      }                  
        
        
//NOMER [7]
        public void InsertAfter (Node prev_Node,String new_nama, int new_nim){
        if (prev_Node == null){
        System.out.println("node sebelumnya tidak bisa berupa NULL ");
        return;
        }
        
        Node new_node = new Node(new_nama, new_nim);
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;
        
           if(new_node.next != null)
            new_node.next.prev = new_node;
        
                        }
        
       public void deleteNode(Node del)
        {

            if (head == null || del == null) {
                return;
            }

            if (head == del) {
                head = del.next;
            }
           if (del.next != null) {
                del.next.prev = del.prev;
            }
            if (del.prev != null) {
                del.prev.next = del.next;
            }

            return;
        }
      public void searchNode(int value) {  
        int i = 1;  
        boolean flag = false;  
        //Node current will point to head  
        Node current = head;  
  
        //Checks whether the list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Compare value to be searched with each node in the list  
            if(current.nim == value) {  
                flag = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        if(flag)  
             System.out.println("Node berada pada posisi  : " + i);  
        else  
             System.out.println("Node tidak ada dalam list");  
    }
      
      
      
      
    public void printlist(Node node) 
            
        {
        Node last = null;
        System.out.println("++-----------------------------------------");
        while (node != null) { 
            System.out.print("||"+ " "+node.nama + " "  + node.nim + " " + "-->" + ""); 
            last = node; 
            node = node.next; 
        } 
    }
    
    
    
    
    
    
    public static void main(String[] args) 
    { 
     
     /* Start with the empty list */
        Doublelinktugas dll = new Doublelinktugas(); 
        
        
        System.out.println("++ TUGAS DOUBLE LINKED LIST ++");
        System.out.println("++ NAMA : FAIZ HANAFI ++");
        System.out.println("++ NIM  : 1910130008  ++");
        //NOMER 1 ====================
        // Insert  at the beginning link node
        dll.push("Byte",53); 
        
        // Insert at the end link node.  
        dll.append("Zhiro",99); 
              
        System.out.println(""); 
        dll.printlist(dll.head); 
        
        //NOMER 2 =========================
        //tambah node didepan 
        dll.push("Aurora",23);       
        System.out.println(""); 
        dll.printlist(dll.head);
        
        
        //NOMER 3 =========================
        //tambah node dibelakang 
        dll.append("Horizon",20);       
        System.out.println(""); 
        dll.printlist(dll.head);
        
        
        //NOMER 4 =========================
        //tambah node didepan 
        dll.push("Finland",98);       
        System.out.println(""); 
        dll.printlist(dll.head);
        
        
        
        //NOMER 5 =========================
        //tambah node dibelakang 
        dll.append("light",86);       
        System.out.println(""); 
        dll.printlist(dll.head);
        
        
        //NOMER 6 =========================
        //tambah node setelah node kedua 
        dll.InsertAfter(dll.head.next,"Admin",45);       
        System.out.println(""); 
        dll.printlist(dll.head);
        
             
        //NOMER 7  =========================
        //tambah node setelah node kedua 
        dll.InsertAfter(dll.head.next,"User",76);       
        System.out.println(""); 
        dll.printlist(dll.head);
        
        
        
        //NOMER 8  =========================
        //tambah node setelah node kedua 
        dll.deleteNode(dll.head.next);
        System.out.println("");
        dll.printlist(dll.head);
        
        //NOMER 9 TALH TERASUK DALAM PROGRAM
        
        //NOMER 10============================
        System.out.println("Masukan nomer dicari");
        dll.searchNode(76);
        dll.searchNode(97);
    } 
}

    

    
    



  
    

