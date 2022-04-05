/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest2;

/**
 *
 * @author LENOVO
 */
class Obat { // class Obat
    private int id;
    private String Nama;
    private String Jenis; // Properti/Atribut
    private int Stock;
    
    Obat(int id, String Nama, String Jenis, int Stock){ //Constructor
        this.id = id;
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Stock = Stock;
    }
    
    public int getid(){ // method
        return id;
    }
    public String getNama(){ // method
        return Nama;
    }
    public String getJenis(){ // method
        return Jenis;
    }
    public int getStock(){ // method
        return Stock;
    }
    public String toString(){ // method print
        return id+"\t"+Nama+"\t"+Jenis+"\t\t"+Stock;
    }
}
