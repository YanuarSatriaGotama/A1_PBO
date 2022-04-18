
package POSSTEST3;



class kegiatan {
    private String nama_kegiatan;
    private String jam_kegiatan;
    private String durasi_kegiatan;
    private String ket_kegiatan;
    private String nama;    
    
    
    private void setnama(String nama){
        this.nama = nama;
    }
    
    private void setnama_kegiatan(String nama_kegiatan){
        this.nama_kegiatan = nama_kegiatan;
    }
    
    private void setjam_kegiatan(String jam_kegiatan){
        this.jam_kegiatan = jam_kegiatan;
    }
    
    private void setdurasi_kegiatan (String durasi_kegiatan){
        this.durasi_kegiatan = durasi_kegiatan;
    }
    
    private void setket_kegiatan(String ket_kegiatan){
        this.ket_kegiatan = ket_kegiatan;
    }
    
    
    private String getnama(){
        return this.nama;
    }
    
    private String getnama_kegiatan(){
        return this.nama_kegiatan;
    }
    
    private String getjam_kegiatan(){
        return this.jam_kegiatan;
    }
    
    private String getdurasi_kegiatan(){
        return this.durasi_kegiatan;  
    }
  
    private String getket_kegiatan(){
        return this.ket_kegiatan;
    }
    
    
    public void lihat(){
        System.out.println("   Nama Pemilik        = "+ getnama());
        System.out.println("   Nama Kegiatan       = "+ getnama_kegiatan());
        System.out.println("   Jam Kegiatan        = "+ getjam_kegiatan());
        System.out.println("   Durasi Kegiatan     = "+ getdurasi_kegiatan());
        System.out.println("   Keterangan Kegiatan = "+ getket_kegiatan());
        System.out.println("\n");

    }
    
    public void buat(String nama, String nama_kegiatan, String jam_kegiatan, String durasi_kegiatan, String ket_kegiatan){
        setnama(nama);
        setnama_kegiatan(nama_kegiatan);
        setjam_kegiatan(jam_kegiatan);
        setdurasi_kegiatan(durasi_kegiatan);
        setket_kegiatan(ket_kegiatan);
    }
}
