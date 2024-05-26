package Praktikum03;

import java.util.Scanner;
import java.util.Stack;

public class no03A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Stack<Character> stack = new Stack<>();
        
        String kata = scanner.nextLine();
        
        for (int i = 0; i < kata.length(); i++) {
            stack.push(kata.charAt(i));
        }
        String reverse = "";
        while (!stack.isEmpty()) {
            reverse+=stack.pop();
        }
        System.out.println(reverse);
        
    }
    
}
