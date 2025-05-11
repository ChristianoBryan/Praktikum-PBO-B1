public class Koleksi {
    private int ukuran;
    private int nbElm;
    private char[] wadah;

    public Koleksi(int ukuran){
        this.ukuran = ukuran;
        nbElm = 0;
        wadah = new char[ukuran];
    }

    public char[] getIsi(){
        return wadah;
    }

    public void setIsi(char c, int idx){
        wadah[idx] = c;
    }
    
    public void add(char c){
        if(nbElm < ukuran){
            wadah[nbElm] = c;
            nbElm++;
        }
        else{
            System.out.println("Array penuh!");
        }
    }

    public int getSize(){
        return wadah.length;
    }

    public void delete(char c){
        int idx = -1;
        for(int i = 0; i < nbElm; i++){
            if(wadah[i] == c){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("Elemen tidak ditemukan");
        }

        for(int j = idx; j < nbElm; j++){
            wadah[j] = wadah[j+1];
        }
        nbElm--;
    }

    public void showAll(){
        for(int i = 0; i < nbElm; i++){
            System.out.println(wadah[i]);
        }
    }
}
