/* kiiruse konverter
Juhuslik kiirus 5-110 km konverteerida mph.
Vastus ümardada kolm kohta peale koma. Ümardamine toimub väljastamisel.
Kasutajalt küsida mitu juhuslikku konverteerimist teha.
Lubatud on 1-5 korda mitu korda kasutaja tahab vastust näha.
Vigase sisestuse puhul tehakse 1 kord.
Konverteerimiseks kirjuta meetod - eraldi funktsioon.
Annad ette kmh ja tagastab vastuse mph.
Vastus kujul:
1. kmh = mph
2. kmh = mph

*/
// kõik kood ühes publicus, va konverter meetod

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App2 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) throws IOException {

        // int count = scanner.nextInt();
        int x = 0;
        try {
            System.out.print("Sisesta, mitu korda tahad juhuslikku kiirust sisestada: ");
            // try blokk on järgmise jaoks
            x  = scanner.nextInt(); // loeb sisse integeri - mitu korda
            if (x < 1 || x > 5) {
                x = 1; // vale valik
            }

        } catch (InputMismatchException e) {
            x = 1; // pole number
        }

        for (int y = 1; y <= x; y++) {
            int max = 110, min = 5;
            int kmh = random.nextInt((max - min + 1) + min);
            double mph = convertKmMph(kmh);
            System.out.printf("%d. %d => %.3f%n", y, kmh, mph);
        }
        // meetod kasutajalt küsimiseks
    }
//    private static int getCount() {
//        try {
//            System.out.print("Sisesta, mitu korda tahad juhuslikku kiirust sisestada: ");
//            // try blokk on järgmise jaoks
//            int x  = scanner.nextInt(); // loeb sisse integeri - mitu korda
//            if (x >= 1 && x <= 5) {
//                return x;
//            } return 1;
//
//        } catch (InputMismatchException e) {
//            return 1; // pole number
//        }
//    }

//    public static int generateRandInt() { // juhuslik km.
//        // public saab mujalt klassist välja kutsuda kui public
//        Random random = new Random();
//        int max = 110, min = 5;
//        return random.nextInt((max - min + 1) + min);
//    }

    public static double convertKmMph(int kmh) { // genereerib juhusliku kiiruse
        // kmh läheb kaasa
        return kmh * 0.621371;
        // result = generateRandInt();
        // meetod, mis arvutab numbri
    }
}

