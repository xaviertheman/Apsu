package csci2010.classes.day03I26I26;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> mountains = new HashMap();
        mountains.put("Everest", 29029);
        mountains.put("K2", 28251);
        mountains.put("Kangcenjunga", 28169);
        printMap(mountains);

        //find in map 
        System.out.println("K2 is in map is "+ mountains.containsKey("K2"));

        //change the value of k2
        mountains.put("K2", 69420);

        //remove from map
        mountains.remove("K2");

        printMap(mountains);
    }

    public static void printMap(HashMap<String, Integer> map){
        System.out.println("Map Contains: ");
        for (String keyMountainName : map.keySet()) {
            System.out.println(keyMountainName + " at Hieght of "+ map.get(keyMountainName));
        }

    }
}
