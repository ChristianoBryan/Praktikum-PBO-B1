import java.util.ArrayList;
import java.util.List;

/**
 * File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("luas lingkaran : " + bdg.hitungLuas());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());

        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> kotak = new BangunDatarGeneric<Persegi>();
        kotak.set(p);
        System.out.println("keliling persegi : " + kotak.hitungKeliling());
        System.out.println("luas persegi : " + kotak.hitungLuas());
        System.out.println("tipe generic : " + kotak.get().getClass().getName());

        Persegipanjang pp = new Persegipanjang(5,7);
        BangunDatarGeneric<Persegipanjang> kotakpanjang = new BangunDatarGeneric<Persegipanjang>();
        kotakpanjang.set(pp);
        System.out.println("keliling persegi panjang : " + kotakpanjang.hitungKeliling());
        System.out.println("luas persegi panjang : " + kotakpanjang.hitungLuas());
        System.out.println("tipe generic : " + kotakpanjang.get().getClass().getName());

        Segitiga s = new Segitiga(7,9);
        BangunDatarGeneric<Segitiga> sg = new BangunDatarGeneric<Segitiga>();
        sg.set(s);
        System.out.println("keliling Segitiga: " + sg.hitungKeliling());
        System.out.println("luas Segitiga : " + sg.hitungLuas());
        System.out.println("tipe generic : " + sg.get().getClass().getName());
    }
}
