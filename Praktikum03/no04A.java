package Praktikum03;

import java.util.HashSet;

public class no04A {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet <>();
        hashset.add("D0223320");
        hashset.add("D0223321");
        hashset.add("D0223322");
        hashset.add("D0223323");
        hashset.add("D0223324");
        //System.out.println(hashset.);
        
        for(String element : hashset){
            System.out.println(element);
        }
    }
    
}
