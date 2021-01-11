/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfinal;
/**
 *
 * @author zhirobyte
 */
public class NodeUser {
  


 
        
     public void insertFirstUser(String new_user, int new_usia, String new_gender){ 
		
		NodeUser new_NodeUser = new NodeUser(new_user, new_usia, new_gender);
       
		new_NodeUser.next = head1; 
		new_NodeUser.prev = null; 

		if (head1 != null) 
                head1.prev = new_NodeUser; 
		head1 = new_NodeUser; 
    }
         
        
}
