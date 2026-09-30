import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
     
        double avg = sum / 2.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        sc.close();
    }
}