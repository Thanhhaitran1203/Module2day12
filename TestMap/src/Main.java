import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)
    {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Laila",10);
        hashMap.put("OK",15);
        hashMap.put("Bro",5);
        hashMap.put("Fufu",20);
        hashMap.put("Dudu",30);
        System.out.println("HashMap");
        System.out.printf("\t"+hashMap);
        System.out.println("--------------");
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap");
        System.out.println(treeMap);
        System.out.println("------------------");
        Map<String,Integer> linkedListMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedListMap.put("Laila",10);
        linkedListMap.put("OK",15);
        linkedListMap.put("Bro",5);
        linkedListMap.put("Fufu",20);
        linkedListMap.put("Dudu",30);
        System.out.println("\n the number for" + "Bro " + linkedListMap.get("Bro"));
        System.out.println(linkedListMap);

    }
}