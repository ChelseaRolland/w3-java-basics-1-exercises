import java.util.Scanner;

public class javaBasicsOne {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        //Q1
        String name = "Chelsea Rolland";
        System.out.println("Hello");
        System.out.println(name);

        String fullName = scan.nextLine();
        System.out.printf("Hello, there %s! You have a lovely full name.\n", fullName);

        //Q2
        System.out.println("Please input 2 numbers below.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int sum1 = num1 + num2;
        System.out.println("The sum of the 2 numbers inputted are: " + sum1 + ".");

        //Q3
        double num1D = scan.nextDouble();
        double num2D = scan.nextDouble();
        double divide1 = num1D / num2D;

        System.out.printf("Divided %s by %s and you get %.2f.\n", num1D, num2D, divide1);
    }
}
