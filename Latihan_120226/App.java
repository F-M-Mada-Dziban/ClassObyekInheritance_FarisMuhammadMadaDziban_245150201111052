public class App {
    public static void main(String[] args) {

        bujurSangkar bs = new bujurSangkar("Bujur Sangkar", 20);
        Lingkaran ling = new Lingkaran("Lingkaran", 7);

        bs.info();
        System.out.println("Luas: " + bs.luas());

        System.out.println();

        ling.info();
        System.out.println("Luas: " + ling.luas());
    }
}
