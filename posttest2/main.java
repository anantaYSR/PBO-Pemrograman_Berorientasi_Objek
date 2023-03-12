package POSTTEST.posttest2;

// import/memanggil data pada file folder lain, hal ini dapat di lakukan karena merupakan public class
import POSTTEST.posttest2.objek.Barang;

// import semua utilitas java menggunakan *
import java.util.*;
import java.io.*;

public class main{
    static ArrayList<Barang> barang = new ArrayList<Barang>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{

        // iniliasasi variabel
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLnajutkan = true;
        

        while (isLnajutkan){
            clearScreen();
            System.out.print("==============================================\n");
            System.out.print("+++ SISTEM PENDATAAN INVENTORI PERGUDANGAN +++\n");
            System.out.print("==============================================\n");
            System.out.print("1. Read \n");
            System.out.print("2. Cread\n");
            System.out.print("3. Update\n");
            System.out.print("4. Delete\n");
            System.out.print("5. EXIT\n");
            System.out.print(" Masukan Pilihan : ");

            pilihanUser = terminalInput.next();

            switch(pilihanUser){
                case "1":
                    System.out.println("\n===================");
                    System.out.println("LIST BARANG GUDANG");
                    System.out.println("===================\n");
                    tampilkandata();
                    break;
                case "2":
                    System.out.println("\n===================");
                    System.out.println("   TAMBAH BARANG");
                    System.out.println("===================\n");
                    tambahkandata();
                    break;
                case "3":
                    System.out.println("\n===================");
                    System.out.println("    UBAH BARANG");
                    System.out.println("===================\n");
                    updatedata();
                    break;
                case "4":
                    System.out.println("\n===================");
                    System.out.println("    HAPUS BARANG");
                    System.out.println("===================\n");
                    deletedata();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default :
                    System.err.println("\nPilihan Tidak Ada");
                    
            }

            isLnajutkan = getYesorNo("apakah anda ingin melanjutkan");
        }
    }

    // fungsi sendiri (privat) untuk perulangan program utama 
    private static boolean getYesorNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+message+" (y/n)? ");
        String pilihanUser = terminalInput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" (y/n)? ");
            pilihanUser = terminalInput.next();
        }
        return pilihanUser.equalsIgnoreCase("y");
    }

    //fungsi clearscreen pada terminal vscode, cmd dan power cell
    private static void clearScreen(){
        try{
            if (System.getProperty("os.name").contains("windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }


    // tambahkan data dengan menggunakan IOException sebagai inputan 
    public static void tambahkandata() throws IOException{
        int nilai;
        String addkargo_pengirim;
        String addsatuan_barang;

        System.out.print("Nama Kargo Pengirim : \n\t 1.JNE \n\t 2.JNT \n\t 3.SiCepat \n");
        System.out.print("Masukan Nama Kargo Pengirim:");

        Scanner input = new Scanner(System.in);
        nilai  = input.nextInt();
            if (nilai == 1)
            {
                addkargo_pengirim = "JNE";
            }
            else if (nilai == 2)
            {
                addkargo_pengirim = "JNT"; 
            }
            else {
                addkargo_pengirim = "SiCepat"; 
            };
            
        System.out.print("Masukan Nama Barang       : ");
        String addnama_barang = br.readLine();
        System.out.print("Masukan Jumlah Barang     : ");
        int addjumlah_barang = Integer.parseInt(br.readLine());
        System.out.print("Masukan Kategori Barang   : ");
        String addkategori = br.readLine();

        System.out.print("Nama Satuan Barang        : \n\t 1.Kilo \n\t 2.Pack \n\t 3.Dus \n");
        System.out.print("Masukan Satuan Barang     : ");
        nilai  = input.nextInt();
            if (nilai == 1)
            {
                addsatuan_barang = "Kilo";
            }
            else if (nilai == 2)
            {
                addsatuan_barang = "Pack"; 
            }
            else {
                addsatuan_barang = "Dus"; 
            };
        Barang stokbarang = new Barang(addkargo_pengirim, addnama_barang, addjumlah_barang, addkategori, addsatuan_barang); 
        // add == menambahkan data ke array list
        barang.add(stokbarang);
    }

    // fungsi global untuk menampilkan data yang di simpan di array list
    public static void tampilkandata() throws IOException{
    /// I itu permisalan untuk index karena array list = array :v
    /// size == ukuran / panjang array list.
    
    for (int index = 0; index < barang.size(); index++) {
        System.out.println("ID = " + (index+1));
        //karena index itu 0 maka ditambah 1
        // get == mengambil data dari array list
        System.out.println("Nama Kargo Penirim  : " + barang.get(index).getKargo_pengirim());
        System.out.println("Nama barang         : " + barang.get(index).getNama_barang());
        System.out.println("Jumlah barang       : " + barang.get(index).getJumlah_barang());
        System.out.println("Kategori barang     : " + barang.get(index).getKategori());
        System.out.println("Satuan barang       : " + barang.get(index).getSatuan_barang());
        System.out.print("\n");
        }
        int index = 0;
            index++;
        if(index > 0 && index <= barang.size()) {
            System.out.println("---------------------------------------");
        }else{
            System.out.println("Data Tidak ada");
        }
    }


    // fungsi global untuk memngupdate data 
    public static void updatedata() throws IOException{
        // fungsi for di gunakan untuk mengecek data pada array, jika data lebih dari 0 maka jalan kan perintah
        for (int index = 0; index < barang.size(); index++) {
            System.out.println("ID = " + (index+1));
            System.out.println("Nama Kargo Penirim  : " + barang.get(index).getKargo_pengirim());
            System.out.println("Nama barang         : " + barang.get(index).getNama_barang());
            System.out.println("Jumlah barang       : " + barang.get(index).getJumlah_barang());
            System.out.println("Kategori barang     : " + barang.get(index).getKategori());
            System.out.println("Satuan barang       : " + barang.get(index).getSatuan_barang());
            System.out.print("\n");
        }

        if (barang.size() == 0) {
            System.out.println("data tidak ada!.");
        } else {
            System.out.print("Masukan ID barang : ");
            int index = Integer.parseInt(br.readLine());

            if (index < 1 || index > barang.size()) {
                System.out.println("Invalid ID.");
            } else {
                
                int nilai;
                String addkargo_pengirim;
                String addsatuan_barang;
    
                System.out.print("Nama Kargo Pengirim : \n\t 1.JNE \n\t 2.JNT \n\t 3. SiCepat \n");
                System.out.print("Masukan Nama Kargo Pengirim:");
    
                Scanner input = new Scanner(System.in);
                nilai  = input.nextInt();
                    if (nilai == 1)
                    {
                        addkargo_pengirim = "JNE";
                    }
                    else if (nilai == 2)
                    {
                        addkargo_pengirim = "JNT"; 
                    }
                    else {
                        addkargo_pengirim = "SiCepat"; 
                    };
                    
                System.out.print("Masukan Nama Barang       : ");
                String addnama_barang = br.readLine();
                System.out.print("Masukan Jumlah Barang     : ");
                int addjumlah_barang = Integer.parseInt(br.readLine());
                System.out.print("Masukan Kategori Barang   : ");
                String addkategori = br.readLine();
    
                System.out.print("Nama Satuan Barang        : \n\t 1.Kilo \n\t 2.Pack \n\t 3.Dus \n");
                System.out.print("Masukan Satuan Barang     : ");
                nilai  = input.nextInt();
                    if (nilai == 1)
                    {
                        addsatuan_barang = "Kilo";
                    }
                    else if (nilai == 2)
                    {
                        addsatuan_barang = "Pack"; 
                    }
                    else {
                        addsatuan_barang = "Dus"; 
                    };
                Barang stokbarang = new Barang(addkargo_pengirim, addnama_barang, addjumlah_barang, addkategori, addsatuan_barang); 
                barang.set(index - 1, stokbarang);
                System.out.println("Data berhasil diedit!");
            }
        }
    }

    // fungsi menghapus data 
    public static void deletedata() throws IOException{  
        for (int index = 0; index < barang.size(); index++) {
            System.out.println("ID = " + (index+1));
            //karena index itu 0 maka ditambah 1
            // get == mengambil data dari array list
            System.out.println("Nama Kargo Penirim  : " + barang.get(index).getKargo_pengirim());
            System.out.println("Nama barang         : " + barang.get(index).getNama_barang());
            System.out.println("Jumlah barang       : " + barang.get(index).getJumlah_barang());
            System.out.println("Kategori barang     : " + barang.get(index).getKategori());
            System.out.println("Satuan barang       : " + barang.get(index).getSatuan_barang());
            System.out.print("\n");
        }

        if (barang.size() == 0) {
            System.out.println("data tidak ada!.");
        } else {
            System.out.print("Masukan ID barang : ");
            int index = Integer.parseInt(br.readLine());
    
            if (index < 1 || index > barang.size()) {
                System.out.println("Invalid ID.");
            } else {
                barang.remove(index - 1);
    
                System.out.println("Data deleted successfully.");
            }
    }
}
}







