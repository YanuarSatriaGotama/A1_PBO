/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest2;

/**
 *
 * @author Windows10
 */
public class relawan{
    String nama;
    String devisirelawan;
    String emailrelawan;
    String alamat;
    
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
    
   
    
}
