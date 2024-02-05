package nl;

import nl.opdrachten.week_1.cilinderInhoud.CilinderInhoud;
import nl.playground.lists.arrays.ArrayPlayground;
import nl.playground.lists.hashmaps.HashMapBase64Encoder;
import nl.playground.lists.hashmaps.HashMapPlayGround;
import nl.playground.loops.Loops;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws JSONException {
        HashMapBase64Encoder encoder = new HashMapBase64Encoder();
        ArrayPlayground arrayPlayground = new ArrayPlayground();
        HashMapPlayGround hashMapPlayGround = new HashMapPlayGround();
        CilinderInhoud cilinderInhoud = new CilinderInhoud();
        Loops loops = new Loops();
        String[] autos = new String[10];
        String[] prices = new String[10];

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

 HashMap<String, String> myHashmap = new HashMap<>();
        myHashmap.put("key1", "value1");
        myHashmap.put("key2", "value2");

        // Convert hashmap to Base64
        String encodedData = encoder.hashmapToBase64(myHashmap);
        System.out.println("Base64 encoded: " + encodedData);

        // Convert Base64 back to hashmap
        HashMap<String, String> decodedHashmap = encoder.base64ToHashmap(encodedData);
        System.out.println("Decoded hashmap: " + decodedHashmap);



//      arrayPlayground.standardArray(autos);
//        HashMap<String, ArrayList<String[]>> resultaat = hashMapPlayGround.arrayToHashMapWithMultipleVal(autos, "Auto");

//      BetaalOverzichtGenerator betaalOverzichtGenerator = new BetaalOverzichtGenerator();

//      betaalOverzichtGenerator.Betaaloverzicht();
//        cilinderInhoud.CalculateCilinder();
//
//        loops.loopThroughArray();
//        loops.loopThrough2DArray();


    }
}