/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author user
 */
public class Studiofoto {
    //atribut
    String nama;
    String Jenis_foto;
    long no_telp;
    String ukuran;
   
    //konstruktor
    public Studiofoto(String nama, String Jenis_foto, long no_telp, String ukuran){
        this.nama = nama;
        this.Jenis_foto = Jenis_foto;
        this.no_telp = no_telp;
        this.ukuran = ukuran;
    }

    Studiofoto(String fajri, String praWedding, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //method
    void method1(){
        System.out.println("Pelanggan Bisa Merequest Ukuran Foto");
    }
    void method2(){
        System.out.println("Pelanggan Bisa Melihat Hasil Foto");
    }
}
