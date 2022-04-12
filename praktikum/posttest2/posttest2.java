package posttest2;

class datacust{
    String nama;
    String jenislaun;
    String alamat;
    String tanggal;
    
    public datacust(String nama,String jenislaun, String alamat, String tanggal){
    this.nama = nama;
    this.jenislaun = jenislaun;
    this.alamat = alamat;
    this.tanggal = tanggal;
    }
    void databenar(){
    System.out.println("Data Customer benar");
    }
    void datasalah(){
    System.out.println("Data Customer Salah");
    }
}
