package POSTTEST6;
public class ManajerGudang extends Manajer {
    public ManajerGudang(String nama, int id, String noTelp, String email) {
        super(nama, id, noTelp, email);
    }
    
    static void pantau(){
        System.out.println("Manajer memantau Gudang");
    }
    
    static void lapor(String tanggal){
        System.out.println("Manajer membuat laporan barang gudang pada tanggal " +tanggal);
    }

    static void lapor(String tanggal, String barang){
        System.out.println("Manajer sedang membuat laporan cek " +barang+ " pada tanggal " +tanggal);
    }
    
    
}
