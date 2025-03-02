public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        noPlat = "#";
        jenis = "#";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getnoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
