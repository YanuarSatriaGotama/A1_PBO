package Posttest3;

public class Studiofoto {
    //atribut
    private String nama;
    private String Jenis_foto;
    private long no_telp;
    private String ukuran;
   
    
    private void setnama(String nama){
        this.nama = nama;
    }
    private void setJenis_foto(String Jenis_foto){
        this.Jenis_foto = Jenis_foto;
    }
    private void setno_telp(long no_telp){
        this.no_telp = no_telp;
    }
    private void setukuran(String ukuran){
        this.ukuran = ukuran;
    }
    private String getnama(){
        return this.nama;
    }
    private String getJenis_foto(){
        return this.Jenis_foto;
    }    
    private long getno_telp(){
        return this.no_telp;
    }
    private String getukuran(){
        return this.ukuran;
    }    
    
    
    public void Studio(String nama, String Jenis_foto, long no_telp, String ukuran){
        setnama(nama);
        setJenis_foto(Jenis_foto);
        setno_telp(no_telp);
        setukuran(ukuran);
    }
    
    public void lihat(){
        System.out.print("Nama          : ");
        System.out.println(getnama());
        System.out.print("Jenis Foto    : ");
        System.out.println(getJenis_foto());
        System.out.print("Nomor Telepon : ");
        System.out.println(getno_telp());
        System.out.print("Ukuran Foto   : ");
        System.out.println(getukuran());
        System.out.print("Note! ");
    }
     
//    Studiofoto(String fajri, String praWedding, int i) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    //method
    void method1(){
        System.out.println("Pelanggan Bisa Merequest Ukuran Foto");
    }
    void method2(){
        System.out.println("Pelanggan Bisa Melihat Hasil Foto");
    }
}

