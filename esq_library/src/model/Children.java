package model;

/**
 *
 * @author faiz hanafi 
 */
public class Children {
    
    private int idBuku;
    private String judul;
    private int price;
    private String isbn;
    private int stock;
    private String keyid;

    public Children() {
    }

    public Children(String judul,String isbn, String keyid) {
        this.judul = judul;
        this.isbn = isbn;
        this.keyid = keyid;
    }

    public Children(int idBuku, String judul, int price, String isbn, int stock, String keyid) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.price = price;
        this.isbn = isbn;
        this.stock = stock;
        this.keyid = keyid;
    }


    public Children(int idBuku) {
        this.idBuku = idBuku;
    }

    public Children(int idBuku, int stock) {
    this.idBuku = idBuku;
    this.stock = stock;
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
