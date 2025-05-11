import java.util.ArrayList;

public class KoleksiAnabul<T extends Anabul> {
    private ArrayList<T> koleksi;

    public KoleksiAnabul(){
        koleksi = new ArrayList<>();
    }

    public void add(T hewan){
        koleksi.add(hewan);
    }

    public void showAll(){
        for(T hewan : koleksi){
            System.out.println("Nama : " + hewan.getNama());
            System.out.println("Cara bergerak : " + hewan.Gerak());
            System.out.println("Bunyinya : " + hewan.Bersuara());
            System.out.println("----------------------------------------------");
        }
    }

    public int getSize(){
        return koleksi.size();
    }
}
