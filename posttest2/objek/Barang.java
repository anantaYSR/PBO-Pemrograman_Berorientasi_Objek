package POSTTEST.posttest2.objek;


public class Barang {
    // property
    private String kargo_pengirim;
    private String nama_barang;
    private String kategori;
    private int jumlah_barang;
    private String satuan_barang;
    

    // pembuatan encapsulation (getter and stter)
    public String getKargo_pengirim() {
        return kargo_pengirim;
    }

    public void setKargo_pengirim(String kargo_pengirim) {
        this.kargo_pengirim = kargo_pengirim;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public String getSatuan_barang() {
        return satuan_barang;
    }

    public void setSatuan_barang(String satuan_barang) {
        this.satuan_barang = satuan_barang;
    }

    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggill
    public Barang(String kargo_pengirim, String nama_barang, int jumlah_barang, String kategori, String satuan_barang){
        this.kargo_pengirim = kargo_pengirim;
        this.nama_barang = nama_barang;
        this.jumlah_barang = jumlah_barang;
        this.kategori = kategori;
        this.satuan_barang = satuan_barang;
    }
}