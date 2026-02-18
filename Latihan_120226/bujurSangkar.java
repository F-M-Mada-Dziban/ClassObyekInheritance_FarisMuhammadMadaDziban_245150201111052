class bujurSangkar extends bidangDuaDimensi {
    private double sisi;

    public bujurSangkar(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}

