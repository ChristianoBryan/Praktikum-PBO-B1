package no10ab;

public class mainDatum {
    public static void main(String[] args){
        Datum<Anabul> dataAnabul = new Datum<>();

        dataAnabul.setIsi(new Anjing());
        dataAnabul.getIsi().Bersuara();

        dataAnabul.setIsi(new Kucing());
        dataAnabul.getIsi().Bersuara();

        dataAnabul.setIsi(new Burung());
        dataAnabul.getIsi().Bersuara();
    }
}
