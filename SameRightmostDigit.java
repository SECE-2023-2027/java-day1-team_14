import java.util.Scanner;

public class SameRightmostDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Input the third number : ");
        int num3 = sc.nextInt();

        int d1 = num1 % 10;
        int d2 = num2 % 10;
        int d3 = num3 % 10;

        boolean result = (d1 == d2) || (d1 == d3) || (d2 == d3);

        System.out.println("The result is: " + result);

        sc.close();
    }
}
