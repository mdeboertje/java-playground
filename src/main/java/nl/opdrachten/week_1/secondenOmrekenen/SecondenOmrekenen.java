package nl.opdrachten.week_1.secondenOmrekenen;

import java.util.Scanner;

public class SecondenOmrekenen {
    Scanner input = new Scanner(System.in);
    long aantalSecondenInJaar = 365 * 24 * 60 * 60;
    long aantalSecondenInDag = 24 * 60 * 60;
    long aantalSecondenInUur = 60 * 60;
    long aantalSecondenInMinuut = 60;

    public void secondenOmrekenen() {

        System.out.println("Hoeveel seconden moeten er worden omgerekend? ");
        long aantalSecondenTotaal = input.nextLong();

        long aantalJaar = aantalSecondenTotaal / aantalSecondenInJaar;
        long aantalSecondenResterend = aantalSecondenTotaal % aantalSecondenInJaar;

        long aantalDagen = aantalSecondenResterend / aantalSecondenInUur;
        aantalSecondenResterend %= aantalSecondenInDag;

        long aantalUren = aantalSecondenResterend / aantalSecondenInUur;
        aantalSecondenResterend %= aantalSecondenInMinuut;

        long aantalMinuten = aantalSecondenResterend / aantalSecondenInMinuut;
        aantalSecondenResterend %= aantalSecondenInMinuut;

        System.out.println("Aantal jaar: " + aantalJaar);
        System.out.println("Aantal dagen: " + aantalDagen);
        System.out.println("Aantal uren: " + aantalUren);
        System.out.println("Aantal minuten: " + aantalMinuten);
        System.out.println("Aantal seconden: " + aantalSecondenResterend);

    }
}
