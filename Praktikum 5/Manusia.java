import java.time.LocalDate;

abstract class Manusia{
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama(){
        return this.nama;
    }

    public LocalDate getTglMulaiKerja(){
        return this.tglMulaiKerja;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public double getPendapatan(){
        return this.pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja){
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }
}
