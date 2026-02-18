abstract class bidangDuaDimensi {
    protected String nama;

    public bidangDuaDimensi(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama Bidang: " + nama);
    }

    public abstract double luas();
}


