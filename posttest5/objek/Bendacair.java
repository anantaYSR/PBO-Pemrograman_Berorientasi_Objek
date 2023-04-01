package POSTTEST.posttest5.objek;

public final class Bendacair extends Barang {
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

}

