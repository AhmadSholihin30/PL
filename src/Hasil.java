public class Hasil {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(10, 5);
        System.out.println( "luas = " + pp.luas());
        pp.panjang = 20;
        System.out.println("Luas = " + pp.luas());
    }
}