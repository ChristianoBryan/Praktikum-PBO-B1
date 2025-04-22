public class Manajer extends Pegawai {
    private final int tunjangan = 700000;

    public Manajer(String nama){
        super(nama);
    }

    public void tampilData(){
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
    }
}
