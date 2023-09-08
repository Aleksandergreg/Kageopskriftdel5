package kage;
import kage.Ingrediens;
import java.util.Scanner;
import kage.Opskrift;

import static kage.Farve.*;


public class Main {
    public static void main(String[] args) {


        //Lav scanner objekt 'input'
        Scanner input = new Scanner(System.in);

        //Variabler
        int antal;

        //Spørger bruger om hvor mange personer opskriften skal laves til
        System.out.println("Hvor mange personer vil du lave pandekager til?:");
        antal = input.nextInt();

        //Lav nyt opskrift objekt, 'Pandekager' som eksempel, antal fra tidligere
        Opskrift pandekager = new Opskrift("Pandekager", antal);

        System.out.println("Ingrediensliste til Aleksanders lækre pandekager!");
        System.out.println("--------------------------------");



        //Print ingredienser samt enhed og mængde i en tabel
        System.out.println(ANSI_CYAN + "| Mængde" + ANSI_GREEN + "| Enhed "+ ANSI_PURPLE + "| Type |" + ANSI_RESET);
        System.out.println("|----------|-------|------|");
        for (Ingrediens ingrediens : pandekager.getIngredienser()) {
            System.out.printf(ANSI_CYAN + "|%.0f "+ ANSI_GREEN +"|%s" +ANSI_PURPLE + "|%s|%n" + ANSI_RESET, ingrediens.beregnMængde(),
                    ingrediens.getEnhed(), ingrediens.getType());
        }

        System.out.println("----------------------------------------");

        //Print ingrediensers samlede vægt samt gennemsnit
        System.out.println(ANSI_YELLOW + "Total vægt: " + pandekager.beregnTotalVægt() + " g.");
        System.out.println("Gennemsnit vægt pr. ingrediens: " + pandekager.beregnGennemsnitVægt() + " g." + ANSI_RESET);

        System.out.println("----------------------------------------");

        //Print ingrediensers samlede Kcal samt gennemsnit
        System.out.printf(ANSI_RED + "Total kcal: %.2f kcal" + '\n', pandekager.beregnTotalKcal());
        System.out.printf("Gennemsnit kcal pr. ingrediens: %.2f kcal" + '\n' ,pandekager.beregnGennemsnitKcal());
        System.out.printf("Gennemsnit kJ pr. ingrediens: %.2f kJ", pandekager.beregnGennemsnitKJ());
        System.out.println("Hvordan virker GITHUB");
    }
}
