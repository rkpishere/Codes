package HashSetAndHashmap;

import java.util.*;

public class HashMap1 {
    
    public static void main(String[] args) {
        HashMap<String,Integer> hmap=new HashMap<>();

        //insert
        hmap.put("India", 120);
        hmap.put("China", 150);
        hmap.put("USA", 30);
        hmap.put("Austrailia", 10);
        System.out.println(hmap);
        hmap.put("China", 160);
        System.out.println(hmap);
        //search
        if(hmap.containsKey("China")){
            System.out.println("Key Present");
        }
        else{
            System.out.println("key not present");
        }

        System.out.println(hmap.get("China"));
        System.out.println(hmap.get("America"));

        //foreach loop iterator
        for (Map.Entry<String,Integer>e:hmap.entrySet()) {
            System.out.println(e);
        }
        //ket set iterator
        Set<String>keys=hmap.keySet();
        for (String string : keys) {
            System.out.println(string);
        }

        // remove
        hmap.remove("China");
        System.out.println(hmap);
    }
}
