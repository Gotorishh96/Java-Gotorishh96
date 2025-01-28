import java.util.*;
public class FactorialSC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("The Factorial of " + number + " is: " + result);
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
