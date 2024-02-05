package nl.playground.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayPlayground {
    // Een standaard array die wordt gelooped doormiddel van een for loop
    public void standardArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }




        public ArrayList<String> standardArrayUsingStreamFilter (String[]array, String arg, ArrayList < String > newList)
        {
            Arrays.stream(array)
                    .filter(s -> s.equals(arg))
                    .forEach(newList::add);

            return newList;
        }
    }