package no10ab;

public class mainKontrol {
    public static void main(String[] args) {
        Datum<Anjing> datumAnjing = new Datum<>();
        datumAnjing.setIsi(new Anjing());

        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(new Kucing());

        Datum<Burung> datumBurung = new Datum<>();
        datumBurung.setIsi(new Burung());

        ContohMetodeGenerik.kontrol(datumAnjing);
        ContohMetodeGenerik.kontrol(datumKucing);
        ContohMetodeGenerik.kontrol(datumBurung);
    }
}