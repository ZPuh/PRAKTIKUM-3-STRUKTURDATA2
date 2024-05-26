package Praktikum03;

import java.util.Scanner;
import java.util.Stack;

public class no03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.print("Kata : ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String item = "";
        while (!stack.isEmpty()) {
            item += stack.pop();
        }
        System.out.println("BEFORE : "+str);
        System.out.println("AFTER  : "+item);
        
    }

}
