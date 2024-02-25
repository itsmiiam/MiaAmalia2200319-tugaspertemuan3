package soal2pert3;

import java.util.Scanner;

public class Soal2Pert3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input : Meminta pengguna untuk memasukkan panjang sisi
        System.out.println("Masukkan sisi : ");
        double sisi1 = input.nextDouble(); // Membaca sisi pertama dari pengguna
        double sisi2 = input.nextDouble(); // Membaca sisi kedua dari pengguna
        double sisi3 = input.nextDouble(); // Membaca sisi ketiga dari pengguna

        // Proses : Memeriksa apakah semua sisi sama
        if (sisi1 == sisi2 && sisi2 == sisi3) { // Jika semua sisi sama
            System.out.println("Termasuk Kubus"); // Output : Mencetak pesan bahwa bentuk tersebut adalah kubus
        } else { // Jika ada sisi yang berbeda
            System.out.println("Bukan Kubus"); // Output : Mencetak pesan bahwa bentuk tersebut bukan kubus
        }
    }
}

