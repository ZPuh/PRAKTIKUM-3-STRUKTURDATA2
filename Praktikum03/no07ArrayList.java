package Praktikum03;

import java.util.ArrayList;

public class no07ArrayList {
    ArrayList<Integer> arraylist = new ArrayList<>();

    public void offer(int value) {
        arraylist.add(value);
    }

    public int peek() {        
        return arraylist.get(0);
    }

    public int poll() {
        int value = arraylist.get(0);
        arraylist.remove(0);
        return value;
    }

    public boolean isEmpty() {
        return arraylist.isEmpty();
    }
    
    public String toString() {
        return arraylist.toString();
    }
}
