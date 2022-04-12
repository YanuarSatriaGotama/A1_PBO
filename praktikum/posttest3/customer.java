package posttest3;

public class customer {
    private String nama;
    private String jenislaun;
    private String alamat;
    private String tanggal;
    
    private void setnama(String nama){
        this.nama = nama;
    }
    private void setjenislaun(String jenislaun){
        this.jenislaun = jenislaun;
    }
    private void setalamat(String alamat){
        this.alamat = alamat;
    }
    private void settanggal(String tanggal){
        this.tanggal = tanggal;
    }
    
    private String getnama(){
        return this.nama;
    }
    private String getjenislaun(){
        return this.jenislaun;
    }
    private String getalamat(){
        return this.alamat;
    }
    private String gettanggal(){
        return this.tanggal;
    }
    
    public void hasil(){
        System.out.println("Nama\t\t:"+getnama());
        System.out.println("Jenis Laundry\t:"+getjenislaun());
        System.out.println("Alamat\t\t:"+getalamat());
        System.out.println("Tanggal\t\t: "+gettanggal());
    
    }
    
    public void panggil(String nama, String jenislaun, String alamat, String tanggal){
    setnama(nama);
    setjenislaun(jenislaun);
    setalamat(alamat);
    settanggal(tanggal);
    }  
    
    void databenar(){
    System.out.println("Data Customer benar");
    }
    void datasalah(){
    System.out.println("Data Customer Salah");
    }
    

}

    

