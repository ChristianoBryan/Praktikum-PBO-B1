public class Anjing extends Anabul{
    public Anjing(String Nama){
        super(Nama);
    }

    public String getNama(){
        return this.Nama;
    }

    public String Gerak(){
        return "Anjing Bergerak dengan Melata";
    }

    public String Bersuara(){
        return "Anjing Bersuara Guk-guk";
    }
}
