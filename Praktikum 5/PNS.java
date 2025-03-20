import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.DecimalFormat;

public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return this.nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public int getHitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(getTglMulaiKerja(), now);
        return period.getYears() + 9; //Digit ke-14 NIM : 9
    }

    public double hitungPajak(){
        return 0.1*getPendapatan();
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
        System.out.println("Pekerjaan : PNS");
        System.out.println("Pendapatan : " + df.format(getPendapatan()));
        System.out.println("NIP : " + getNip());
        System.out.println("Masa Kerja : " + getHitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}
