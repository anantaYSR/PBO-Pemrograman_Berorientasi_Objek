package POSTTEST.posttest3.objek;

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

}
