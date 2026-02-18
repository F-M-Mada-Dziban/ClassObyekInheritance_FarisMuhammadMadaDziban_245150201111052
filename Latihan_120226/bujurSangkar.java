class bujurSangkar extends bidangDuaDimensi {
    private double sisi;

    // Constructor
    public bujurSangkar(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    // Override method luas
    @Override
    public double luas() {
        return sisi * sisi;
    }
}
