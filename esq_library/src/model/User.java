/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author zhiro
 */
public class User {
   
    private int idUser;
    private String nama;
    private String kategori;
    private int saldo;
    private int balance;
   

    public User() {
    }

    public User(String nama,String kategori) {
        this.nama = nama;
        this.kategori = kategori;
    }

    public User(int idUser, String nama, String kategori,int saldo) {
        this.idUser = idUser;
        this.nama = nama;
        this.kategori = kategori;
        this.saldo = saldo;
    }

    public User(int idUser) {
        this.idUser = idUser;
    }

    public User(String nama, String kategori, int saldo) {
  
    }
    public int getIdUser() {
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
