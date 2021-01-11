/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkassess;

/**
 *
 * @author zhirobyte
 */
public class doublelinkasses2 {
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
public class Doublelinkassess2 {
    Node head;

       
    /**
     * @param args the command line arguments
     */
   
    
    // 
    
        
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
            if(current.node == value) {  
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
    public static void main(String[] args) 
    { 
     
     /* Start with the empty list */
        doublelinkaasess2 dll = new doublelinkasssess2(); 
        
        
        //NOMER 8  =========================
        //tambah node setelah node kedua 
        dll.deleteNode(dll.head.next);
        System.out.println("");
        dll.printlist(dll.head);
        
    } 
}

    

    
    



  
    


    
}
