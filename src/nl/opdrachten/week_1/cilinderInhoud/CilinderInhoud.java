package nl.opdrachten.week_1.cilinderInhoud;

import java.util.Scanner;

public class CilinderInhoud {
    final double pi = 3.141592653f;
    Scanner scan = new Scanner(System.in);

    public void CalculateCilinder() {
        System.out.println("Inhoud van een cilinder wordt berekend.");

        System.out.println("Wat is de straal?");
        double straal =  scan.nextDouble();

        System.out.println("Wat is de hoogte?");
        double hoogte = scan.nextDouble();

        double inhoud = straal * straal * pi * hoogte;

        System.out.println("De inhoud van de cilinder is: " + inhoud);
    }
}
