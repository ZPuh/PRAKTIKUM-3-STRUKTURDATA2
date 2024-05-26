package Praktikum03;

import java.util.LinkedList;
import java.util.Queue;

public class no02 {

    public static void main(String[] args) {
        Queue<Double> data = new LinkedList<>();
        data.offer(91.35);
        data.offer(4.72);
        data.offer(26.0);
        data.offer(3.5);
        data.offer(8.0);
        data.offer(61.0);
        data.offer(65.36);
        data.offer(12.0);
        data.offer(5.6);
        data.offer(7.11);

        data.offer(27.0);
        data.offer(9.53);
        data.offer(549.0);
        data.offer(2.23);
        data.offer(17.31);
        data.offer(4.25);
        data.offer(2.13);
        data.offer(83.0);
        data.offer(7.0);
        data.offer(102.4);

        data.offer(53.21);
        data.offer(3.42);
        data.offer(0.21);
        data.offer(70.02);
        data.offer(819.4);
        data.offer(6173.0);
        data.offer(4.25);
        data.offer(19.8);
        data.offer(17.35);
        data.offer(5.768);

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        double size = data.size();
        System.out.println("DATA : ");
        for (double item : data) {
            System.out.print(item + " ");
        }

        while (!data.isEmpty()) {
            double element = data.poll();
            sum += element;
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }

        System.out.println("\n\nMIN : " + min);
        System.out.println("MAX : " + max);
        System.out.println("SUM : " + sum);
        System.out.println("AVR : " + sum / size);
    }

}
