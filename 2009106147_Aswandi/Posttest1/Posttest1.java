import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Posttest1 {
    static ArrayList ListTokoBuah = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void ShowMenu() throws IOException{
        System.out.println("======Menu=====");
        System.out.println("[1] Show All Data Toko Buah");
        System.out.println("[2] Tambah Data Toko Buah");
        System.out.println("[3] Edit Data Toko Buah");
        System.out.println("[4] Hapus Data Toko Buah");
        System.out.println("[5] Exit");
        System.out.println("Pilih menu>");
        
        int PilihMenu = Integer.valueOf(input.readLine());
        switch(PilihMenu){
            case 1:
                showAllTokoBuah();
                break;
            case 2:
                TambahTokoBuah();
                break;
            case 3:
                EditTokoBuah();
                break;
            case 4:
                HapusTokoBuah();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan anda tidak tersedia");
        }
    }
        static void showAllTokoBuah(){
            if(ListTokoBuah.isEmpty()){
                System.out.println("Belum ada data");
            } else {
                for(int i = 0; i < ListTokoBuah.size(); i++){
                    System.out.println(String.format("[%d] %s",i, ListTokoBuah.get(i)));
                }
            }     
        }
        static void TambahTokoBuah() throws IOException{
            System.out.println("Nama Toko Buah:");
            String namatokobuah = input.readLine();
            ListTokoBuah.add(namatokobuah);
        }
        static void EditTokoBuah() throws IOException{
            showAllTokoBuah();
            System.out.print("Pilih nomor Data Toko Buah:");
            int indexTokoBuah = Integer.valueOf(input.readLine());
            
            System.out.println("Nama Toko Buah:");
            String namaBaru = input.readLine();
            
            ListTokoBuah.set(indexTokoBuah, namaBaru);
        }
        static void HapusTokoBuah() throws IOException{
            showAllTokoBuah();
            System.out.print("Pilih Data Toko Buah Yang Ingin dihapus:");
            int indexTokoBuah = Integer.valueOf(input.readLine());
            
            ListTokoBuah.remove(indexTokoBuah);
        }
        public static void main(String[] args)throws IOException{
            do{
                ShowMenu();
            }while (isRunning);
        }
    }

    


