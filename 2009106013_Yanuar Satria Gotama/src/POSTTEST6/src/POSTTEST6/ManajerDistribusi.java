package POSTTEST6;

public class ManajerDistribusi extends Manajer{
    
    public ManajerDistribusi(String nama, int id, String noTelp, String email) {
        super(nama, id, noTelp, email);
    }
    
    static void nota(String tanggal){
        System.out.println("Manajer membuat Nota pada tanggal " +tanggal);
    }
    static void bawa(){
        System.out.println("Manajer membawa Nota ke Admin");
    }

    static void nota(String tanggal, String distribusi){
        System.out.println("Manajer membuat Nota " +distribusi+ " pada tanggal" +tanggal);
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
