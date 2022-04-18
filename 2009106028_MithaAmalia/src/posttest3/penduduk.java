package posttest3;
public class penduduk {
    //encapsulasi & atribut
    private long nik;
    private String nama, tempatLahir, tanggalLahir, sex, agama, status, pekerjaan, alamat;
    
    //method khusus
    penduduk (long nik, String nama, String tempatLahir, String tanggalLahir, String sex, String agama, String status, String pekerjaan, String alamat){
        this.nik = nik;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.sex = sex;
        this.agama = agama;
        this.status = status;
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
    }
    
    //method
    void dataDitambah() {
        System.out.println("Data Telah Ditambahkan !");
    }

    void dataDiubah() {
        System.out.println("Data Telah Diubah !");
    }

    
    //setter & getter
    public long getNik() {
        return nik;
    }

    public void setNik(long nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
