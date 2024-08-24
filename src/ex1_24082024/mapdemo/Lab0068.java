package ex1_24082024.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class Lab0068 {
    public static void main(String[] args) {
        //Map : Key and Value pair (Key will be always unique) no duplicate keys | only one null key
        // Interface
        // hashmap, Linkedhashmap, treemap, WeakhashMap, Enummap

        Map<String,Integer> m1=  new HashMap();
        m1.put("Id1", 22);
        m1.put("Id2",20145);

        System.out.println(m1);

        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("Id2"));
        System.out.println(m1.containsValue(20145));
        System.out.println(m1.size());
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.get("Id2"));

        System.out.println("--------------------");

        //Iterate over all elements in map
        for(Map.Entry<String,Integer> item : m1.entrySet()){
            System.out.println(item.getKey()+ " -> "+item.getValue());
        }
    }
}
