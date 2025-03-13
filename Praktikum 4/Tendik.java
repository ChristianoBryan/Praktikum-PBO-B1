import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai {
    private final int BUP = 55;
    private String Bidang;

    public Tendik(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String Bidang){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.Bidang = Bidang;
    }

    public String getBidang(){
        return Bidang;
    }

    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

    public String getJabatan(){
        return "Tenaga Kependidikan";
    }

    public String masaKerja() {
        LocalDate tanggalMulai = getTMT();
        LocalDate sekarang = LocalDate.now(); 
        Period periode = Period.between(tanggalMulai, sekarang);

        int tahun = periode.getYears();
        int bulan = periode.getMonths();

        return tahun + " Tahun " + bulan + " Bulan";
    }

    public String getTanggalBUP() {
        LocalDate birthDate = getTanggalLahir();
        LocalDate retirementDate = birthDate.plusYears(BUP);
        LocalDate bupDate = retirementDate.plusMonths(1).withDayOfMonth(1);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
        return bupDate.format(formatter);
    }

    public double tunjanganTendik(){
        LocalDate tanggalMulai = getTMT();
        LocalDate sekarang = LocalDate.now();
        int tahun = Period.between(tanggalMulai, sekarang).getYears();
        return 0.01*tahun*getGajiPokok();
    }

    public void printInfo(){
        System.out.println("NIP : " + getNIP());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getFormatTanggalLahir());
        System.out.println("TMT : " + getFormatTMT());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Bidang : " + getBidang());
        System.out.println("Masa Kerja : " + masaKerja());
        System.out.println("BUP : " + getTanggalBUP());
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Tunjangan : " + tunjanganTendik());
    }
}
