import java.util.Arrays;

public class mainKoleksi {
    public static void main(String[] args) {
        Koleksi koleksi = new Koleksi(10);

        koleksi.add('A');
        koleksi.add('B');
        koleksi.add('C');
        koleksi.add('D');
        koleksi.add('E');
        koleksi.delete('C');

        koleksi.setIsi('O', 0);

        System.out.println("Isi koleksi :");
        System.out.println(Arrays.toString(koleksi.getIsi()));
        
        System.out.println("Ukuran koleksi : " + koleksi.getSize());
        System.out.println("Show All :");
        koleksi.showAll();
    }
}
