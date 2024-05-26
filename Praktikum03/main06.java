package Praktikum03;

public class main06 {

    public static void main(String[] args) {
        no06ArrayListA queuearraylist = new no06ArrayListA();
        
      System.out.println(queuearraylist.isEmpty());
        System.out.println(queuearraylist.isEmpty());
        System.out.println(queuearraylist.peek());
        System.out.println(queuearraylist.toString());
        
        queuearraylist.offer(1);
        queuearraylist.offer(2);
        queuearraylist.offer(3);
        queuearraylist.offer(4);
        queuearraylist.offer(5);
        System.out.println(queuearraylist);
        
        System.out.println(queuearraylist.poll());
        
        System.out.println(queuearraylist.toString());
        
    }
}
