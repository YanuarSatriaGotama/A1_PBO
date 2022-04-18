
package POSTTEST2;


import java.util.Scanner;
import java.util.ArrayList;


public class main{
    static Scanner input_int = new Scanner(System.in);
    static Scanner input_str = new Scanner(System.in);
    static ArrayList nama_pemilik = new ArrayList<>();
    static ArrayList kegiatan = new ArrayList<>();
    static ArrayList jam_kegiatan = new ArrayList<>();
    static ArrayList durasi_kegiatan = new ArrayList<>();
    static ArrayList keterangan_kegiatan = new ArrayList<>();
    static int tanda = 0;
    
    public static void main(String[] args) {
        menu();
        
        
       
    }
    
    
    static void menu(){
        System.out.println("\t\t++====== TODO LIST ======++");
        System.out.println("\t\t++ [1] Lihat Todo List   ++");
        System.out.println("\t\t++ [2] Tambah Todo List  ++ ");
        System.out.println("\t\t++ [3] Edit Todo List    ++");
        System.out.println("\t\t++ [4] Hapus Todo List   ++");
        System.out.println("\t\t++ [0] Keluar            ++");
        System.out.println("\t\t---------------------------");
        System.out.print("\t\tPilih Menu = ");
        int menu = input_int.nextInt();
        switch (menu){
            case 1:
                lihat_todolist();
                System.out.println("Tekan Enter Untuk Kembali");
                input_str.nextLine();
                menu();
            case 2:
                buat_todolist();
                System.out.println("Tekan Enter Untuk Kembali");
                input_str.nextLine();
                menu();
                break;
            case 3:
                lihat_todolist();
                update_todolist();
                System.out.println("Tekan Enter Untuk Kembali");
                input_str.nextLine();
                menu();
            case 4:
                lihat_todolist();
                hapus_todolist();
                System.out.println("Tekan Enter Untuk Kembali");
                input_str.nextLine();
                menu();
            case 0:
                System.exit(0);
            default:
                System.out.println("Pilihan Anda Salah!");
                System.out.println("Tekan Enter Untuk Kembali");
                input_str.nextLine();
                menu();
                break;
        }
    }
    
    static void buat_todolist(){
        tanda = 1;
        System.out.println("++============== TODO LIST ===========++");
        System.out.println("++ Berapa Jadwal yang ingin anda Buat ++");
        System.out.print("    >> ");
        int bnyk = input_int.nextInt();
        
        
        
        for (int x = 0;x< bnyk;x++){
            
            System.out.println("\n    Masukan Nama Anda ");
            System.out.print("    >> ");
            String nama = input_str.nextLine();
            
            
            System.out.println("    Masukan Nama Kegiatan ");
            System.out.print("    >> ");
            String keg = input_str.nextLine();
            
            
            System.out.println("    Masukan jam kegiatan ");
            System.out.print("    >> ");
            String jam = input_str.nextLine();
            
            System.out.println("    Masukan durasi kegiatan ");
            System.out.print("    >> ");
            String durasi = input_str.nextLine();
            
            System.out.println("    Masukan keterangan kegiatan ");
            System.out.print("    >> ");
            String keterangan = input_str.nextLine();
            
            nama_pemilik.add(nama);
            kegiatan.add(keg);
            jam_kegiatan.add(jam);
            durasi_kegiatan.add(durasi);
            keterangan_kegiatan.add(keterangan);
        }
        
    }
    
    static void lihat_todolist(){
        
        System.out.println("++============== TODO LIST ===========++");
        System.out.println("++              Jadwal Anda           ++");
        kegiatan asal = new kegiatan("Main Futsal","19.00","2 Jam","Lawan 2021","Tim IF A");
        kegiatan asal1 = new kegiatan("Tugas","22.00","1 Jam","Matkul PBO","Ilham");
        
        System.out.println("   Kegiatan "+ 1);
        System.out.println("   Nama Pemilik        = "+ asal.nama);
        System.out.println("   Nama Kegiatan       = "+ asal.nama_kegiatan);
        System.out.println("   Jam Kegiatan        = "+ asal.jam_kegiatan);
        System.out.println("   Durasi Kegiatan     = "+ asal.durasi_kegiatan);
        System.out.println("   Keterangan Kegiatan = "+ asal.ket_kegiatan);
        asal.sudah();
        System.out.println("\n");
        
        System.out.println("   Kegiatan "+ 2);
        System.out.println("   Nama Pemilik        = "+ asal1.nama);
        System.out.println("   Nama Kegiatan       = "+ asal1.nama_kegiatan);
        System.out.println("   Jam Kegiatan        = "+ asal1.jam_kegiatan);
        System.out.println("   Durasi Kegiatan     = "+ asal1.durasi_kegiatan);
        System.out.println("   Keterangan Kegiatan = "+ asal1.ket_kegiatan);
        asal1.belum();
        System.out.println("\n");
        
        for (int z = 0 ; z < kegiatan.size();z++){
            System.out.println("   Kegiatan "+ (z+3));
            System.out.println("   Nama Pemilik        = "+ nama_pemilik.get(z));
            System.out.println("   Nama Kegiatan       = "+ kegiatan.get(z));
            System.out.println("   Jam Kegiatan        = "+ jam_kegiatan.get(z));
            System.out.println("   Durasi Kegiatan     = "+ durasi_kegiatan.get(z));
            System.out.println("   Keterangan Kegiatan = "+ keterangan_kegiatan.get(z));
            System.out.println("\n");
        }
    }
    
    static void update_todolist(){
        if (tanda == 1){
            System.out.println("++============== TODO LIST ===========++");
            System.out.println("++           Update Jadwal Anda       ++");
            lihat_todolist();
            System.out.println("    Nomor Kegiatan \n(Hanya dapat Update dari Kegiatan 3)");
            System.out.print("    >> ");
            int indx_update = input_int.nextInt();

            System.out.println("\n    Masukan Nama Anda ");
            System.out.print("    >> ");
            String nama = input_str.nextLine();

            System.out.println("    Masukan Nama Kegiatan ");
            System.out.print("    >> ");
            String keg_update = input_str.nextLine();

            System.out.println("    Masukan jam kegiatan ");
            System.out.print("    >> ");
            String jam_update = input_str.nextLine();

            System.out.println("    Masukan durasi kegiatan ");
            System.out.print("    >> ");
            String durasi_update = input_str.nextLine();

            System.out.println("    Masukan keterangan kegiatan ");
            System.out.print("    >> ");
            String keterangan_update = input_str.nextLine();

            kegiatan.set((indx_update-3), keg_update);
            jam_kegiatan.set((indx_update-3), jam_update);
            durasi_kegiatan.set((indx_update-3), durasi_update);
            keterangan_kegiatan.set((indx_update-3), keterangan_update);
            nama_pemilik.set((indx_update-3), nama);
        }
        else{
            System.out.println("++============== TODO LIST ===========++");
            System.out.println("++     Tidak dapat Mengupdate data    ++");
            System.out.println("Tekan Enter Untuk Kembali");
            input_str.nextLine();
            menu();
        }
        
    }
    
    static void hapus_todolist(){
        if (tanda == 1){
            System.out.println("++============== TODO LIST ===========++");
            System.out.println("++            Hapus Jadwal Anda       ++");
            lihat_todolist();

            System.out.println("    Nomor Kegiatan\n(Hanya dapat Hapus dari Kegiatan 3) ");
            System.out.print("    >> ");
            int indx_hapus = input_int.nextInt();

            System.out.println("\n++    Data yang ingin di Hapus       ++");
            System.out.println("   Nama Pemilik        = "+ nama_pemilik.get((indx_hapus-3)));
            System.out.println("    Nama Kegiatan       = "+ kegiatan.get(indx_hapus-3));
            System.out.println("    Jam Kegiatan        = "+ jam_kegiatan.get(indx_hapus-3));
            System.out.println("    Durasi Kegiatan     = "+ durasi_kegiatan.get(indx_hapus-3));
            System.out.println("    Keterangan Kegiatan = "+ keterangan_kegiatan.get(indx_hapus-3));

            System.out.println("\n   Yakin ingin menghapus Data ");
            System.out.print("   (y/n)  >> ");
            String pil = input_str.nextLine();
            if(pil.equals("y")){
                nama_pemilik.remove(indx_hapus-3);
                kegiatan.remove(indx_hapus-3);
                jam_kegiatan.remove(indx_hapus-3);
                durasi_kegiatan.remove(indx_hapus-3);
                keterangan_kegiatan.remove(indx_hapus-3);
            }
            else if(pil.endsWith("Y")){
                nama_pemilik.remove(indx_hapus-3);
                kegiatan.remove(indx_hapus-3);
                jam_kegiatan.remove(indx_hapus-3);
                durasi_kegiatan.remove(indx_hapus-3);
                keterangan_kegiatan.remove(indx_hapus-3);
            }
            else{
                System.out.println("Tekan Enter Untuk Kembali");
                input_str.nextLine();
                menu();
            }
        }
        else{
            System.out.println("++============== TODO LIST ===========++");
            System.out.println("++     Tidak dapat Menghapus data     ++");
            System.out.println("Tekan Enter Untuk Kembali");
            input_str.nextLine();
            menu();
        }
        
    }
    

    
    
}
