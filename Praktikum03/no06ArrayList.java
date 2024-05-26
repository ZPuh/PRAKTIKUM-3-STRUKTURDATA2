package Praktikum03;

import java.util.ArrayList;

public class no06ArrayList {

    ArrayList<Integer> arraylist = new ArrayList<>();

    public void push(int element) {
        arraylist.add(element);
    }

    public Integer peek() {
        return arraylist.get(arraylist.size() - 1);
    }

    public Integer pop() {
        int element = arraylist.get(arraylist.size() - 1);
        arraylist.remove(arraylist.get(arraylist.size() - 1));
        return !arraylist.isEmpty() ? element : null;
    }

    public boolean isEmpty() {
        return arraylist.isEmpty();
    }

    public String toString() {
        return arraylist.toString();
    }
}
