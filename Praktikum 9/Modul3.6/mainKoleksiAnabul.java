public class mainKoleksiAnabul {
    public static void main(String [] args){
        KoleksiAnabul<Anabul> koleksiHewan = new KoleksiAnabul<>();

        koleksiHewan.add(new Kucing("Kucing 1"));
        koleksiHewan.add(new Anjing("Anjing 1"));
        koleksiHewan.add(new Burung("Burung 1"));
        koleksiHewan.add(new Kucing("Kucing liar"));
        koleksiHewan.add(new Anjing("Anjing barbar"));
        koleksiHewan.add(new Burung("Burung kakak muda"));
        koleksiHewan.add(new Kucing("Kucing jinak"));
        koleksiHewan.add(new Anjing("Anjing galak"));
        koleksiHewan.add(new Burung("Burung beo"));
        koleksiHewan.add(new Anjing("Anjing lari"));

        koleksiHewan.showAll();

        System.out.println("Jumlah elemen : " + koleksiHewan.getSize());
    }
}
