package CollectionFramework;

import java.util.HashMap;
import java.util.TreeMap;

public class MapInterface {
    // Collection Interface - list, queue, set
    // Collection Framework - collection Interfaces + Map interface

    public static void main(String[] args){
        //HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("First",1);
        map.put("Second",2);
        System.out.println(map);
        System.out.println(map.get("First"));

        //TreeMap - ordered by keys
        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("First",1);
        tmap.put("Second",2);
        System.out.println(tmap);
        System.out.println(tmap.keySet());

    }
}
