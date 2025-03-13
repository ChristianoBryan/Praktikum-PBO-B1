import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class dosenTetap extends Dosen {
    private String NIDN;
    private final int BUP = 65;

    public dosenTetap(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String Fakultas, String NIDN){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public String getJabatan(){
        return "Dosen Tetap";
    }

    public String getNIDN(){
        return NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public String getTanggalBUP() {
        LocalDate birthDate = getTanggalLahir();
        LocalDate retirementDate = birthDate.plusYears(BUP);
        LocalDate bupDate = retirementDate.plusMonths(1).withDayOfMonth(1);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
        return bupDate.format(formatter);
    }

    public String masaKerja() {
        LocalDate tanggalMulai = getTMT();
        LocalDate sekarang = LocalDate.now(); 
        Period periode = Period.between(tanggalMulai, sekarang);

        int tahun = periode.getYears();
        int bulan = periode.getMonths();

        return tahun + " Tahun " + bulan + " Bulan";
    }

    public double tunjanganDosenTetap(){
        LocalDate tanggalMulai = getTMT();
        LocalDate sekarang = LocalDate.now();
        int tahun = Period.between(tanggalMulai, sekarang).getYears();
        return 0.02*tahun*getGajiPokok();
    }

    public void printInfo(){
        System.out.println("NIP : " + getNIP());
        System.out.println("NIDN : " + getNIDN());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getFormatTanggalLahir());
        System.out.println("TMT : " + getFormatTMT());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa Kerja : " + masaKerja());
        System.out.println("BUP : " + getTanggalBUP());
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Tunjangan : " + tunjanganDosenTetap());
    }
}
