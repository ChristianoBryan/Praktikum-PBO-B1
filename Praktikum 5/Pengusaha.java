import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.DecimalFormat;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return this.npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public void setNip(String npwp){
        this.npwp = npwp;
    }

    public int getHitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(getTglMulaiKerja(), now);
        return period.getYears() + 7; //Digit ke-13 NIM : 7
    }

    public double hitungPajak(){
        return 0.15*getPendapatan();
    }

    public String getFormatTanggalMulaiKerja(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
        return tglMulaiKerja.format(formatter);
    }

    public void cetakInfo(){
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Mulai Kerja : " + getFormatTanggalMulaiKerja());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Pekerjaan : Pengusaha");
        System.out.println("Pendapatan : " + df.format(getPendapatan()));
        System.out.println("NPWP : " + getNpwp());
        System.out.println("Masa Kerja : " + getHitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}
