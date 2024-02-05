package nl.opdrachten.betaalOverzichtGenerator;

import java.util.Scanner;

public class BetaalOverzichtGenerator {
    Scanner input = new Scanner(System.in);

    final double appel = 0.50f;
    final double peer = 0.70f;
    final double aardappel = 0.65f;
    static final int BTW = 21;

    double verkoopprijsAppel = appel * (1.0 + BTW / 100.00);
    double verkoopprijsPeer = peer * (1.0 + BTW / 100.00);
    double verkoopprijsAardappel = aardappel * (1.0 + BTW / 100.00);

    public void Betaaloverzicht() {
        System.out.println("Wat is je naam?");
        String naam = input.next();
        System.out.println("De BTW is: " + BTW);
        System.out.println("De verkoopprijs van een appel is: " + verkoopprijsAppel);
        System.out.println("Hoeveel appels wil je kopen?");
        int hoeveelheidAppels = input.nextInt();
        System.out.println("De verkoopprijs van een peer is: " + verkoopprijsPeer);
        System.out.println("Hoeveel peren wil je kopen?");
        int hoeveelheidPeren = input.nextInt();
        System.out.println("De verkoopprijs van een aardappel is: " + verkoopprijsAardappel);
        System.out.println("Hoeveel aardappelen wil je kopen?");
        int hoeveelheidAardappelen = input.nextInt();

        double totaalKostenAppels = verkoopprijsAppel * hoeveelheidAppels;
        double totaalKostenPeren = verkoopprijsPeer * hoeveelheidPeren;
        double totaalKostenAardapelen = verkoopprijsAardappel * hoeveelheidAardappelen;

        double totaalBTWAppels = BTW / 100.0 * totaalKostenAppels;
        double totaalBTWPeren = BTW / 100.0 * totaalKostenPeren;
        double totaalBTWAardappelen = BTW / 100.0 * totaalKostenAardapelen;

        double totaleOmzetAppels = totaalKostenAppels * (1 + BTW / 100.0);
        double totaleOmzetPeren = totaalKostenPeren * (1 + BTW / 100.0);
        double totaleOmzetAardappelen = totaalKostenAardapelen * (1 + BTW / 100.0);

        double totaleOmzetAlles = totaleOmzetAppels + totaleOmzetPeren + totaleOmzetAardappelen;
        double totaleBTW = totaalBTWAppels + totaalBTWPeren + totaalBTWAardappelen;

        System.out.println("Beste " + naam);
        System.out.println("========================");
        System.out.println("Aantal appels: " + hoeveelheidAppels);
        System.out.println("Totaal kostprijs van de appels: " + totaalKostenAppels);
        System.out.println("Totale BTW van de appels: " + totaalBTWAppels);
        System.out.println("Totale omzet van de appels: " + totaleOmzetAppels + "\n");
        System.out.println("Aantal peren: " + hoeveelheidPeren);
        System.out.println("Totaal kostprijs van de peren: " + totaalKostenPeren);
        System.out.println("Totale BTW van de peren: " + totaalBTWPeren);
        System.out.println("Totale omzet van de appels: " + totaleOmzetPeren + "\n");
        System.out.println("Aantal aardappelen: " + hoeveelheidAardappelen);
        System.out.println("Totaal kostprijs van de aardeppelen: " + totaalKostenAardapelen);
        System.out.println("Totale BTW van de aardappelen: " + totaalBTWAardappelen);
        System.out.println("Totale omzet van de appels: " + totaleOmzetAardappelen + "\n");

        System.out.println("Totale omzet incl. BTW:\t" + totaleOmzetAlles);
        System.out.println("Totale BTW:\t\t\t\t" + totaleBTW);

    }


}
