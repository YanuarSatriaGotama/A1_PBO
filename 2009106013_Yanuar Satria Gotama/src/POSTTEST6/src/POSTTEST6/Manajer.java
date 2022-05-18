/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST6;
abstract class Manajer implements Karyawan{
    static String nama;
    private int id;
    static String noTelp;
    static String email;
    
    Manajer(String nama, int id, String noTelp, String email){
        this.nama = nama;
        this.id = id;
        this.noTelp = noTelp;
        this.email = email;
    }
    
    public void setNama(String Nama){
        this.nama = Nama;
    }
    public void setId(int Id){
        this.id = Id;
    }
    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getNama(){
        return nama;
    }
    public int getId(){
        return id;
    }
    public String getNoTelp(){
        return noTelp;  
    }
    public String getEmail(){
        return email;  
    }
    
    @Override
    public void lapor(){
        System.out.println("Manajer membuat laporan");
    }
    
    
    @Override
    public void bekerja(){
        System.out.println("Manajer sedang aktif bekerja");
    }
    
}
