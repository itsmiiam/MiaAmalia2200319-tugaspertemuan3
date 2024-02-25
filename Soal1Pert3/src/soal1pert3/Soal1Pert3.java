package soal1pert3;

import java.util.Scanner;

public class Soal1Pert3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.println("Masukkan tiga buah karakter (huruf kecil): ");
        String input = scanner.nextLine();

        //proses (memeriksa apakah yang diinput tepat 3 buah karakter)
        if (input.length() != 3) {
            System.out.println("Masukkan harus terdiri dari tiga karakter.");
        } else {
            char char1 = input.charAt(0);
            char char2 = input.charAt(1);
            char char3 = input.charAt(2);
            //proses (memeriksa apakah urutan karakter sesuai) dan output
            if (iniKonsonan(char1) && iniVokal(char2) && iniKonsonan(char3)) {
                System.out.println("Ini adalah pola konsonan-vokal-konsonan");//ouput
            } else {
                System.out.println("Pola konsonan-vokal-konsonan tidak ditemukan.");//ouput
            }
        }
    }

    // Method untuk memeriksa apakah karakter adalah konsonan
    public static boolean iniKonsonan(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }

    // Method untuk memeriksa apakah karakter adalah vokal
    public static boolean iniVokal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
