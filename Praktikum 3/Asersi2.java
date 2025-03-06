/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input 
 *             jari-jari lingkaran yang bernilai nol
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/*
 * PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
*/

/*
 * JAWABAN : Daripada mengandalkan asersi, sebaiknya kita mencegah pembuatan objek Lingkaran dengan nilai jari - jari yang tidak valid
 * dengan melemparkan exception IllegalArgumentException dalam konstruktor untuk memastikan objek Lingkaran hanya dibuat dengan nilai valid, karena
 * exception lebih fleksibel dibandingkan asersi karena tidak bergantung pada -ea dan bisa ditangani dengan try-catch
 * 
 */
