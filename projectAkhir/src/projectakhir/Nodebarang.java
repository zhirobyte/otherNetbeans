/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir;

/**
 *
 * @author zhirobyte
 */
public class Nodebarang {
            String barang;
        
        NodeBarang prev;
        NodeBarang next;
        
        private Nodebarang (String new_barang){
            this.barang = new_barang;
        
        }
        
        
        
    public void insertFirstBarang(String new_barang){ 
		
		NodeBarang new_NodeBarang = new NodeBarang(new_barang);
        
       
		new_NodeBarang.next = head2; 
		new_NodeBarang.prev = null; 

		if (head2 != null) 
                    head2.prev = new_NodeBarang; 
		head2 = new_NodeBarang; 
    }
}
