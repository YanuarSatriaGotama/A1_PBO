package posttest3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    //variabel global array
    static ArrayList<Long> data_nik = new ArrayList<>();
    static ArrayList<String> data_nama = new ArrayList<>();
    static ArrayList<String> data_tempat = new ArrayList<>();
    static ArrayList<String> data_tanggal = new ArrayList<>();
    static ArrayList<String> data_sex = new ArrayList<>();
    static ArrayList<String> data_agama = new ArrayList<>();
    static ArrayList<String> data_status = new ArrayList<>();
    static ArrayList<String> data_pekerjaan = new ArrayList<>();
    static ArrayList<String> data_alamat = new ArrayList<>();
    
    static Scanner input = new Scanner(System.in);
    
    static void clearScreen() {
        try  
            {  
            final String os = System.getProperty("os.name");  
            if (os.contains("Windows"))  
            {  
            Runtime.getRuntime().exec("cls");  
            }  
            else  
            {  
            Runtime.getRuntime().exec("clear");  
            }  
            }  
            catch (final IOException e)  
            {  
            }   
    }
    
    static void tampil(){
        clearScreen();
        System.out.print("\n\n\n\n");
        System.out.println("\t\t\t========================================");
        System.out.println("\t\t\t=  PROGRAM DATA PENDUDUK KAB.SUMEDANG  =");
        System.out.println("\t\t\t=                oleh :                =");
        System.out.println("\t\t\t=        2009106028-MITHA AMALIA       =");
        System.out.println("\t\t\t========================================");
        
        System.out.print("\n\t\t\ttekan [ENTER] untuk melanjutkan....");
        input.nextLine();
    }
    
    static void back_to_menu() {
    System.out.println("");
    System.out.print("Tekan [Enter] untuk kembali..");
    input.nextLine();
    clearScreen();
    }
    
    static void tambahData(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    =============================");
        System.out.println("\t\t\t    =  MENGINPUT DATA PENDUDUK  =");
        System.out.println("\t\t\t    =============================");
        System.out.print("Masukan banyak data           : ");
        int banyak = input.nextInt();
        for(int y = 0 ; y < banyak; y++){
            System.out.print("Masukkan NIK              : ");
            long nik = input.nextLong();
            input.nextLine();
            data_nik.add(nik);
            System.out.print("Masukkan Nama             : ");
            String nama = input.nextLine();
            data_nama.add(nama);
            System.out.print("Masukkan Tempat Lahir     : ");
            String tempatLahir = input.nextLine();
            data_tempat.add(tempatLahir);
            System.out.print("Masukkan Tanggal Lahir    : ");
            String tanggalLahir = input.nextLine();
            data_tanggal.add(tanggalLahir);
            System.out.print("Masukkan Jenis Kelamin    : ");
            String sex = input.nextLine();
            data_sex.add(sex);
            System.out.print("Masukkan Agama            : ");
            String agama = input.nextLine();
            data_agama.add(agama);
            System.out.print("Masukkan Status           : ");
            String status = input.nextLine();
            data_status.add(status);
            System.out.print("Masukkan Pekerjaan        : ");
            String pekerjaan = input.nextLine();
            data_pekerjaan.add(pekerjaan);
            System.out.print("Masukkan Alamat           : ");
            String alamat = input.nextLine();
            data_alamat.add(alamat);

            penduduk Data = new penduduk(nik, nama, tempatLahir, tanggalLahir, sex, agama, status, pekerjaan, alamat);
            System.out.println("\n");
            Data.dataDitambah();
            Data.getNik();
            Data.getNama();
            Data.getTempatLahir();
            Data.getTanggalLahir();
            Data.getSex();
            Data.getAgama();
            Data.getStatus();
            Data.getPekerjaan();
            Data.getAlamat();
            System.out.println("DITAMBAHKAN DENGAN GETTER");
            System.out.println("NIK             : " + Data.getNik());
            System.out.println("NAMA            : " + Data.getNama());
            System.out.println("TEMPAT LAHIR    : " + Data.getTempatLahir());
            System.out.println("TANGGAL LAHIR   : " + Data.getTanggalLahir());
            System.out.println("JENIS KELAMIN   : " + Data.getSex());
            System.out.println("AGAMA           : " + Data.getAgama());
            System.out.println("STATUS          : " + Data.getStatus());
            System.out.println("PEKERJAAN       : " + Data.getPekerjaan());
            System.out.println("ALAMAT          : " + Data.getAlamat() + "\n\n");
        }
        back_to_menu();
    }
    
    static void lihatData(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    = DATA PENDUDUK KAB. SUMEDANG =");
        System.out.println("\t\t\t    ===============================");
        if(data_nik.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_nik.size(); y++){
            System.out.println("PENDUDUK KE-" + (y+1));
            System.out.println("NIK            : "+data_nik.get(y));
            System.out.println("Nama           : "+data_nama.get(y));
            System.out.println("Tempat lahir   : "+data_tempat.get(y));
            System.out.println("Tanggal lahir  : "+data_tanggal.get(y));
            System.out.println("Jenis kelamin  : "+data_sex.get(y));
            System.out.println("Agama          : "+data_agama.get(y));
            System.out.println("Status         : "+data_status.get(y));
            System.out.println("Pekerjaan      : "+data_pekerjaan.get(y));
            System.out.println("Alamat         : "+data_alamat.get(y));
            System.out.println("=====================");
             }
        }
        back_to_menu();
    }
    
    
    static void editData(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    = DATA PENDUDUK KAB. SUMEDANG =");
        System.out.println("\t\t\t    ===============================");
        if(data_nik.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_nik.size(); y++){
            System.out.println("PENDUDUK KE-" + (y+1));
            System.out.println("NIK            : "+data_nik.get(y));
            System.out.println("Nama           : "+data_nama.get(y));
            System.out.println("Tempat lahir   : "+data_tempat.get(y));
            System.out.println("Tanggal lahir  : "+data_tanggal.get(y));
            System.out.println("Jenis kelamin  : "+data_sex.get(y));
            System.out.println("Agama          : "+data_agama.get(y));
            System.out.println("Status         : "+data_status.get(y));
            System.out.println("Pekerjaan      : "+data_pekerjaan.get(y));
            System.out.println("Alamat         : "+data_alamat.get(y));
            System.out.println("=====================");
             }
        }
        
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    =    MENGUBAH DATA PENDUDUK   =");
        System.out.println("\t\t\t    ===============================");
        System.out.print("Data penduduk yang diubah : ");
        int edit = input.nextInt();
        System.out.println("SILAHKAN UBAH DATA!");
        System.out.print("Masukan nik           : ");
        long nik2 = input.nextLong();
        data_nik.set((edit-1), nik2);
        input.nextLine(); //biar ga lompat 
        System.out.print("Masukan nama          : ");
        String nama2 = input.nextLine();
        data_nama.set((edit-1), nama2);
        System.out.print("Masukan tempat        : ");
        String tempat2 = input.nextLine();
        data_tempat.set((edit-1),tempat2);
        System.out.print("Masukan tanggal lahir : ");
        String tanggal2 = input.nextLine();
        data_tanggal.set((edit-1),tanggal2);
        System.out.print("Masukan jenis kelamin : ");
        String sex2 = input.nextLine();
        data_sex.set((edit-1),sex2);
        System.out.print("Masukan agama         : ");
        String agama2 = input.nextLine();
        data_agama.set((edit-1),agama2);
        System.out.print("Masukan status        : ");
        String status2 = input.nextLine();
        data_status.set((edit-1),status2);
        System.out.print("Masukan pekerjaan     : ");
        String pekerjaan2 = input.nextLine();
        data_pekerjaan.set((edit-1),pekerjaan2);
        System.out.print("Masukan alamat        : ");
        String alamat2 = input.nextLine();
        data_alamat.set((edit-1),alamat2);
        
        penduduk data = new penduduk (nik2, nama2, tempat2, tanggal2, sex2,agama2, status2, pekerjaan2, alamat2);
        System.out.println(" ");
        data.dataDiubah();
        data.setNik(nik2);
        data.setNama(nama2);
        data.setTempatLahir(tempat2);
        data.setTanggalLahir(tanggal2);
        data.setSex(sex2);
        data.setAgama(agama2);
        data.setStatus(status2);
        data.setPekerjaan(pekerjaan2);
        data.setAlamat(alamat2);
        System.out.println("DIUBAH DENGAN SETTER");
            System.out.println("NIK             : " + data.getNik());
            System.out.println("NAMA            : " + data.getNama());
            System.out.println("TEMPAT LAHIR    : " + data.getTempatLahir());
            System.out.println("TANGGAL LAHIR   : " + data.getTanggalLahir());
            System.out.println("JENIS KELAMIN   : " + data.getSex());
            System.out.println("AGAMA           : " + data.getAgama());
            System.out.println("STATUS          : " + data.getStatus());
            System.out.println("PEKERJAAN       : " + data.getPekerjaan());
            System.out.println("ALAMAT          : " + data.getAlamat() + "\n\n");
        back_to_menu();
    }
   
    
    static void hapusData(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    = DATA PENDUDUK KAB. SUMEDANG =");
        System.out.println("\t\t\t    ===============================");
        if(data_nik.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_nik.size(); y++){
            System.out.println("PENDUDUK KE-" + (y+1));
            System.out.println("NIK            : "+data_nik.get(y));
            System.out.println("Nama           : "+data_nama.get(y));
            System.out.println("Tempat lahir   : "+data_tempat.get(y));
            System.out.println("Tanggal lahir  : "+data_tanggal.get(y));
            System.out.println("Jenis kelamin  : "+data_sex.get(y));
            System.out.println("Agama          : "+data_agama.get(y));
            System.out.println("Status         : "+data_status.get(y));
            System.out.println("Pekerjaan      : "+data_pekerjaan.get(y));
            System.out.println("Alamat         : "+data_alamat.get(y));
            System.out.println("=====================");
             }
        }
        
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    =   MENGHAPUS DATA PENDUDUK   =");
        System.out.println("\t\t\t    ===============================");
        System.out.print("Data penduduk yang dihapus : ");
        int hapus = input.nextInt();
        data_nik.remove((hapus-1));
        data_nama.remove((hapus-1));
        data_tempat.remove((hapus-1));
        data_tanggal.remove((hapus-1));
        data_sex.remove((hapus-1));
        data_agama.remove((hapus-1));
        data_status.remove((hapus-1));
        data_pekerjaan.remove((hapus-1));
        data_alamat.remove((hapus-1));
        
        System.out.println("DATA BERHASIL DIHAPUS!");
        back_to_menu();
    }
    static void menu(){
        Scanner masukkan = new Scanner(System.in);
       
        clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t======================================");
        System.out.println("\t\t\t= PROGRAM DATA PENDUDUK KAB.SUMEDANG =");
        System.out.println("\t\t\t= [1] Create data                    =");
        System.out.println("\t\t\t= [2] Read Data                      =");
        System.out.println("\t\t\t= [3] Update Data                    =");
        System.out.println("\t\t\t= [4] Delete Data                    =");
        System.out.println("\t\t\t= [0] Exit                           =");
        System.out.println("\t\t\t======================================");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        
        switch(pilihMenu){
            case 0 :
                clearScreen();
                System.out.println("\n\n\n\n");
                System.out.println("\t\t\t=== Terima kasih telah menggunakan program ini ===");
                System.out.println("\t\t\t=                                                =");
                System.out.println("\t\t\t===    PROGRAM DATA PENDUDUK KAB. SUMEDANG     ===");
                System.exit(0);
                
            case 1 :
                tambahData();
                break;
                
            case 2 :
                lihatData();
                break;
                
            case 3 :
                editData();
                break;
            
            case 4 :
                hapusData();
                break;
                
            default :
                clearScreen();
                System.out.println("Pilihan tidak ada di menu!");
                back_to_menu();
        }
    }
    
    public static void main(String[] args) {
        tampil();
        while(true){
            menu();
        }
    }
    
}
