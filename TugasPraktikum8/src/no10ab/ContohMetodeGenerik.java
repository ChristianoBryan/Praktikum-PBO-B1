package no10ab;

public class ContohMetodeGenerik {
    public static <T extends Anabul> void kontrol(Datum<T> datum){
        T isiHewan = datum.getIsi();
        isiHewan.Bersuara();
    }
}
