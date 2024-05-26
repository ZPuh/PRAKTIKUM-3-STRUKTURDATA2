package Praktikum03;

import java.util.HashMap;

public class no05B {
    public static void main(String[] args) {
        HashMap<String,String> hashmap = new HashMap <>();
        
        hashmap.put("D0223320", "Muhammad uhdi");
        hashmap.put("D0223321", "Ratri Pramudita");
        hashmap.put("D0223322", "Siti Mariati");
        hashmap.put("D0223323", "Muhammad Naufal N.");
        hashmap.put("D0223324", "Siti Mawaddah");
        
        System.out.println(hashmap.replace("D0223320", "Muhammad"));
        
        for(String element : hashmap.keySet()){
            String item = hashmap.get(element);
            System.out.println(element + " "+ item);            
        }
    }
    
}
