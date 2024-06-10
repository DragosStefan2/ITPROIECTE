package Teme;

import java.util.HashMap;
import java.util.Map;

public class Tema22_23 {
    /*Finding Common Entries in Two HashMaps

Description:
Create a class named HashMapComplex. In this class, create a method named getCommonEntries which takes two HashMaps both with String keys and Integer values as parameters.
The method should return a new HashMap containing only the entries that exist in both input maps (i.e., the keys are present in both maps and associated with the same values in both maps).*/

    public static HashMap<String, Integer> getCommonEntries(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
        HashMap<String, Integer> commonEntries = new HashMap<>();

        // Iterate
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // Check if the second map contains the same key with the same value
            if (map2.containsKey(key) && map2.get(key).equals(value)) {
                commonEntries.put(key, value);
            }
        }

        return commonEntries;
    }

    public static void main(String[] args) {
        // Example usage:
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("c", 2);
        map1.put("b", 4);
        map1.put("c", 5);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("c", 4);
        map2.put("b", 5);
        map2.put("c", 5);

        HashMap<String, Integer> commonEntries = getCommonEntries(map1, map2);

        System.out.println("Common entries: " + commonEntries);
    }
}
