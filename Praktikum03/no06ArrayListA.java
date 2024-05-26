package Praktikum03;

import java.util.ArrayList;

public class no06ArrayListA {
     ArrayList<Integer> arraylist = new ArrayList<>();

    public void offer(int value) {
        arraylist.add(value);
    }

    public Integer peek() { 
        Integer hasil = null;
        if (!arraylist.isEmpty()) {
            hasil = arraylist.get(0);
        }
        return hasil;
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
