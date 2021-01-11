/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir;

import java.util.Scanner;
import static projectakhir.listUser.*;

/**
 *
 * @author zhirobyte
 */
public class ProjectAkhir {

    /**
     * @param args the command line arguments
     */
    
    
     
    public NodeUser head1;
    public NodeBarang head2;
    
    
     public static void main(String[] args){ 
		ProjectAkhir dll = new ProjectAkhir();
                
                dll.insertFirstUser("Andi", 20, "male");
                dll.insertFirstUser("Budi", 15, "male");
                dll.insertFirstUser("Susi", 14, "female");
                dll.insertFirstUser("duwi", 18, "female");
                dll.insertFirstUser("kita", 18, "female");
                dll.insertFirstUser("semua", 18,"male");
                dll.insertFirstUser("anjay", 18,"female");
                dll.insertFirstUser("huwa", 18, "male");
                dll.insertFirstUser("huwi", 18, "female");
                dll.insertFirstUser("kita", 18,"male");
                dll.insertFirstUser("zhiro", 18,"female");
                dll.insertFirstUser("zuri", 18, "male");
                dll.insertFirstUser("zoye", 18, "female");
                
                dll.insertFirstBarang("mouse");
                dll.insertFirstBarang("keyboard");
                dll.insertFirstBarang("monitor");
                dll.insertFirstBarang("CPU");
                
                Scanner input = new Scanner (System.in);
                int pilih = 0;
        do {
            System.out.println("");
            System.out.println ("=========== WELCOME TO PASAR REBO ========");
            System.out.println ("0. exit");
            System.out.println ("1. add User");
            System.out.println ("2. add Barang");
            System.out.println ("3. Tampilkan Seluruh Pembeli");
            System.out.println ("4. Tampilkan Seluruh Barang");
            System.out.println ("5. Search User");
            System.out.println("");
            System.out.print("PILIHAN> ");
            
            try {
                pilih = input.nextInt();
                
                switch (pilih){
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        dll.addNodeUser();
                        break;
                    case 2:
                        dll.addNodeBarang();
                        break;
                    case 3:
                        dll.displayForwardUser(dll.head1);
                        System.out.println("");
                        break;
                    case 4:
                        dll.displayForwardBarang(dll.head2);
                        System.out.println("");
                        break;
                    case 5:
                        dll.searchNodeUser();
                        break;
                    default:
                        System.out.println("Pilihan salah!");    
                }
                
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }while (pilih != 0);
                
                
                
    }
    
}
