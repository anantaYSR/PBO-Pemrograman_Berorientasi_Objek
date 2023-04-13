package POSTTEST.posttest6.objek;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import POSTTEST.posttest6.Inter_face.interface2;

public class Bendapadat extends Barang implements interface2 {

    static ArrayList<Barang> barang = new ArrayList<Barang>();
    static ArrayList<Bendapadat> bendapadat = new ArrayList<Bendapadat>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    private String Jenis_barangpdt;
    final String status = "Barang Gudang Dari "+ this.kargo_pengirim;


    public Bendapadat(String kargo_pengirim, String nama_barang, int jumlah_barang, String kategori, String satuan_barang, String Jenis_barangpdt){
        super(kargo_pengirim,nama_barang,jumlah_barang,kategori,satuan_barang,Jenis_barangpdt);
        this.Jenis_barangpdt = Jenis_barangpdt;
    }

    public String getJenis_barangpdt() {
        return Jenis_barangpdt;
    }

    public void setJenis_barangpdt(String jenis_barangpdt) {
        this.Jenis_barangpdt = jenis_barangpdt;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public final void isAdded() {
        System.out.println("\nStatus                        : " + this.status);
        System.out.println("Dengan Jenis Barang Padat     : " + this.Jenis_barangpdt);
        System.out.println("\bBerhasil ditambahkan");
    }

    @Override
    public void display(){
        System.out.println("Nama Kargo Penirim  : " + this.getKargo_pengirim());
        System.out.println("Nama barang         : " + this.getNama_barang());
        System.out.println("Jumlah barang       : " + this.getJumlah_barang());
        System.out.println("Merk Barang         : " + this.getKategori());
        System.out.println("Satuan barang       : " + this.getSatuan_barang());
        System.out.println("Jenis Cairan        : " + this.getJenis_barangpdt());
        System.out.print("\n");
        }

    
    public final static void clearscreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @Override
    public void tambahkandata() throws IOException{
        clearscreen();
        int nilai;
        String addkargo_pengirim;
        String addsatuan_barang;
        String addJenis_barangpdt;
        System.out.println("=====|| Nambah data ||=====");
        System.out.println("=====   Benda Padat   =====");
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
    }

    // fungsi global untuk menampilkan data yang di simpan di array list
    /// I itu permisalan untuk index karena array list = array :v
    /// size == ukuran / panjang array list.
    @Override
    public void tampilkandata() throws IOException{
    clearscreen();
    System.out.println("=====|| Lihat Data ||=====");
    System.out.println("=====   Benda Padat  =====");
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
        
    }

    @Override
    public void updatedata() throws IOException{
        clearscreen();
        int nilai;
        String addkargo_pengirim;
        String addsatuan_barang;
        String addjenis_barangpdt;
        
        System.out.println("=====|| Ubah Data ||=====");
        System.out.println("=====  Benda Padat  =====");
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
    }

    @Override
    public void deletedata() throws IOException{  
        clearscreen();
        System.out.println("=====|| Hapus Data ||=====");
        System.out.println("=====   Benda Padat  =====");
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
    }
    

    @Override
    public void menubendapdt() throws IOException {
        boolean stop = false;
        while (stop == false){
            clearscreen();
            System.out.print("==============================================\n");
            System.out.print("+++ SISTEM PENDATAAN INVENTORI PERGUDANGAN +++\n");
            System.out.print(">>>>>>>>>>>>>>>>  Barang Padat  <<<<<<<<<<<<<<\n");
            System.out.print("==============================================\n");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Kembali");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan){
                case 1:
                tambahkandata();
                    break;
                case 2:
                tampilkandata();
                    break;
                case 3:
                updatedata();
                    break;
                case 4:
                deletedata();
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

