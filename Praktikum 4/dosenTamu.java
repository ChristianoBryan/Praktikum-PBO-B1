import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class dosenTamu extends Dosen {
    private String NIDK;
    private LocalDate akhirKontrak;


    public dosenTamu(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String Fakultas, String NIDK, LocalDate akhirKontrak){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public String getJabatan(){
        return "Dosen Tamu";
    }

    public String getAkhirKontrak(){
        @SuppressWarnings("deprecation")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return akhirKontrak.format(formatter);
    }

    public void setAkhirKontrak(LocalDate akhirKontrak){
        this.akhirKontrak = akhirKontrak;
    }

    public int getSisaKontrak() {
        return (int)ChronoUnit.MONTHS.between(LocalDate.now(), akhirKontrak);
    }

    public String masaKerja() {
        LocalDate tanggalMulai = getTMT();
        LocalDate sekarang = LocalDate.now(); 
        Period periode = Period.between(tanggalMulai, sekarang);

        int tahun = periode.getYears();
        int bulan = periode.getMonths();

        return tahun + " Tahun " + bulan + " Bulan";
    }

    public double tunjanganDosenTamu(){
        LocalDate tanggalMulai = getTMT();
        LocalDate sekarang = LocalDate.now();
        int tahun = Period.between(tanggalMulai, sekarang).getYears();
        return 0.025*tahun*getGajiPokok();
    }

    public void printInfo(){
        System.out.println("NIP : " + getNIP());
        System.out.println("NIDK : " + getNIDK());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getFormatTanggalLahir());
        System.out.println("TMT : " + getFormatTMT());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa Kerja : " + masaKerja());
        System.out.println("Sisa Kontrak : " + getSisaKontrak() + " Bulan");
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Tunjangan : " + tunjanganDosenTamu());
    }
}
