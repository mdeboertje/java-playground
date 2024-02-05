package nl.playground.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPlayGround {
     public HashMap<String, ArrayList<String[]>> arrayToHashMapWithMultipleVal(String[] arr, String K) {
        HashMap<String, ArrayList<String[]>> map = new HashMap<>();
        map.put(K, new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            map.get(K).add(new String[]{arr[i]});
        }
        return map;
    }

 public HashMap<String, ArrayList<String[]>> mergeHashMap(HashMap<String, ArrayList<String[]>> map1, HashMap<String, ArrayList<String[]>> map2, String K) {
    if (!map1.containsKey(K)) {
        map1.put(K, new ArrayList<>());
    }

    if (map2.containsKey(K)) {
        map1.get(K).addAll(map2.get(K));
    }

    return map1;
}

}
