package Praktikum03;

import java.util.LinkedList;

public class no07LinkedList {
    LinkedList<Integer> linkedlist = new LinkedList<>();

    public void offer(int value) {
        linkedlist.add(value);
    }

    public int peek() {        
        return linkedlist.get(0);
    }

    public int poll() {
        int value = linkedlist.get(0);
        linkedlist.remove(0);
        return value;
    }

    public boolean isEmpty() {
        return linkedlist.isEmpty();
    }
    
    public String toString() {
        return linkedlist.toString();
    }
}
