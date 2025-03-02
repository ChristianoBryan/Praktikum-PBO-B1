public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah(){
        idMatKul = "#";
        nama = "#";
        sks = 0;
    }

    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getidMatKul(){
        return this.idMatKul;
    }

    public String getNama(){
        return this.nama;
    }

    public int getSks(){
        return this.sks;
    }

    public void setidMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}
