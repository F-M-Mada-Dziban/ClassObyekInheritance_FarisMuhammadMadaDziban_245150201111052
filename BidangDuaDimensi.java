abstract class BidangDuaDimensi {
    protected String nama;

    // Constructor
    public bidangDuaDimensi(String nama) {
        this.nama = nama;
    }

    // Method info
    public void info() {
        System.out.println("Nama Bidang: " + nama);
    }

    // Method luas (abstract, belum didefinisikan)
    public abstract double luas();
}
