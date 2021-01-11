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
public class User {
       final String user;
        final String gender;
        final int usia;
        
        NodeUser prev;
        NodeUser next;
        
        
    public NodeUser (String new_user, int new_usia, String new_gender){
            this.user = new_user;
            this.usia = new_usia;
            this.gender = new_gender;
     
     }
    
    
    public int getIdUse() {
        return idUser;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }
    
    public String getnama() {
        return nama;
    }

    public void setkategori(String kategori) {
        this.kategori= kategori;
    }

    public String getkategori() {
        return kategori;
    }
    
    public void setsaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getsaldo() {
        return saldo;
    }
}
