package latihanMedium;

public class KontrolSenjata {
    private Senjata s;
    
    public KontrolSenjata(Senjata s){
        this.s = s;
    }
    
    public boolean isAdaPeluru(){
        return s.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        System.out.println(">> Peluru Berhasil ditambah : " + jumPeluru);
        s.setPeluru(s.getPeluru() + jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali!");
        if(!isAdaPeluru()){
            System.out.println("Peluru Habis");
        }
        else{
            for(int i = 1; i <= jumlah; i++){
                if(isAdaPeluru()){
                    System.out.println(s.getBunyi());
                    s.setPeluru(s.getPeluru() - 1);
                }
                else{
                    System.out.println("Gagal tembak, peluru habis");
                }
            }
            System.out.println(">> Peluru sisa : " + s.getPeluru());
        }
    }
    public String menusuk() {
        if (s.isMenusuk()) {
            return "OUCHH";
        }
        else{
            return "Belum dipasang bayonet";
        }
    }

    public void pasangBayonet() {
        s.setMenusuk(true);
    }
}