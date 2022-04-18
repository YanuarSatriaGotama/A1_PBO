package POSTTEST2;



class kegiatan {
    String nama_kegiatan;
    String jam_kegiatan;
    String durasi_kegiatan;
    String ket_kegiatan;
    String nama;    


    public kegiatan(String nama_kegiatan,String jam_kegiatan,String durasi_kegiatan,String ket_kegiatan,String nama){
        this.nama_kegiatan = nama_kegiatan;
        this.jam_kegiatan = jam_kegiatan;
        this.durasi_kegiatan = durasi_kegiatan;
        this.ket_kegiatan = ket_kegiatan;
        this.nama = nama;
    }

    void sudah(){
        System.out.println("   Jadwal Sudah di laksanakan");

    }
    void belum(){
        System.out.println("   Jadwal Belum di laksanakan");
    }



}