package nl.hashmap;

import java.util.HashMap;

import nl.playground.lists.hashmaps.HashMapBase64Encoder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Base64EncoderTest {

    @Test
    public void testHashmapBase64AndBase64toHashmap() {
        HashMapBase64Encoder converter = new HashMapBase64Encoder();

        // Test data
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        String base64Encoded = converter.hashmapToBase64(map);
        assertNotNull(base64Encoded);

        // Test base64ToHashmap
        HashMap<String, String> decodedMap = converter.base64ToHashmap(base64Encoded);
        assertNotNull(decodedMap);

        assertEquals(map, decodedMap);
    }
}
