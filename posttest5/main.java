package POSTTEST.posttest5;

// import/memanggil data pada file folder lain, hal ini dapat di lakukan karena merupakan public class
import POSTTEST.posttest5.objek.Bendacair;
import POSTTEST.posttest5.objek.Bendapadat;
import POSTTEST.posttest5.objek.Barang;

// import semua utilitas java menggunakan *
import java.util.*;
import java.io.*;

public class main{

    static ArrayList<Barang> barang = new ArrayList<Barang>();
    static ArrayList<Bendacair> bendacair = new ArrayList<Bendacair>();
    static ArrayList<Bendapadat> bendapadat = new ArrayList<Bendapadat>();
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
        String addJenis_cairan;
        String addJenis_barangpdt;
        
        System.out.println("Nambah data");
        System.out.println("1. Benda Cair");
        System.out.println("2. Benda Padat");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan){
            case 1:
                System.out.println("===== Benda Cair =====");
                System.out.print("Nama Kargo Pengirim  \n\t 1.JNE \n\t 2.JNT \n\t 3.SiCepat \n");
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
                System.out.print("Masukan Merk Barang       : ");
                String addkategori = br.readLine();
                System.out.print("Nama Satuan Barang         \n\t 1.Kilo \n\t 2.Pack \n\t 3.Dus \n");
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
                System.out.print("Jenis cairan      \n\t 1.Kimia \n\t 2.minuman \n\t 3.lainnya \n");
                System.out.print("Masukan Jenis Cairan     : ");
                nilai  = input.nextInt();
                    if (nilai == 1)
                    {
                        addJenis_cairan = "Kimia";
                    }
                    else if (nilai == 2)
                    {
                        addJenis_cairan = "Minuman"; 
                    }
                    else {
                        addJenis_cairan = "Lainnya"; 
                    };
                Bendacair bndcair = new Bendacair(addkargo_pengirim, addnama_barang, addjumlah_barang, addkategori, addsatuan_barang, addJenis_cairan, addnama_barang); 
                // add == menambahkan data ke array list
                bendacair.add(bndcair);
                bndcair.isAdded();
                break;

                case 2:
                System.out.println("===== Benda Padat =====");
                    System.out.print("Nama Kargo Pengirim  \n\t 1.JNE \n\t 2.JNT \n\t 3.SiCepat \n");
                    System.out.print("Masukan Nama Kargo Pengirim:");
                    Scanner input1 = new Scanner(System.in);
                    nilai  = input1.nextInt();
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
                    String addnama_barang1 = br.readLine();
                    System.out.print("Masukan Jumlah Barang     : ");
                    int addjumlah_barang1 = Integer.parseInt(br.readLine());
                    System.out.print("Masukan Merk Barang       : ");
                    String addkategori1 = br.readLine();

                    System.out.print("Nama Satuan Barang         \n\t 1.Kilo \n\t 2.Pack \n\t 3.Dus \n");
                    System.out.print("Masukan Satuan Barang     : ");
                    nilai  = input1.nextInt();
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
                    System.out.print("Jenis Benda Padat   \n\t 1.Kimia \n\t 2.Makanan \n\t 3.lainnya \n");
                    System.out.print("Masukan Jenis Benda Padat     : ");
                    nilai  = input1.nextInt();
                        if (nilai == 1)
                        {
                            addJenis_barangpdt = "Kimia";
                        }
                        else if (nilai == 2)
                        {
                            addJenis_barangpdt = "Makanan"; 
                        }
                        else {
                            addJenis_barangpdt = "Lainnya"; 
                        };
                    
                    Bendapadat bndpdt = new Bendapadat(addkargo_pengirim, addnama_barang1, addjumlah_barang1, addkategori1, addsatuan_barang, addJenis_barangpdt); 
                    // add == menambahkan data ke array list
                    bendapadat.add(bndpdt);
                    bndpdt.isAdded();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
        }
    }

    //fungsi overloading untuk total data
    public static int tampilkandata(int x, int y) {
        return x + y;
    }

    // fungsi global untuk menampilkan data yang di simpan di array list
    /// I itu permisalan untuk index karena array list = array :v
    /// size == ukuran / panjang array list.
    public static void tampilkandata() throws IOException{
    int myNum = tampilkandata(bendacair.size(), bendapadat.size());
    System.out.println("TOTAL DATA : " + myNum);
    System.out.println("\nLihat data");
    System.out.println("1. Barang Cair");
    System.out.println("2. Barang Padat");
    System.out.print("Masukan Pilihan : ");
    int pilihan = Integer.parseInt(br.readLine());

    switch (pilihan){
        case 1 :
            System.out.println("===== Benda Cair =====");
            for (int index = 0; index < bendacair.size(); index++) {
                System.out.println("ID = " + (index+1));
                //karena index itu 0 maka ditambah 1
                // get == mengambil data dari array list
                bendacair.get(index).display();
                System.out.print("\n");
                }
                int index = 0;
                    index++;
                if(index > 0 && index <= bendacair.size()) {
                    System.out.println("---------------------------------------");
                }else{
                    System.out.println("Data Tidak ada");
                }
            break;
        
            case 2 :
                System.out.println("===== Benda Padat =====");
                for (int index1 = 0; index1 < bendapadat.size(); index1++) {
                    System.out.println("ID = " + (index1+1));
                    //karena index itu 0 maka ditambah 1
                    // get == mengambil data dari array list
                    bendapadat.get(index1).display();
                    System.out.print("\n");
                    }
                    int index1 = 0;
                        index1++;
                    if(index1 > 0 && index1 <= bendapadat.size()) {
                        System.out.println("---------------------------------------");
                    }else{
                        System.out.println("Data Tidak ada");
                    }
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }


    // fungsi global untuk memngupdate data 
    public static void updatedata() throws IOException{
        int nilai;
        String addkargo_pengirim;
        String addsatuan_barang;
        String addjenis_cairan;
        String addjenis_barangpdt;

        int myNum = tampilkandata(bendacair.size(), bendapadat.size());
        System.out.println("TOTAL DATA : " + myNum);
        System.out.println("Ubah Data Barang");
        System.out.println("1. Benda Cair");
        System.out.println("2. Benda Padat");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1 :
                System.out.println("===== Benda Cair =====");
                for (int index = 0; index < bendacair.size(); index++) {
                    System.out.println("ID = " + (index+1));
                    bendacair.get(index).display();
                }
        
                if (bendacair.size() == 0) {
                    System.out.println("data tidak ada!.");
                } else {
                    System.out.print("Masukan ID barang : ");
                    int index = Integer.parseInt(br.readLine());
        
                    if (index < 1 || index >bendacair.size()) {
                        System.out.println("Invalid ID.");
                    } else {
                        
                        
            
                        System.out.print("Nama Kargo Pengirim  \n\t 1.JNE \n\t 2.JNT \n\t 3. SiCepat \n");
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
                        System.out.print("Masukan Merk Barang       : ");
                        String addkategori = br.readLine();
            
                        System.out.print("Nama Satuan Barang         \n\t 1.Kilo \n\t 2.Pack \n\t 3.Dus \n");
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
                        System.out.print("Jenis_cairan   \n\t 1.Kimia \n\t 2.minuman \n\t 3.lainnya \n");
                        System.out.print("Masukan Jenis Cairan    : ");
                        nilai  = input.nextInt();
                            if (nilai == 1)
                            {
                                addjenis_cairan = "Kimia";
                            }
                            else if (nilai == 2)
                            {
                                addjenis_cairan = "Minuman"; 
                            }
                            else {
                                addjenis_cairan = "Lainnya"; 
                            };
                        
                        bendacair.get(index - 1).setKargo_pengirim(addkargo_pengirim);
                        bendacair.get(index - 1).setNama_barang(addnama_barang);
                        bendacair.get(index - 1).setJumlah_barang(addjumlah_barang);
                        bendacair.get(index - 1).setKategori(addkategori);
                        bendacair.get(index - 1).setSatuan_barang(addsatuan_barang);
                        bendacair.get(index - 1).setJenis_cairan(addjenis_cairan);
                        System.out.println("Data berhasil diedit!");
                    }
                }
                break;

            case 2:
                System.out.println("===== Benda Padat =====");
                for (int index1 = 0; index1 < bendapadat.size(); index1++) {
                    System.out.println("ID = " + (index1+1));
                    bendapadat.get(index1).display();
                }
        
                if (bendapadat.size() == 0) {
                    System.out.println("data tidak ada!.");
                } else {
                    System.out.print("Masukan ID barang : ");
                    int index1 = Integer.parseInt(br.readLine());
        
                    if (index1 < 1 || index1 >bendapadat.size()) {
                        System.out.println("Invalid ID.");
                    } else {
                        System.out.print("Nama Kargo Pengirim  \n\t 1.JNE \n\t 2.JNT \n\t 3. SiCepat \n");
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
                        System.out.print("Masukan Merk Barang       : ");
                        String addkategori = br.readLine();
            
                        System.out.print("Nama Satuan Barang         \n\t 1.Kilo \n\t 2.Pack \n\t 3.Dus \n");
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
                        System.out.print("Jenis Benda Padat  : \n\t 1.Kimia \n\t 2.Makanan \n\t 3.lainnya \n");
                        System.out.print("Masukan Jenis Benda Padat     : ");
                        nilai  = input.nextInt();
                            if (nilai == 1)
                            {
                                addjenis_barangpdt = "Kimia";
                            }
                            else if (nilai == 2)
                            {
                                addjenis_barangpdt = "Makanan"; 
                            }
                            else {
                                addjenis_barangpdt = "Lainnya"; 
                            };
                        bendapadat.get(index1 - 1).setKargo_pengirim(addkargo_pengirim);
                        bendapadat.get(index1 - 1).setNama_barang(addnama_barang);
                        bendapadat.get(index1 - 1).setJumlah_barang(addjumlah_barang);
                        bendapadat.get(index1 - 1).setKategori(addkategori);
                        bendapadat.get(index1 - 1).setSatuan_barang(addsatuan_barang);
                        bendapadat.get(index1 - 1).setJenis_barangpdt(addjenis_barangpdt);
                        System.out.println("Data berhasil diedit!");
                    }
                }
                break;
            default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
    }

    // fungsi menghapus data 
    public static void deletedata() throws IOException{  
        int myNum = tampilkandata(bendacair.size(), bendapadat.size());
        System.out.println("TOTAL DATA : " + myNum);
        System.out.println("Hapus Data Barang");
        System.out.println("1. Benda Cair");
        System.out.println("2. Benda Padat");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.println("===== Benda Cair =====");
                for (int index = 0; index < bendacair.size(); index++) {
                    bendacair.get(index).display();
                }
            
                    if (bendacair.size() == 0) {
                        System.out.println("data tidak ada!.");
                    } else {
                        System.out.print("Masukan ID barang : ");
                        int index = Integer.parseInt(br.readLine());
                
                        if (index < 1 || index > bendacair.size()) {
                            System.out.println("Invalid ID.");
                        } else {
                            bendacair.remove(index - 1);
                
                            System.out.println("Data deleted successfully.");
                        }
                }
                break;
            
                case 2 :
                    System.out.println("===== Benda Padat =====");
                    for (int index1 = 0; index1 < bendapadat.size(); index1++) {
                        System.out.println("ID = " + (index1+1));
                        bendapadat.get(index1).display();
                    }
                        System.out.print("Masukkan indeks Barang: ");
                        int index1 = Integer.parseInt(br.readLine());
                
                        if(index1 <= bendapadat.size() || index1 > 0) {
                            bendapadat.remove(index1 - 1);
                            
                            System.out.println("Data berhasil dihapus!");
                        }else{
                            System.out.println("Data Tidak ada");
                        }
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
        }        
    }
}