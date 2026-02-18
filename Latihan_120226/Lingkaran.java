class Lingkaran extends bidangDuaDimensi {
    private double jariJari;

    // Constructor
    public Lingkaran(String nama, double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    // Override method luas
    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }
}
