package Praktikum03;

import java.util.HashSet;
import java.util.Scanner;

public class no04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        HashSet<String> hashset = new HashSet<>();
        
        System.out.println("Masukan NIM (tekan '1' untuk berhenti): ");
        while (true) {
            String NIM = scanner.nextLine();
            if ("1".equals(NIM)) {
                break;
            }
            hashset.add(NIM);
        }
        
        System.out.println("Daftar NIM:");
        for(String nim : hashset) {
            System.out.println(nim );
        }
    }
    
}
