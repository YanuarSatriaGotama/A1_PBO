package posttest2;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;


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
        switch (pilihMenu) {
            case 0:
                clearScreen();
                System.out.println("\n\n\n\n");
                System.out.println("\t\t\t=== Terima kasih telah menggunakan program ini ===");
                System.out.println("\t\t\t=                                                =");
                System.out.println("\t\t\t===    PROGRAM DATA PENDUDUK KAB. SUMEDANG     ===");
                System.exit(0);
            case 1:
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    =============================");
                System.out.println("\t\t\t    =  MENGINPUT DATA PENDUDUK  =");
                System.out.println("\t\t\t    =============================");
                System.out.print("Masukan banyak data   : ");
                int banyak = input.nextInt();
                for(int y = 0 ; y < banyak; y++){
                    System.out.print("Masukan nik           : ");
                    long nik = input.nextLong();
                    input.nextLine(); 
                    data_nik.add(nik);
                    System.out.print("Masukan nama          : ");
                    String nama = input.nextLine();
                    data_nama.add(nama);
                    System.out.print("Masukan tempat        : ");
                    String tempat = input.nextLine();
                    data_tempat.add(tempat);
                    System.out.print("Masukan tanggal lahir : ");
                    String tanggal = input.nextLine();
                    data_tanggal.add(tanggal);
                    System.out.print("Masukan jenis kelamin : ");
                    String sex = input.nextLine();
                    data_sex.add(sex);
                    System.out.print("Masukan agama         : ");
                    String agama = input.nextLine();
                    data_agama.add(agama);
                    System.out.print("Masukan status        : ");
                    String status = input.nextLine();
                    data_status.add(status);
                    System.out.print("Masukan pekerjaan     : ");
                    String pekerjaan = input.nextLine();
                    data_pekerjaan.add(pekerjaan);
                    System.out.print("Masukan alamat        : ");
                    String alamat = input.nextLine();
                    data_alamat.add(alamat); 
                    System.out.println("=====================");
                }
                System.out.print("\n\nDATA BERHASIL DITAMBAHKAN!");
                System.out.print("\ntekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
                
            case 2:
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    = DATA PENDUDUK KAB. SUMEDANG =");
                System.out.println("\t\t\t    ===============================");
                //objek
                Penduduk Steven = new Penduduk(2009106028, "Steven", "Lampung Tengah", "9 September 2001", "Perempuan", "Islam", "Belum Kawin", "Mahasiswa", "Sumedang"); //constructor
                Penduduk Kusnaidi = new Penduduk(222333222, "Kusnaidi", "Sumedang", "21 Oktober 2002", "laki laki", "Kristen", "Kawin", "Pegawai", "Sumedang");
                
                //akses objek
                   System.out.println("PENDUDUK KE-1");
                   System.out.println("NIK            : "+Steven.nik);
		   System.out.println("Nama           : "+Steven.nama);
                   System.out.println("Tempat lahir   : "+Steven.tempat);
                   System.out.println("Tanggal lahir  : "+Steven.tanggal );
                   System.out.println("Jenis kelamin  : "+Steven.sex);
                   System.out.println("Agama          : "+Steven.agama);
                   System.out.println("Status         : "+Steven.status);
                   System.out.println("Pekerjaan      : "+Steven.pekerjaan);
                   System.out.println("Alamat         : "+Steven.alamat);
                   System.out.print("Keadaan        : ");
                   Steven.kematian();
                   System.out.println("=====================");
                   
                   System.out.println("PENDUDUK KE-2");
                   System.out.println("NIK            : "+Kusnaidi.nik);
		   System.out.println("Nama           : "+Kusnaidi.nama);
                   System.out.println("Tempat lahir   : "+Kusnaidi.tempat);
                   System.out.println("Tanggal lahir  : "+Kusnaidi.tanggal );
                   System.out.println("Jenis kelamin  : "+Kusnaidi.sex);
                   System.out.println("Agama          : "+Kusnaidi.agama);
                   System.out.println("Status         : "+Kusnaidi.status);
                   System.out.println("Pekerjaan      : "+Kusnaidi.pekerjaan);
                   System.out.println("Alamat         : "+Kusnaidi.alamat);
                   System.out.print("Keadaan        : ");
                   Steven.kematian();
                   System.out.println("=====================");
                
                
                    for(int y = 0; y < data_nik.size(); y++){
                   System.out.println("PENDUDUK KE-" + (y+3));
                   System.out.println("NIK            : "+data_nik.get(y));
		   System.out.println("Nama           : "+data_nama.get(y));
                   System.out.println("Tempat lahir   : "+data_tempat.get(y));
                   System.out.println("Tanggal lahir  : "+data_tanggal.get(y));
                   System.out.println("Jenis kelamin  : "+data_sex.get(y));
                   System.out.println("Agama          : "+data_agama.get(y));
                   System.out.println("Status         : "+data_status.get(y));
                   System.out.println("Pekerjaan      : "+data_pekerjaan.get(y));
                   System.out.println("Alamat         : "+data_alamat.get(y));
                   System.out.print("Keadaan        : ");
                   Steven.kelahiran();
                   System.out.println("=====================");
                    }
                
               
                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
                
            case 3 :
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    = DATA PENDUDUK KAB. SUMEDANG =");
                System.out.println("\t\t\t    ===============================");
                
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
                
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    =    MENGUBAH DATA PENDUDUK   =");
                System.out.println("\t\t\t    ===============================");
                System.out.print("Data penduduk yang diubah : ");
                int edit = input.nextInt();
		
                System.out.println("SILAHKAN UBAH DATA!");
		System.out.print("Masukan nik           : ");
                long nik2 = input.nextLong();
                input.nextLine(); //biar ga lompat 
                data_nik.set((edit-1), nik2);
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
                
                System.out.print("\nDATA BERHASIL DIUBAH!");
	
                System.out.print("\ntekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
		
               
            case 4 :
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    = DATA PENDUDUK KAB. SUMEDANG =");
                System.out.println("\t\t\t    ===============================");
                
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

                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
		
            default:
                clearScreen();
                System.out.println("Pilihan tidak ada di menu!");
                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu();
                break;
        }
    }
    
    public static void main(String[] args)throws Exception {
        tampil();
        menu();
        
    }
    
}
