package latihanMedium;

public class Senjata {
    private String Bunyi;
    private int Peluru;
    private boolean isMenusuk;
    
    public Senjata(String Bunyi){
        this.Bunyi = Bunyi;
    }
    
    public String getBunyi(){
        return this.Bunyi;
    }
    
    public int getPeluru(){
        return this.Peluru;
    }
    
    public boolean isMenusuk(){
        return this.isMenusuk;
    }
    
    public void setBunyi(String Bunyi){
        this.Bunyi = Bunyi;
    }
    
    public void setMenusuk(boolean isMenusuk){
        this.isMenusuk = isMenusuk;
    }
    
    public void setPeluru(int Peluru){
        this.Peluru = Peluru;
    }
}