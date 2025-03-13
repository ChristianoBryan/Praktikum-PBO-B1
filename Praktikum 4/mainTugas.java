import java.time.LocalDate;
public class mainTugas{
    public static void main(String[] args) {
        dosenTetap DTe1 = new dosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        Tendik T1 = new Tendik("8921732419", "Bryan", LocalDate.of(1980, 7, 10), LocalDate.of(2010, 3, 29), 3000000, "Akademik");
        dosenTamu DTa1 = new dosenTamu("2785238489", "Charles", LocalDate.of(1997, 9, 30), LocalDate.of(2021, 12, 12), 7000000, "Fakultas Teknik", "23567915", LocalDate.of(2060,10,15));
        DTe1.printInfo();
        System.out.println();
        T1.printInfo();
        System.out.println();
        DTa1.printInfo();

    }
}
