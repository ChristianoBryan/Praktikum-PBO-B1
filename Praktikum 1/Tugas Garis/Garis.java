/* Nama File    : Garis.java
 * Deskripsi    : Tugas Latihan 1 : Berisi atribut dan method dalam class Garis
 * Pembuat      : Christiano Bryan Budiman
 * Tanggal      : Selasa, 18 Februari 2025
 */

public class Garis{
    /****************ATRIBUT*****************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /****************METHOD*****************/
    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    Garis(){
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double panjangGaris(){
        double jarakX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double jarakY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(jarakX * jarakX + jarakY * jarakY);
    }

    double gradien(){
        return (titikAkhir.ordinat - titikAwal.ordinat) / (titikAkhir.absis - titikAwal.absis);
    }

    Titik titikTengah(){
        double TengahX = (titikAwal.absis + titikAkhir.absis) / 2;
        double TengahY = (titikAwal.ordinat + titikAkhir.ordinat) / 2;
        return new Titik(TengahX,TengahY);
    }

    boolean isSejajar(Garis G){
        return this.gradien() == G.gradien();
    }

    boolean isTegakLurus(Garis G){
        return this.gradien() * G.gradien() == -1;
    }

    void printGaris(){
        System.out.println("Garis dari Titik Awal(" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ") ke Titik Akhir" +"(" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    double getConstant(){
        return titikAwal.getOrdinat() - (gradien() * titikAwal.getAbsis());
    }

    String getPersamaan(){
        return "y = " + this.gradien()+"x" + "+" + "(" + getConstant() + ")";
    }
}