import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    private String NIP;
    private String Nama;
    private LocalDate tanggalLahir;
    private LocalDate TMT;
    private int gajiPokok;

    public Pegawai(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return this.NIP;
    }

    public String getNama(){
        return this.Nama;
    }

    public LocalDate getTanggalLahir(){
        return this.tanggalLahir;
    }

    public String getFormatTanggalLahir(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
        return this.getTanggalLahir().format(formatter);
    }

    public LocalDate getTMT(){
        return this.TMT;
    }

    public String getFormatTMT() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
        return this.getTMT().format(formatter);
    }

    public int getGajiPokok(){
        return this.gajiPokok;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
}
