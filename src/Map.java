import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> mapA = new HashMap<>();
        mapA.put("Smith",30);
        mapA.put("Anderson",31);
        mapA.put("Lewis",29);
        mapA.put("Cook",29);
        System.out.println("Display entries in HashMap");
        System.out.println(mapA + "\n");

        TreeMap<String,Integer> treeMap = new TreeMap<>(mapA);
        System.out.println("display entries in ascending order of key");
        System.out.println(treeMap);

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
