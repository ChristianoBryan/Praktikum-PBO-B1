/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Christiano Bryan Budiman
 * Tanggal      : Selasa, 18 Februari 2025
 */

public class Titik {
    /****************ATRIBUT*****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;
    
    /****************METHOD*****************/
    //Konstruktor untuk membuat titik (0,0)
    Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }
    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }
    
    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }
    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }
    
    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }
    
    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }
    
    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }
    
    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    void printCounterTitik(){
        System.out.println(Titik.counterTitik);
    }

    int getKuadran(double absis, double ordinat) {
        if(absis > 0 && ordinat > 0){
            return 1;
        } 
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis < 0 && ordinat < 0){
            return 3;
        }
        else if (absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik T){
        double jarakX = T.absis - this.absis;
        double jarakY = T.ordinat - this.ordinat;
        return Math.sqrt(jarakX * jarakX + jarakY * jarakY);
    }

    void reflexsiX(){
        ordinat = ordinat*-1;
    }

    void reflexsiY(){
        absis = absis*-1;
    }

    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    @Override
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }
}