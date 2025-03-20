import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.DecimalFormat;

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota(){
        return this.asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    public void setNip(String asal_kota){
        this.asal_kota = asal_kota;
    }

    public int getHitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(getTglMulaiKerja(), now);
        return period.getYears();
    }

    public double hitungPajak(){
        return 0;
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
        System.out.println("Pekerjaan : Petani");
        System.out.println("Pendapatan : " + df.format(getPendapatan()));
        System.out.println("Asal Kota : " + getAsalKota());
        System.out.println("Masa Kerja : " + getHitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}
