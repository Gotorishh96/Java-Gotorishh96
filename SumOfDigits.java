import java.util.*;
public class SumOfDigits{
        public static void main(String args[]){
                Scanner sc =  new Scanner(System.in);
                System.out.println("Enter an integer number ");
                int number = sc.nextInt();
                int sumDigits = 0;
                while( number > 0 ){
                    int digit = number % 10;
                    sumDigits += digit;
                    number /= 10;
                }
            System.out.println("The sum of the digits Of the Number = " + sumDigits);
        }
}
