package Praktikum03;

public class no07 {

    public static void main(String[] args) {
        no07Array queueArray = new no07Array();
        System.out.println(queueArray.isEmpty());
        queueArray.offer(0);
        queueArray.offer(1);
        queueArray.offer(2);
        queueArray.offer(3);
        queueArray.offer(4);
        System.out.println(queueArray.peek());
        System.out.println(queueArray.isEmpty());
        System.out.println(queueArray.toString());
        queueArray.poll();
        queueArray.poll();
        System.out.println(queueArray.toString());
        
        no07ArrayList queueArrayList = new no07ArrayList();
        System.out.println(queueArrayList.isEmpty());
        queueArrayList.offer(5);
        queueArrayList.offer(4);
        queueArrayList.offer(3);
        queueArrayList.offer(2);
        queueArrayList.offer(1);
        System.out.println(queueArrayList.isEmpty());
        System.out.println(queueArrayList.peek());
        System.out.println(queueArrayList.toString());
        
        no07LinkedList queueLinkedList = new no07LinkedList();
        System.out.println(queueLinkedList.isEmpty());
        queueLinkedList.offer(1);
        queueLinkedList.offer(2);
        queueLinkedList.offer(3);
        queueLinkedList.offer(4);
        queueLinkedList.offer(5);
        System.out.println(queueLinkedList.isEmpty());
        System.out.println(queueLinkedList.peek());
        System.out.println(queueLinkedList.toString());
        queueLinkedList.poll();
        queueLinkedList.poll();
        queueLinkedList.poll();
        System.out.println(queueLinkedList.toString());
        
        no07Vector queueVector = new no07Vector();
        System.out.println(queueVector.isEmpty());
        queueVector.offer(5);
        queueVector.offer(4);
        queueVector.offer(3);
        queueVector.offer(2);
        queueVector.offer(1);
        System.out.println(queueVector.isEmpty());
        System.out.println(queueVector.peek());
        System.out.println(queueVector.toString());
        queueVector.poll();
        queueVector.poll();
        queueVector.poll();
        System.out.println(queueVector.toString());
    }
}
