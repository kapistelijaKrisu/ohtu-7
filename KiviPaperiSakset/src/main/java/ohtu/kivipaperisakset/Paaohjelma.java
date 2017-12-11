package ohtu.kivipaperisakset;

import java.util.Scanner;
import ohtu.kivipaperisakset.pelimoodit.Peli;
import ohtu.kivipaperisakset.tekoaly.Ihminen;
import ohtu.kivipaperisakset.tekoaly.Tekoaly;
import ohtu.kivipaperisakset.tekoaly.TekoalyParannettu;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();

            Peli peli = null;
            if (vastaus.endsWith("a")) {
                peli = new Peli(new Ihminen(scanner), new Ihminen(scanner), "Ensimmäisen pelaajan siirto: ", "Toisen pelaajan siirto: ");
            } else if (vastaus.endsWith("b")) {
                peli = new Peli(new Ihminen(scanner), new Tekoaly(), "Ensimmäisen pelaajan siirto: ", "Tietokone valitsi: ");
            } else if (vastaus.endsWith("c")) {
                peli = new Peli(new Ihminen(scanner), new TekoalyParannettu(20), "Ensimmäisen pelaajan siirto: ", "Tietokone valitsi: ");

            } else {
                return;
            }
            peli.pelaa();

        }

    }
}
