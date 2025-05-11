public class Persegipanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public Persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling() {
        return (2*lebar) + (2*panjang);
    }

    public double hitungLuas() {
        return lebar*panjang;
    }
}
