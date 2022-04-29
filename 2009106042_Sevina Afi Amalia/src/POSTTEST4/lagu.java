/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST4;

/**
 *
 * @author asus
 */
public class lagu {
    protected String judul_lagu;
    protected String pny;
    protected String genre;
    protected String tahun_rilis;
    
    
    public lagu(String judul_lagu, String pny, String genre, String tahun_rilis){
        this.judul_lagu = judul_lagu;
        this.pny = pny;
        this.genre = genre;
        this.tahun_rilis = tahun_rilis;
    }
    void nyalakanLagu(){
        System.out.println("Lagu sedang dinyalakan....");
    }
    void matikanLagu(){
        System.out.println("Lagu dimatikan....");
    }

    protected String getJudul_lagu() {
        return judul_lagu;
    }

    protected void setJudul_lagu(String judul_lagu) {
        this.judul_lagu = judul_lagu;
    }

    protected String getPny() {
        return pny;
    }

    protected void setPny(String pny) {
        this.pny = pny;
    }

    protected String getGenre() {
        return genre;
    }

    protected void setGenre(String genre) {
        this.genre = genre;
    }

    protected String getTahun_rilis() {
        return tahun_rilis;
    }

    protected void setTahun_rilis(String tahun_rilis) {
        this.tahun_rilis = tahun_rilis;
    }
    
    public void tampil(){
        System.out.println("Judul lagu      : "+getJudul_lagu());
        System.out.println("Nama penyanyi   : "+getPny());
        System.out.println("Genre lagu      : "+getGenre());
        System.out.println("Tahun rilis     : "+getTahun_rilis());
    }
    
    
}   
    

