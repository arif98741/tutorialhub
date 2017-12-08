package tutorial;

import java.util.*;
//find average and total hours
public class Tutorial {

    public static void main(String[] args) {

        double[] worked_hours = new double[3];
        double total_hours = 0;

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();

        for (int i = 0; i < worked_hours.length; i++) {
            worked_hours[i] = sc.nextDouble();
            total_hours += worked_hours[i];
        }

        double average_hours = total_hours / 4;

        System.out.println("");
        System.out.println(name + " (ID#" + id + ") worked " + String.format("%.1f", total_hours) + " hours (" + String.format("%.1f", average_hours) + " hours/day)");
    }
}
