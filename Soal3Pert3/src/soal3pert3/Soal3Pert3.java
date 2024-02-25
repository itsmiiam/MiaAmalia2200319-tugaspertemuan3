package soal3pert3;

import java.util.Scanner;

public class Soal3Pert3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input : Meminta pengguna untuk memasukkan jam masuk
        System.out.println("Jam masuk (1-12): ");
        int jamMasuk = input.nextInt();

        // Input : Meminta pengguna untuk memasukkan jam keluar
        System.out.println("Jam keluar (1-12): ");
        int jamKeluar = input.nextInt();

        // Proses : Menghitung lama bekerja
        int lamaBekerja;
        if (jamKeluar >= jamMasuk) {
            lamaBekerja = jamKeluar - jamMasuk;
        } else {
            lamaBekerja = 12 - jamMasuk + jamKeluar;
        }

        // Output : Menampilkan hasil
        System.out.println("Lama Bekerja " + lamaBekerja + " Jam");
    }
}
