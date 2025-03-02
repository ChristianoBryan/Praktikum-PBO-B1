import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        nim = "#";
        nama = "#";
        prodi = "#";
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public ArrayList<MataKuliah> getArray(){
        return new ArrayList<>(this.listMatkul);
    }

    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setArray(ArrayList<MataKuliah> listMatkul){
        this.listMatkul = new ArrayList<>(listMatkul);
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for(int i = 0; i < listMatkul.size(); i++){
            totalSKS += listMatkul.get(i).getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public void printMhs(){
        System.out.println("NIM : " + getNim());
        System.out.println("Nama : " + getNama());
        System.out.println("Prodi : " + getProdi());
    }

    public void printDetailMhs(){
        System.out.println("NIM : " + getNim());
        System.out.println("Nama : " + getNama());
        System.out.println("Prodi : " + getProdi());
        System.out.println("Daftar Mata Kuliah yang diambil :");
        for(int i = 0; i < listMatkul.size(); i++){
            System.out.println("- " + listMatkul.get(i).getNama());
        }
        System.out.println("Nama Dosen Wali : " + getDosenWali().getNama());
        System.out.println("Jenis Kendaraan : " + getKendaraan().getJenis());
    }
}
