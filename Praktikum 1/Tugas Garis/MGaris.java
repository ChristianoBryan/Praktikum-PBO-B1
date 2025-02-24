/* Nama File    : Garis.java
 * Deskripsi    : Tugas Latihan 1 : Berisi atribut dan method dalam class Garis
 * Pembuat      : Christiano Bryan Budiman
 * Tanggal      : Selasa, 18 Februari 2025
 */

public class MGaris {
    public static void main(String[] args){
        Garis G1 = new Garis();

        Titik t1 = new Titik(-5,7);
        Titik t2 = new Titik(8,9);
        Garis G2 = new Garis(t1,t2);

        Titik t4 = new Titik(-5,7);
        Titik t5 = new Titik(-3,-6);
        Garis G3 = new Garis(t4,t5);

        Titik t6 = new Titik(5,5);
        Titik t7 = new Titik(10,10);
        Garis G4 = new Garis(t6,t7);

        G1.printGaris();
        G2.printGaris();

        System.out.println("Panjang Garis : " + G1.panjangGaris());
        System.out.println("Gradien Garis : " + G2.gradien());

        Titik TengahG1 = G1.titikTengah();

        System.out.println();

        System.out.println("Titik Tengah G1 :");
        TengahG1.printTitik();

        System.out.println();

        System.out.println("Jumlah Garis : " + Garis.getCounterGaris());

        System.out.println("Apakah Sejajar? : " + G1.isSejajar(G4));
        System.out.println("Apakah Tegak Lurus? : " + G2.isTegakLurus(G3));

        G3.printGaris();

        System.out.println("Persamaan Garis : " + G3.getPersamaan());
    }
}
