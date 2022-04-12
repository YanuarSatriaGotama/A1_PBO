
import java.util.*;
import java.io.*;

class Pendidikan{
    private int NSPSN;
    private String NamaSatuanPendidikan;
    private String alamat;
    private String Kelurahan;
    private String Status;

    Pendidikan(int NSPSN,String NamaSatuanPendidikan,String alamat,String Kelurahan,String Status){
        this.NSPSN=NSPSN;
        this.NamaSatuanPendidikan=NamaSatuanPendidikan;
        this.alamat=alamat;
        this.Kelurahan=Kelurahan;
        this.Status=Status;
    }
    int getNSPSN(){
        return NSPSN;
    }

    String getNamaSatuanPendidikan(){
        return NamaSatuanPendidikan;
    }

    String getAlamat(){
        return alamat;
    }

    String getKelurahan(){
        return Kelurahan;
    }

    String getStatus(){
        return Status;
    }

    void setNSPSN(int NSPSN){
        this.NSPSN=NSPSN;
    }

    void setNamaSatuanPendidikan(String NamaSatuanPendidikan){
        this.NamaSatuanPendidikan=NamaSatuanPendidikan;
    }

    void setAlamat(String Alamat){
        this.alamat = Alamat;
    }

    void setKelurahan(String Kelurahan){
        this.Kelurahan = Kelurahan;
    }

    void setStatus(String Status){
        this.Status = Status;
    }
}

class Kesehatan{
    private String NamaFasilitasKesehatan;
    private String TipeFaskes;
    private String Alamat;
    private String nomorfaskes;
    
    Kesehatan(String nomorfaskes,String NamaFasilitasKesehatan,String TipeFaskes,String Alamat){
        this.NamaFasilitasKesehatan = NamaFasilitasKesehatan;
        this.TipeFaskes=TipeFaskes;
        this.Alamat = Alamat;
        this.nomorfaskes = nomorfaskes;
    }

    //Setter
    void setNamaFasilitasKesehatan(String NamaFasilitasKesehatan){
        this.NamaFasilitasKesehatan = NamaFasilitasKesehatan;
    }

    void setTipeFaskes(String TipeFaskes){
        this.TipeFaskes = TipeFaskes;
    }
    void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    void setNomorFaskes(String nomorfaskes){
        this.nomorfaskes = nomorfaskes;
    }

    //Getter
    String getNamaFasilitasKesehatan(){
        return NamaFasilitasKesehatan;
    }

    String getTipeFaskes(){
        return TipeFaskes;
    }

    String getAlamat(){
        return Alamat;
    }

    String getnomorfaskes(){
        return nomorfaskes;
    }
}

class Akomodasi{
    private String NamaAkomodasi;
    private String Harga;
    private String Alamat;
    private String notelp;

    Akomodasi(String NamaAkomodasi,String Harga,String Alamat,String Notelp){
        this.NamaAkomodasi =NamaAkomodasi;
        this.Harga = Harga;
        this.Alamat = Alamat;
        this.notelp = Notelp;
    }

    //Setter
    void setNamaAkomodasi(String NamaAkomodasi){
        this.NamaAkomodasi =NamaAkomodasi;
    }

    void setHarga(String Harga){
        this.Harga = Harga;
    }

    void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }

    void setnotelp(String notelp){
        this.notelp = notelp;
    }

    //Getter
    String getNamaAkomodasi(){
        return NamaAkomodasi;
    }

    String getHarga(){
        return Harga;
    }

    String getAlamat(){
        return Alamat;
    }

    String getnotelp(){
        return notelp;
    }
}

public class Posttest3_Enkapsulasi {
    static ArrayList<Pendidikan> pendidikan = new ArrayList<Pendidikan>();
    static ArrayList<Kesehatan> kesehatan = new ArrayList<Kesehatan>();
    static ArrayList<Akomodasi> akomodasi = new ArrayList<Akomodasi>();
    
    static Pendidikan SD001 = new Pendidikan(30401096,"SD Negeri 001 Samarinda Ulu","Jl. Pegunungan Bukit Barisan RT. 23 No. 77","Jawa","Negeri");
    static Pendidikan AkademiFarmasi = new Pendidikan(30402938,"Akademi Farmasi Samarinda","Jl AW Syahranie","Kel Air Hitam","SWASTA");
    static Pendidikan newPendidikan = new Pendidikan(30401125,"SD Negeri 003 Samarinda Ulu","Jl. Raudah No. 25","Teluk Lerong Ilir","NEGERI");

    static Kesehatan RSUDSjahrani = new Kesehatan("1601R001","RSUD Abdul Wahab Sjahranie","Rumah Sakit (Tipe B)","Jalan Palang Merah Indonesia");
    static Kesehatan RSHermina = new Kesehatan("0302R116","RS Hermina Samarinda","Rumah Sakit (Tipe C)","Jalan Teuku Umar Kelurahan No. RT 34");
    static Kesehatan RSMedikaCitra = new Kesehatan("0302R110","RS Samarinda Medika Citra","Rumah Sakit (Tipe C)","Jalan Kadrie Oening No. 86 RT. 35");

    static Akomodasi HotelRoyal = new Akomodasi("Hotel Royal Park Samarinda","332.000","Jl. Sentosa No.1 Sungai Pinang Dalam","(0541) 771290");
    static Akomodasi HotelSyariah = new Akomodasi("Hotel Aida Syariah RedPartner","139.151","Jl KH Mas Tumenggung Ps. Pagi","(021) 80629666");
    static Akomodasi Ibis = new Akomodasi("ibis Samarinda","503.156","Jl. Mulawarman No.171","(0541) 526000");

    public static void main(String[] args) {
        pendidikan.add(SD001);
        pendidikan.add(AkademiFarmasi);
        pendidikan.add(newPendidikan);

        kesehatan.add(RSUDSjahrani);
        kesehatan.add(RSHermina);
        kesehatan.add(RSMedikaCitra);

        akomodasi.add(HotelRoyal);
        akomodasi.add(HotelSyariah);
        akomodasi.add(Ibis);

        admin();
    }
    
    static void cls() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    
     static void backToMenu() {
        System.out.println("");
        System.out.print("\t   <         Tekan Enter untuk Kembali          >");
        Scanner Inp = new Scanner(System.in);Inp.nextLine();
        cls();
    }


    static void admin() {
        do{
        System.out.println("\t===============================================");
        System.out.println("\t                   MENU ADMIN                  ");
        System.out.println("\t===============================================");
        System.out.println("\t|      1. Lihat Sarana Kota Samarinda         |");
        System.out.println("\t|      2. Tambah Fasilitas                    |");
        System.out.println("\t|      3. Hapus Fasilitas                     |");
        System.out.println("\t|      4. Ubah Fasilitas                      |");
        System.out.println("\t|      0. Keluar                              |");
        System.out.print("\t Pilih => ");
        Scanner Inp = new Scanner(System.in);String str = Inp.nextLine();
        
        if(str.equals("1")){
            LihatSarana();        
        }
        else if(str.equals("2")){
            TambahSarana();
        }
        else if(str.equals("3")){
            HapusSarana();
        }
        else if(str.equals("4")){
            UbahSarana();
        }
        else if(str.equals("0")){
            System.out.println("");
            System.out.print("\t  <         Program Akan Menutup..          >");
            System.exit(0);
        }
        }
        while (true);
    }
    
    static void LihatSarana(){
        cls();
            System.out.println("\t===============================================");
            System.out.println("\t                 PILIH SARANA                  ");
            System.out.println("\t===============================================");
            System.out.println("\t|             1. Pendidikan                   |");
            System.out.println("\t|             2. Kesehatan                    |");
            System.out.println("\t|             3. Akomodasi                    |");
            System.out.print("\t Pilih => ");
            Scanner scan = new Scanner(System.in);String PilihSarana = scan.nextLine();
            if(PilihSarana.equals("1")){
                cls();
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------------------+----------------------+-----------+");
                System.out.println("|   No  |      NSPSN        |         NamaSatuanPendidikan            |                      Alamat                     |       Kelurahan      |   Status  |");
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------+-----------+----------------------+-----------+");
                for(int i=0;i<pendidikan.size();i++){
                    System.out.printf("|%-6d | %-15d   | %-38s  | %-42s      | %-18s   | %-6s    |\n",
                    i + 1, pendidikan.get(i).getNSPSN(), pendidikan.get(i).getNamaSatuanPendidikan(),pendidikan.get(i).getAlamat(), pendidikan.get(i).getKelurahan(), pendidikan.get(i).getStatus());
                }
                backToMenu();
                }
            else if(PilihSarana.equals("2")){
                cls();
                System.out.println("+-------+-----------------------+-------------------------------------------+-----------------------------------+----------------------------------------------+");
                System.out.println("|   No  |     Nomor Faskes      |           NamaFasilitasKesehatan          |             TipeFaskes            |                      Alamat                  |");
                System.out.println("+-------+-----------------------+-------------------------------------------+-----------------------------------+----------------------------------------------+");
                for(int i=0;i<kesehatan.size();i++){
                    System.out.printf("|%-6d |%-22s | %-33s         | %-32s  | %-39s      |\n",i+1,kesehatan.get(i).getnomorfaskes(),kesehatan.get(i).getNamaFasilitasKesehatan(),kesehatan.get(i).getTipeFaskes(),kesehatan.get(i).getAlamat());
                }
                backToMenu();

            }

            else if(PilihSarana.equals("3")){
                cls();
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                System.out.println("|   No  |              Nama Akomodasi             |         Rataan Harga (Rp)         |                      Alamat                     |         No.Telp      |");
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                for(int i=0;i<akomodasi.size();i++){
                    System.out.printf("|%-6d | %-31s         | %-32s  | %-42s      | %-18s   |\n",i+1,akomodasi.get(i).getNamaAkomodasi(),akomodasi.get(i).getHarga(),akomodasi.get(i).getAlamat(),akomodasi.get(i).getnotelp());
                }
                backToMenu();
            }
    }
    
    static void TambahSarana() {
        cls();
            System.out.println("\t===============================================");
            System.out.println("\t                 PILIH SARANA                  ");
            System.out.println("\t===============================================");
            System.out.println("\t|             1. Pendidikan                   |");
            System.out.println("\t|             2. Kesehatan                    |");
            System.out.println("\t|             3. Akomodasi                    |");
            System.out.print("\t Pilih => ");
            Scanner scan = new Scanner(System.in);String PilihSarana = scan.nextLine();
            if(PilihSarana.equals("1")){
                System.out.println("\t===============================================");
                System.out.println("\t                 TAMBAH SARANA                 ");
                System.out.println("\t===============================================");
                System.out.print("\t| Masukkan NSPSN                   : ");
                Scanner Inp1 = new Scanner(System.in);int NewNSPN = Inp1.nextInt();
                System.out.print("\t| Masukkan Nama Satuan Pendidikan  : ");
                Scanner Inp2 = new Scanner(System.in);String NewPendidikan = Inp2.nextLine();
                System.out.print("\t| Masukkan Alamat                  : ");
                String NewAlamat = Inp2.nextLine();
                System.out.print("\t| Masukkan Kelurahan               : ");
                String NewKelurahan = Inp2.nextLine();
                System.out.print("\t| Masukkan Status                  : ");
                String NewStatus = Inp2.nextLine();


                Pendidikan newPendidikan = new Pendidikan(NewNSPN,NewPendidikan,NewAlamat,NewKelurahan,NewStatus);
                pendidikan.add(newPendidikan);
                backToMenu();
            }

            else if (PilihSarana.equals("2")){
                System.out.println("\t===============================================");
                System.out.println("\t                 TAMBAH SARANA                 ");
                System.out.println("\t===============================================");
                System.out.print("\t| Masukkan Nomor Fasilitas Kesehatan      :");
                Scanner Inp1 = new Scanner(System.in);String NewNomorFaskes = Inp1.nextLine();
                System.out.print("\t| Masukkan Nama Fasilitas Kesehatan       :");
                String NewNamaKesehatan = Inp1.nextLine();
                System.out.print("\t| Masukkan Tipe Fasilitas Kesehatan       :");
                String NewTipeKesehatan = Inp1.nextLine();
                System.out.print("\t| Masukkan Alamat Fasilitas Kesehatan     :");
                String NewAlamatKesehatan = Inp1.nextLine();


                Kesehatan newKesehatan = new Kesehatan(NewNomorFaskes,NewNamaKesehatan,NewTipeKesehatan,NewAlamatKesehatan);
                kesehatan.add(newKesehatan);
                backToMenu();

            }


            if(PilihSarana.equals("3")){
                System.out.println("\t===============================================");
                System.out.println("\t                 TAMBAH SARANA                 ");
                System.out.println("\t===============================================");

                System.out.print("\t| Masukkan Nama Akomodasi       : ");
                Scanner Inp2 = new Scanner(System.in);String NewAkomodasi = Inp2.nextLine();
                System.out.print("\t| Masukkan Harga Rataan         : ");
                String NewHarga = Inp2.nextLine();
                System.out.print("\t| Masukkan Alamat Akomodasi     : ");
                String NewAlamatAkomodasi = Inp2.nextLine();
                System.out.print("\t| Masukkan No Telepon Akomodasi : ");
                String NewNotelp = Inp2.nextLine();

                Akomodasi newAkomodasi = new Akomodasi(NewAkomodasi,NewHarga,NewAlamatAkomodasi,NewNotelp);
                akomodasi.add(newAkomodasi);
                backToMenu();
            }
            }
    
    
    
        static void HapusSarana(){
            cls();
            System.out.println("\t===============================================");
            System.out.println("\t               PILIH SARANA                    ");
            System.out.println("\t===============================================");
            System.out.println("\t|             1. Pendidikan                   |");
            System.out.println("\t|             2. Kesehatan                    |");
            System.out.println("\t|             3. Akomodasi                    |");
            System.out.print("\t Pilih => ");
            Scanner scan = new Scanner(System.in);String HapusSarana = scan.nextLine();
            if (HapusSarana.equals("1")){
                cls();
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 HAPUS SARANA                 ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------------------+----------------------+-----------+");
                System.out.println("|   No  |      NSPSN        |         NamaSatuanPendidikan            |                      Alamat                     |       Kelurahan      |   Status  |");
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------+-----------+----------------------+-----------+");
                for(int i=0;i<pendidikan.size();i++){
                    System.out.printf("|%-6d | %-15d   | %-38s  | %-42s      | %-18s   | %-6s    |\n",
                    i + 1, pendidikan.get(i).getNSPSN(), pendidikan.get(i).getNamaSatuanPendidikan(),pendidikan.get(i).getAlamat(), pendidikan.get(i).getKelurahan(), pendidikan.get(i).getStatus());
                }
                System.out.print("| Masukkan Nomor Yang Ingin Dihapus  :");
                Scanner Inp1 = new Scanner(System.in);int NewNSPN = Inp1.nextInt();
                pendidikan.remove(NewNSPN-1);

                backToMenu();
            }

            else if (HapusSarana.equals("2")){
                cls();
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 HAPUS SARANA                 ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+-----------------------+-------------------------------------------+-----------------------------------+----------------------------------------------+");
                System.out.println("|   No  |     Nomor Faskes      |           NamaFasilitasKesehatan          |             TipeFaskes            |                      Alamat                  |");
                System.out.println("+-------+-----------------------+-------------------------------------------+-----------------------------------+----------------------------------------------+");
                for(int i=0;i<kesehatan.size();i++){
                    System.out.printf("|%-6d |%-22s | %-33s         | %-32s  | %-39s      |\n",i+1,kesehatan.get(i).getnomorfaskes(),kesehatan.get(i).getNamaFasilitasKesehatan(),kesehatan.get(i).getTipeFaskes(),kesehatan.get(i).getAlamat());
                }
                System.out.print("| Masukkan Nomor Yang Ingin Dihapus  :");
                Scanner Inp1 = new Scanner(System.in);int hapuskesehatan = Inp1.nextInt();
                kesehatan.remove(hapuskesehatan-1);
                
                backToMenu();
            }
            else if(HapusSarana.equals("3")){
                cls();
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 HAPUS SARANA                 ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                System.out.println("|   No  |              Nama Akomodasi             |         Rataan Harga (Rp)         |                      Alamat                     |         No.Telp      |");
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
            
                for(int i=0;i<akomodasi.size();i++){
                    System.out.printf("|%-6d | %-31s         | %-32s  | %-42s      | %-18s   |\n",i+1,akomodasi.get(i).getNamaAkomodasi(),akomodasi.get(i).getHarga(),akomodasi.get(i).getAlamat(),akomodasi.get(i).getnotelp());
                }
                System.out.print("| Masukkan Nomor Yang Ingin Dihapus  :");
                Scanner Inp1 = new Scanner(System.in);int hapusakomodasi = Inp1.nextInt();
                akomodasi.remove(hapusakomodasi-1);

                backToMenu();
            }
        }
        
      static void UbahSarana() {
            cls();
            System.out.println("\t===============================================");
            System.out.println("\t               PILIH SARANA                    ");
            System.out.println("\t===============================================");
            System.out.println("\t|             1. Pendidikan                   |");
            System.out.println("\t|             2. Kesehatan                    |");
            System.out.println("\t|             3. Akomodasi                    |");
            System.out.print("\t Pilih => ");
            Scanner scan = new Scanner(System.in);String UbahSarana = scan.nextLine();
            if (UbahSarana.equals("1")){
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 UBAH SARANA                   ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------------------+----------------------+-----------+");
                System.out.println("|   No  |      NSPSN        |         NamaSatuanPendidikan            |                      Alamat                     |       Kelurahan      |   Status  |");
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------+-----------+----------------------+-----------+\n");
                for(int i=0;i<pendidikan.size();i++){
                    System.out.printf("|%-6d | %-15d   | %-38s  | %-42s      | %-18s   | %-6s    |\n",
                    i + 1, pendidikan.get(i).getNSPSN(), pendidikan.get(i).getNamaSatuanPendidikan(),pendidikan.get(i).getAlamat(), pendidikan.get(i).getKelurahan(), pendidikan.get(i).getStatus());
                }
                System.out.print("\n| Masukkan Nomor Yang Ingin Diperbaharui  : ");
                Scanner inp10 = new Scanner(System.in);int Update = inp10.nextInt();
                System.out.print("| Masukkan NSPSN                   : ");
                int NewNSPN = inp10.nextInt();
                System.out.print("| Masukkan Nama Satuan Pendidikan  : ");
                Scanner Inp2 = new Scanner(System.in);String NewPendidikan = Inp2.nextLine();
                System.out.print("| Masukkan Alamat                  : ");
                String NewAlamat = Inp2.nextLine();
                System.out.print("| Masukkan Kelurahan               : ");
                String NewKelurahan = Inp2.nextLine();
                System.out.print("| Masukkan Status                  : ");
                String NewStatus = Inp2.nextLine();

                pendidikan.get(Update-1).setNSPSN(NewNSPN);
                pendidikan.get(Update-1).setNamaSatuanPendidikan(NewPendidikan);
                pendidikan.get(Update-1).setAlamat(NewAlamat);
                pendidikan.get(Update-1).setKelurahan(NewKelurahan);
                pendidikan.get(Update-1).setStatus(NewStatus);

                backToMenu();}
            else if(UbahSarana.equals("2")){
                cls();
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 UBAH SARANA                   ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+-----------------------+-------------------------------------------+-----------------------------------+----------------------------------------------+");
                System.out.println("|   No  |     Nomor Faskes      |           NamaFasilitasKesehatan          |             TipeFaskes            |                      Alamat                  |");
                System.out.println("+-------+-----------------------+-------------------------------------------+-----------------------------------+----------------------------------------------+");
                for(int i=0;i<kesehatan.size();i++){
                    System.out.printf("|%-6d |%-22s | %-33s         | %-32s  | %-39s      |\n",i+1,kesehatan.get(i).getnomorfaskes(),kesehatan.get(i).getNamaFasilitasKesehatan(),kesehatan.get(i).getTipeFaskes(),kesehatan.get(i).getAlamat());
                }

            
                System.out.print("| Masukkan Nomor Yang Ingin Diubah  : ");
                Scanner inp10 = new Scanner(System.in);int Update = inp10.nextInt();
                System.out.print("| Masukkan Nomor Fasilitas Kesehatan      : ");
                Scanner Inp7 = new Scanner(System.in);String NewNomorFaskes = Inp7.nextLine();
                System.out.print("| Masukkan Nama Fasilitas Kesehatan       : ");
                String NewNamaKesehatan = Inp7.nextLine();
                System.out.print("| Masukkan Tipe Fasilitas Kesehatan       : ");
                String NewTipeKesehatan = Inp7.nextLine();
                System.out.print("| Masukkan Alamat Fasilitas Kesehatan     : ");
                String NewAlamatKesehatan = Inp7.nextLine();

                
                kesehatan.get(Update-1).setNomorFaskes(NewNomorFaskes);
                kesehatan.get(Update-1).setNamaFasilitasKesehatan(NewNamaKesehatan);
                kesehatan.get(Update-1).setTipeFaskes(NewTipeKesehatan);
                kesehatan.get(Update-1).setAlamat(NewAlamatKesehatan);
                backToMenu();}

            else if(UbahSarana.equals("3")){
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 UBAH SARANA                   ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                System.out.println("|   No  |              Nama Akomodasi             |         Rataan Harga (Rp)         |                      Alamat                     |         No.Telp      |");
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                
                for(int i=0;i<akomodasi.size();i++){
                    System.out.printf("|%-6d | %-31s         | %-32s  | %-42s      | %-18s   |\n",i+1,akomodasi.get(i).getNamaAkomodasi(),akomodasi.get(i).getHarga(),akomodasi.get(i).getAlamat(),akomodasi.get(i).getnotelp());
                }

                System.out.print("| Masukkan Nomor Yang Ingin Diubah  : ");
                Scanner inp10 = new Scanner(System.in);int Update = inp10.nextInt();
                System.out.print("| Masukkan Nama Fasilitas Akomodasi       : ");
                Scanner Inp2 = new Scanner(System.in);String NewAkomodasi = Inp2.nextLine();
                System.out.print("| Masukkan Harga Rataan                   : ");
                String NewHarga = Inp2.nextLine();
                System.out.print("| Masukkan Alamat Akomodasi               : ");
                String NewAlamatAkomodasi = Inp2.nextLine();
                System.out.print("| Masukkan No.Telepon                     : ");
                String NewNotelp = Inp2.nextLine();

                akomodasi.get(Update-1).setNamaAkomodasi(NewAkomodasi);
                akomodasi.get(Update-1).setHarga(NewHarga);
                akomodasi.get(Update-1).setAlamat(NewAlamatAkomodasi);
                akomodasi.get(Update-1).setnotelp(NewNotelp);
                backToMenu();
            }
            }
      
    
    
}
