public class Burung extends Anabul{
    public Burung(String Nama){
        super(Nama);
    }

    public String getNama(){
        return this.Nama;
    }

    public String Gerak(){
        return "Burung Bergerak dengan Terbang";
    }

    public String Bersuara(){
        return "Burung Bersuara Cuit";
    }
}
