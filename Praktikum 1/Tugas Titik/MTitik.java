/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Christiano Bryan Budiman
 * Tanggal      : Selasa, 18 Februari 2025
 */

 public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);  //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat((10));
        T2.printTitik();

        Titik T3 = new Titik(); //Membuat objek titik T1 (0,0)
        Titik T4 = new Titik(3,5); //Membuat objek titik T2 (3,5)
        System.out.println("T3 absis: " + T3.getAbsis() + ", ordinat: " + T3.getOrdinat());
        System.out.println("T4 absis: " + T4.getAbsis() + ", ordinat: " + T4.getOrdinat());

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        Titik T5 = new Titik(-5.0,-12.0);
        int kuadran = T5.getKuadran(T5.getAbsis(),T5.getOrdinat());
        System.out.println("Kuadrannya adalah " + kuadran);

        System.out.println();

        System.out.println("Jarak ke T5 pusat : " + T5.getJarakPusat());
        System.out.println("Jarak ke T5 ke T2 : " + T5.getJarak(T2));

        System.out.println();

        System.out.println("Hasil Refleksi X : ");
        T5.reflexsiX();
        T5.printTitik();

        System.out.println();

        System.out.println("Hasil Refleksi Y : ");
        T2.reflexsiY();
        T2.printTitik();

        System.out.println();
        
        System.out.print("Titik Asli (T5) : ");
        T5.printTitik();
        Titik refleksiT5 = T5.getRefleksiX();
        System.out.print("Titik Hasil Refleksi Sumbu X : ");
        refleksiT5.printTitik();

        System.out.println();

        System.out.print("Titik Asli (T2) : ");
        T2.printTitik();
        Titik refleksiT2 = T2.getRefleksiY();
        System.out.print("Titik Hasil Refleksi Sumbu Y : ");
        refleksiT2.printTitik();

        T1.printTitik();
    }
}