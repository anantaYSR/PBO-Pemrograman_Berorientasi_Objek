package POSTTEST.posttest6.objek;

import java.io.IOException;

import POSTTEST.posttest6.ClassInterface.interface1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;



public class Bendacair extends Barang implements interface1{

    static ArrayList<Barang> barang = new ArrayList<Barang>();
    static ArrayList<Bendacair> bendacair = new ArrayList<Bendacair>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    private String jenis_cairan;
    final String status = "Barang Gudang Dari "+ this.kargo_pengirim;

    public Bendacair(String kargo_pengirim, String nama_barang, int jumlah_barang, String kategori, String satuan_barang, String jenis_cairan, String status){
        super(kargo_pengirim,nama_barang,jumlah_barang,kategori,satuan_barang,jenis_cairan);
        this.jenis_cairan = jenis_cairan;
    }

    public String getJenis_cairan() {
        return jenis_cairan;
    }

    public void setJenis_cairan(final String jenis_cairan) {
        this.jenis_cairan = jenis_cairan;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public final void isAdded() {
        System.out.println("\nStatus                       : " + this.status);
        System.out.println("Dengan Jenis Barang Cair     : " + this.jenis_cairan);
        System.out.println("\bBerhasil ditambahkan");
    }

    @Override
    public void display(){
        System.out.println("Nama Kargo Penirim  : " + this.getKargo_pengirim());
        System.out.println("Nama barang         : " + this.getNama_barang());
        System.out.println("Jumlah barang       : " + this.getJumlah_barang());
        System.out.println("Merk Barang         : " + this.getKategori());
        System.out.println("Satuan barang       : " + this.getSatuan_barang());
        System.out.println("Jenis Cairan        : " + this.getJenis_cairan());
        System.out.print("\n");
        }

    
    public final static void clearscreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    @Override
    public void tambahkandata1() throws IOException{
            
        int nilai;
        String addkargo_pengirim;
        String addsatuan_barang;
        String addJenis_cairan;
        
        System.out.println("Nambah data");
        System.out.println("Benda Cair \n\n");
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
    }

    // fungsi global untuk menampilkan data yang di simpan di array list
    /// I itu permisalan untuk index karena array list = array :v
    /// size == ukuran / panjang array list.
    @Override
    public void tampilkandata1() throws IOException{
    System.out.println("\nLihat data");
    System.out.println("Barang Cair");
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
        
    }

    @Override
    public void updatedata1() throws IOException{
        int nilai;
        String addkargo_pengirim;
        String addsatuan_barang;
        String addjenis_cairan;

        System.out.println("Ubah Data Barang");
        System.out.println("Benda Cair");
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
    }

    @Override
    public void deletedata1() throws IOException{  
        System.out.println("Hapus Data Barang");
        System.out.println("Benda Cair");
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
    }

    @Override
    public void menubendacair1() throws IOException {
        boolean stop = false;
        while (stop == false){
            System.out.println("------------------------------------------");
            System.out.println(">>>>>>>>>>>>> DATA INFORMASI <<<<<<<<<<<<<");
            System.out.println(">>>>>>>>>>>>> SERVICE LAPTOP <<<<<<<<<<<<<");
            System.out.println("------------------------------------------");
            System.out.println("1. Tambah Data Service");
            System.out.println("2. Lihat Data Service");
            System.out.println("3. Perbarui Data Service");
            System.out.println("4. Hapus Data Service");
            System.out.println("5. Kembali");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan){
                case 1:
                tambahkandata1();
                    break;
                case 2:
                tampilkandata1();
                    break;
                case 3:
                updatedata1();
                    break;
                case 4:
                deletedata1();
                    break;
                case 5:
                    stop = true;
                    break;
                default:
                    System.out.println("Pilihan Tidak Ada");
                    break;
            }
        }
    }
}

