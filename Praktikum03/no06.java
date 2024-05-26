package Praktikum03;

public class no06 {

    public static void main(String[] args) {
        System.out.println("Stack dengan Array");
        no06Array stackArray = new no06Array();
        
        System.out.println(stackArray.isEmpty());
        
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        stackArray.push(6);
        
        System.out.println(stackArray.toString());
        
        System.out.println(stackArray.isEmpty());        
        System.out.println(stackArray.toString());        
        System.out.println(stackArray.peek());
        
        stackArray.pop();
        stackArray.pop();
        stackArray.pop();
        
        System.out.println(stackArray.toString());
        
        System.out.println("Stack dengan ArrayList");
        no06ArrayList stackArrayList = new no06ArrayList();
        
        System.out.println(stackArrayList.isEmpty());
        stackArrayList.push(3);
        stackArrayList.push(4);
        stackArrayList.push(5);
        stackArrayList.push(1);
        stackArrayList.push(2);
        System.out.println(stackArrayList.isEmpty());      
        System.out.println(stackArrayList.peek());
        System.out.println(stackArrayList.toString());
        stackArrayList.pop();
        stackArrayList.pop();
        stackArrayList.pop();
        System.out.println(stackArrayList.toString());
        
        System.out.println("Stack dengan Vector");
        no06Vector stackVector = new no06Vector();
        
        System.out.println(stackVector.isEmpty());
        
        stackVector.push(1);
        stackVector.push(2);
        stackVector.push(3);
        stackVector.push(4);
        
        System.out.println(stackVector.peek());
        System.out.println(stackVector.isEmpty());
        System.out.println(stackVector.toString());
        
        stackVector.pop();        
        stackVector.pop();        
        stackVector.pop();    
        stackVector.pop();                 
   
        System.out.println(stackVector.toString());       
        
        System.out.println("Stack Dengan LinkedList");
        no06LinkedList stackLinkedList = new no06LinkedList();
        
        System.out.println(stackLinkedList.isEmpty());
        stackLinkedList.push(5);
        stackLinkedList.push(4);
        stackLinkedList.push(3);
        stackLinkedList.push(2);
        stackLinkedList.push(1);
        System.out.println(stackLinkedList.isEmpty());
        System.out.println(stackLinkedList.toString());
        System.out.println(stackLinkedList.peek());
        
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        
        System.out.println(stackLinkedList.toString());
    }

}
