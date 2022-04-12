/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest3;

public class relawan {
    private String nama;
    private String devisirelawan;
    private String emailrelawan;
    private String alamat;
    
    public relawan(){
        
    }
    
    public relawan(String nama, String devisirelawan, String emailrelawan, String alamat){
        this.nama = nama;
        this.devisirelawan = devisirelawan;
        this.emailrelawan = emailrelawan;
        this.alamat = alamat;
    }

    void masaaktif(){
        System.out.println("Relawan Aktif");
    }
    
    void masapensiun(){
        System.out.println("Relawan Sudah Pensiun");
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDevisirelawan() {
        return devisirelawan;
    }

    public void setDevisirelawan(String devisirelawan) {
        this.devisirelawan = devisirelawan;
    }

    public String getEmailrelawan() {
        return emailrelawan;
    }

    public void setEmailrelawan(String emailrelawan) {
        this.emailrelawan = emailrelawan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
