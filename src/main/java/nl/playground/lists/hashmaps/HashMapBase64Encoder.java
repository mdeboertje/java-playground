package nl.playground.lists.hashmaps;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapBase64Encoder {
    // Hashmap to base64 using json
    public  String jsonHashmapToBase64(HashMap<String, String> map) {
        String data = new JSONObject(map).toString();

        byte[] binaryData = data.getBytes();

        return Base64.getEncoder().encodeToString(binaryData);
    }

    // Base64 to hashmap using json
    public HashMap<String, String> jsonBase64ToHashMap(String base64Encoded) throws JSONException {
        byte[] binaryData = Base64.getDecoder().decode(base64Encoded);

        String data = new String(binaryData);

        JSONObject jsonObject = new JSONObject(data);
        HashMap<String, String> myHashmap = new HashMap<>();

        for (Iterator it = jsonObject.keys(); it.hasNext(); ) {
            String key = (String) it.next();
            myHashmap.put(key, jsonObject.getString(key));
        }

        return myHashmap;
    }

   // Encoder without using JSON Object
    public String hashmapToBase64(HashMap<String, String> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

            objectOutputStream.writeObject(map);

            objectOutputStream.close();
            byteArrayOutputStream.close();

            byte[] binaryData = byteArrayOutputStream.toByteArray();

            return Base64.getEncoder().encodeToString(binaryData);
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    // Decoder without JSON object
    public HashMap<String, String> base64ToHashmap(String encoded){
        try {
            byte[] binData = Base64.getDecoder().decode(encoded);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(binData);

            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            Object obj = objectInputStream.readObject();

            objectInputStream.close();
            byteArrayInputStream.close();

            return (HashMap<String, String>) obj;


        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
}