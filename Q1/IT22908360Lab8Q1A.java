import java.util.Scanner;

public class IT22908360Lab8Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        System.out.println("\nArray in Reverse Order:");

        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }

        input.close();
    }
}