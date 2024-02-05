package nl.playground.loops;

import java.util.Arrays;

public class Loops {
    //Simpele for loop
    public void looper() {
        // Eerst declare je een iterator kan van alles zijn in dit geval, is het standaard de i.
        for (int i = 0; i < 10; i++) {
            System.out.println("Hallo wereld");
        }
    }

    //
    public void loopThroughArray() {
        String[] arr = {"test", "test1", "test2", "test3", "test4"};
        //Simpele manier om door een array te loopen en de inhoud te tonen
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
        }

    }

    public void loopThrough2DArray() {
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8 ,9}
        };

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length ; j++) {
                System.out.println(twoDArray[i][j]);

            }
        }


    }

}
