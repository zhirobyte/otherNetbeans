/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfinal;

import java.util.Scanner;
import static NodeUser;
/**
 *
 * @author zhirobyte
 */
public class listUser {
        public void addNodeUser() {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nama User : ");
        String new_user = input.nextLine();
        System.out.print("Masukkan nama Gender : ");
        String new_gender = input.nextLine();
        System.out.print("Masukkan nama Usia : ");
        int new_usia = input.nextInt();
        
            NodeUser new_NodeUser = new NodeUser(new_user, new_usia, new_gender);
       
		new_NodeUser.next = head1; 
		new_NodeUser.prev = null; 

		if (head1 != null) 
                head1.prev = new_NodeUser; 
		head1 = new_NodeUser;  
    }
    
}
