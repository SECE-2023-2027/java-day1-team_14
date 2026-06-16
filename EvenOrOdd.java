import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
