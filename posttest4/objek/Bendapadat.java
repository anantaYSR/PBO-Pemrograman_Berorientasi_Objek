package POSTTEST.posttest4.objek;

public class Bendapadat extends Barang {
    private String Jenis_barangpdt;

    public Bendapadat(String kargo_pengirim, String nama_barang, int jumlah_barang, String kategori, String satuan_barang, String Jenis_barangpdt){
        super(kargo_pengirim,nama_barang,jumlah_barang,kategori,satuan_barang,Jenis_barangpdt);
        this.Jenis_barangpdt = Jenis_barangpdt;
    }

    public String getJenis_barangpdt() {
        return Jenis_barangpdt;
    }

    public void setJenis_barangpdt(String jenis_barangpdt) {
        Jenis_barangpdt = jenis_barangpdt;
    }

    String cekInfo(int Barang) { 
        return "Barang dengan jumlah : \n "+jumlah_barang; 
    }

    String cekInfo(String pemilik) { 
        return "Dan ini merupakan jenis benda : " +Jenis_barangpdt ; 
    }

    @Override
    public void isAdded() {
        System.out.println("\nDengan Jenis Barang Padat     : " + this.Jenis_barangpdt);
        System.out.println("\bBerhasil ditambahkan");
    }

}
