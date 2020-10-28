/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Andika Sundawijaya
 */
public class Buku {
    
    private int idBuku;
    private String judul;
    private String pengarang;

    public Buku() {
    }
    
    //penambahan agar hanya id saja bisa masuk
    public Buku(int idBuku) {
        this.idBuku = idBuku;
    }

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public Buku(int idBuku, String judul, String pengarang) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
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

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

}
