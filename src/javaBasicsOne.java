import java.util.Scanner;

public class javaBasicsOne {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

//        //Q1
//        String name = "Chelsea Rolland";
//        System.out.println("Hello");
//        System.out.println(name);
//
//        String fullName = scan.nextLine();
//        System.out.printf("Hello, there %s! You have a lovely full name.\n", fullName);
//
//        //Q2
//        System.out.println("Please input 2 numbers below.");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//
//        int sum1 = num1 + num2;
//        System.out.println("The sum of the 2 numbers inputted are: " + sum1 + ".");
//
//        //Q3
//        int divideInt = num1 / num2;
//        System.out.println("These 2 numbers divided will give you the int: " + divideInt + ".");
//
//        System.out.println("Please input 2 numbers");
//        int num1D = scan.nextInt();
//        int num2D = scan.nextInt();
//
//        //System.out.println("Please input 2 different decimals");
//        //double num1D = scan.nextDouble();
//        //double num2D = scan.nextDouble();
//
//        //Using the implicit casting to take into account any possible decimals
//        double divide1 = num1D / num2D;
//
//        System.out.printf("Divided %s by %s and you get %.2f.\n", num1D, num2D, divide1);
//
//        //Q4
//        int test1 = -5 + 8 * 6;
//        int test2 = (55 + 9) % 9;
//        int test3 = 20 + -3 * 5 / 8;
//        int test4 = 5 + 15 / 3 * 2 - 8 % 3;
//
//        System.out.printf("Here are the answers to the 4 tests: %d, %d, %d, and %d.\n", test1, test2, test3, test4);

        //Q5
//        System.out.println("Please input 2 numbers below");
//        int num3 = scan.nextInt();
//        int num4 = scan.nextInt();
//
//        int productInt = num3 * num4;
//        System.out.printf("The product of %s and %s is: %s.\n", num3, num4, productInt);
//        System.out.printf("%s x %s = %s\n", num3, num4, productInt);

        //Q6
//        System.out.println("Please input 2 numbers below to get the sum, multiply, subtract, divide, and modulus results");
//        int num5 = scan.nextInt();
//        int num6 = scan.nextInt();
//
//        int sumInt = num5 + num6;
//        int productInt1 = num5 * num6;
//        int subtractInt = num5 - num6;
//        int divideInt = num5 / num6;
//        int modulusInt = num5 % num6;
//
//        System.out.printf("%s + %s = %s\n", num5, num6, sumInt);
//        System.out.printf("%s x %s = %s\n", num5, num6, productInt1);
//        System.out.printf("%s - %s = %s\n", num5, num6, subtractInt);
//        System.out.printf("%s / %s = %s\n", num5, num6, divideInt);
//        System.out.printf("%s mod %s = %s\n", num5, num6, modulusInt);

        //Q7
//        System.out.println("Please input a number to see what the product will be upto 10.");
//        int userInputNum = scan.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            int userInputNumResult = userInputNum * i;
//            System.out.println(userInputNum + " x " + i + " = " + userInputNumResult);
//        }

        //Q8
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        //Q9
        double numResult = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(numResult);



    }
}
