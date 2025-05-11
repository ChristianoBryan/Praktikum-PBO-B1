public class Kucing extends Anabul{
    public Kucing(String Nama){
        super(Nama);
    }

    public String getNama(){
        return this.Nama;
    }

    public String Gerak(){
        return "Kucing Bergerak dengan Melata";
    }

    public String Bersuara(){
        return "Kucing Bersuara Meong";
    }
}
