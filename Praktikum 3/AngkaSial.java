/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 */

 public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
 *  PERTANYAAN : 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 *               2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 */

 /*
  * Jawaban : 1. Baris 12 tidak dieksekusi jika eksepsi terjadi.
                 Karena ketika angka == 13, perintah throw new AngkaSialException(); langsung menghentikan eksekusi method,
                 sehingga baris setelahnya tidak dijalankan. Program langsung lompat ke blok catch untuk menangani eksepsi.

              2. Baris 21 akan dieksekusi ketika as.cobaAngka(13); dipanggil.
                 Karena ketika angka 13 diberikan, eksepsi AngkaSialException dilempar oleh throw new AngkaSialException();,
                 sehingga program langsung lompat ke blok catch, melewati sisa kode dalam try.
                 Lalu blok catch menangani eksepsi dengan mencetak pesan error dan peringatan.
  */