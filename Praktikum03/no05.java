 package Praktikum03;

import java.util.HashMap;
import java.util.Scanner;

public class no05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hashmap = new HashMap<>();
        System.out.println("Tekan '1  ' untuk berhenti");
        while (true) {
            System.out.print("Nim: ");
            String nim = scanner.nextLine();
            if (nim.equals("1")) {
                break;
            }
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            hashmap.put(nim, nama);
        }
        System.out.println("Data Mahasiswa : ");
        for (String nim : hashmap.keySet()) {
            String nama = hashmap.get(nim);
            System.out.println("Nim: " + nim + "\t, Nama: " + nama);
        }
    }
    
}
