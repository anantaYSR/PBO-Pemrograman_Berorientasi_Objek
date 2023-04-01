package POSTTEST.posttest5.objek;

public final class Bendapadat extends Barang {
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
}
