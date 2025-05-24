package program;

import model.Mahasiswa;
import service.MySQLMahasiswaService;
import java.util.ArrayList;
import java.util.List;

public class Program {
    
    static MySQLMahasiswaService service = new MySQLMahasiswaService();
    public static void main(String[] args) {
    
    List<Mahasiswa> listmhs = new ArrayList<>();
    System.out.println("");

    // insert
    System.out.println("==insert");
    Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
    service.add(mhsAdd);
    System.out.println("berhasil insert: " + mhsAdd);
    displayAll();

    // update
    System.out.println("==update");
    Mahasiswa mhsUpdate = service.getById(5);
    if (mhsUpdate != null) {
        System.out.println("Akan dupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
    } else {
        System.out.println("Mahasiswa dengan ID 5 tidak ditemukan! Tidak bisa update.");
    }

    // delete
    System.out.println("==delete");
    System.out.println("akan di delete: " + service.getById(5));
    service.delete(5);
    displayAll();
    }
    private static void displayAll() {
        List<Mahasiswa> allStudents = service.getAll();
        System.out.println("\n=== Daftar Mahasiswa ===");
            for (Mahasiswa mhs : allStudents) {
                System.out.println(mhs);
            }
        System.out.println("Total: " + allStudents.size() + " mahasiswa\n");
    }
}