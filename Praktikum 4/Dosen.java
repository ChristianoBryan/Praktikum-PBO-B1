import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String Fakultas;

    public Dosen(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String Fakultas){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
    }

    public String getFakultas(){
        return Fakultas;
    }

    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }
}
