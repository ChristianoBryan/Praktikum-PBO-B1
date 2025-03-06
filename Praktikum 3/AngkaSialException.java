public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("Angka sial ditemukan!");
    }

    public AngkaSialException(String message){
        super(message);
    }
}
