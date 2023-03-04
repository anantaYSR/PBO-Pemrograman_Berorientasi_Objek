package POSTTEST.posttest1.objek;


public class Barang {
    // property
    public String kargo_pengirim;
    public String nama_barang;
    public String kategori;
    public int jumlah_barang;
    public String satuan_barang;
    


    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggill
    public Barang(String kargo_pengirim, String nama_barang, int jumlah_barang, String kategori, String satuan_barang){
        this.kargo_pengirim = kargo_pengirim;
        this.nama_barang = nama_barang;
        this.jumlah_barang = jumlah_barang;
        this.kategori = kategori;
        this.satuan_barang = satuan_barang;

    }

}