public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungKeliling() {
        return 3*alas; //Asumsi segitiga sama sisi
    }

    public double hitungLuas() {
        return tinggi*alas*0.5;
    }
}
