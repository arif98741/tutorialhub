package tutorial;

import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int x = sc.nextInt();
        String[] values = new String[x]; //array declaration
        for (int i = 0; i < x; i++) {//taking values from user for five times
            values[i] = sc.next(); //putting value in array's index
        }
        for (int i = 0; i < x; i++) { //printing all values 
            System.out.print(values[i] + " ");
        }
        System.out.println("");
    }
//program for taking array size for string
//print array values
}
