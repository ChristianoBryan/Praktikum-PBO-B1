public abstract class Pegawai {
    protected String nama;
    protected final int gajiPokok = 5000000;

    public Pegawai(String nama){
        this.nama = nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public abstract void tampilData();
}
