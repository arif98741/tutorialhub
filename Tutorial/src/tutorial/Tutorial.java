package tutorial;

import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) { // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x = 5;
        int[] values = new int[x];
        for (int i = 0; i < x; i++) {//taking values from user for five times
            values[i] = sc.nextInt();
        }

        for (int i = 0; i < x; i++) { //printing all values 
            System.out.print(values[i] + " ");
        }
        System.out.println("");
    }

}
