package nl;

import nl.opdrachten.week_1.cilinderInhoud.CilinderInhoud;
import nl.playground.lists.arrays.ArrayPlayground;
import nl.playground.lists.hashmaps.HashMapPlayGround;
import nl.playground.loops.Loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayPlayground arrayPlayground = new ArrayPlayground();
        HashMapPlayGround hashMapPlayGround = new HashMapPlayGround();
        String[] autos = new String[10];
        String[] prices = new String[10];
        Scanner scan = new Scanner(System.in);

        prices[0] = "100";
        prices[1] = "200";
        prices[2] = "300";
        prices[3] = "400";
        prices[4] = "500";
        prices[5] = "600";
        prices[6] = "700";
        prices[7] = "800";
        prices[8] = "900";
        prices[9] = "1000";


        autos[0] = "bmw";
        autos[1] = "Honda";
        autos[2] = "Ford";
        autos[3] = "Chevrolet";
        autos[4] = "Nissan";
        autos[5] = "Hyundai";
        autos[6] = "Volkswagen";
        autos[7] = "Mercedes";
        autos[8] = "Opel";
        autos[9] = "Toyota";



//        arrayPlayground.standardArray(autos);
        HashMap<String, ArrayList<String[]>> resultaat =  hashMapPlayGround.arrayToHashMapWithMultipleVal(autos, "Auto");

//        BetaalOverzichtGenerator betaalOverzichtGenerator = new BetaalOverzichtGenerator();

//        betaalOverzichtGenerator.Betaaloverzicht();
        CilinderInhoud cilinderInhoud = new CilinderInhoud();
        cilinderInhoud.CalculateCilinder();
        Loops loops = new Loops();
        loops.loopThroughArray();
        loops.loopThrough2DArray();



    }
}