public class mainTugas {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Oggy");
        Anjing anjing1 = new Anjing("Bob");
        Burung burung1 = new Burung("Manuk");

        kucing1.Gerak();
        kucing1.Bersuara();

        anjing1.Gerak();
        anjing1.Bersuara();

        burung1.Gerak();
        burung1.Bersuara();
    }
}
