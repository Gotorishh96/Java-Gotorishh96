import java.util.*;
public class PalindromeSC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an interger:");
        int number = sc.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        while ( number != 0 ){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        if( originalNumber == reversedNumber ){
            System.out.println( originalNumber + " is a Palindrome Number");
        }
        else{
            System.out.println( originalNumber + " is not a Palindrome Number");
        }
    }
}
