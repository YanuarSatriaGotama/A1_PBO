/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest2;

/**
 *
 * @author Acer
 */
public class barangLab {

    static void add(barangLab dataNew) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static Object get(int b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String namaPeminjam;
    String barang;
    String tempat;
    Long banyak;
    String kondisi;
    
    //constructor
    public barangLab(String namaPeminjam, String barang, String tempat, Long banyak, String kondisi){
        this.namaPeminjam = namaPeminjam;
        this.barang = barang;
        this.tempat = tempat;
        this.banyak = banyak;
        this.kondisi = kondisi;
    }

    barangLab() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    void tampilData() {
        System.out.println("Nama Peminjam        : "+ this.namaPeminjam);
        System.out.println("Barang               : "+ this.barang);
        System.out.println("Letak Asal Barang    : "+ this.tempat);
        System.out.println("Banyak yang dipinjam : "+ this.banyak);
        System.out.println("Kondisi barang       : "+ this.kondisi);
    }

}
