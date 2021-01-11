/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author faiz hanafi 
 */
public class History {
    
    private int idBuku;
    private String judul;
    private int price;
    private String isbn;
    private int stock;
    private String B_KEY;
    private String keyid;
    public History() {
    }

    public History(String judul,String isbn, String B_KEY) {
        this.judul = judul;
        this.isbn = isbn;
        this.B_KEY = B_KEY;
    }

    public History(int idBuku, String judul, int price, String isbn, int stock, String keyid) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.price = price;
        this.isbn = isbn;
        this.stock = stock;
        this.keyid = keyid;
    }


    public History(int idBuku) {
        this.idBuku = idBuku;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int stock) {
        this.price = price;
    }
    
        public String getkeyid() {
        return keyid;
    }

    public void setkeyid(String keyid) {
        this.keyid = keyid;
    }

    

}
