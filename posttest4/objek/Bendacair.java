package POSTTEST.posttest4.objek;

public class Bendacair extends Barang {
    private String Jenis_cairan;

    public Bendacair(String kargo_pengirim, String nama_barang, int jumlah_barang, String kategori, String satuan_barang, String Jenis_cairan){
        super(kargo_pengirim,nama_barang,jumlah_barang,kategori,satuan_barang,Jenis_cairan);
        this.Jenis_cairan = Jenis_cairan;
    }

    public String getJenis_cairan() {
        return Jenis_cairan;
    }

    public void setJenis_cairan(String jenis_cairan) {
        this.Jenis_cairan = jenis_cairan;
    }

    @Override
    public void isAdded() {
        System.out.println("\nDengan Jenis Barang Cair     : " + this.Jenis_cairan);
        System.out.println("\bBerhasil ditambahkan");
    }

    
}
