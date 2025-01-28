import java.util.*;
public class ReverseSC{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an Number");
            int number = sc.nextInt();
            int reversedNumber = 0;
            while( number != 0 ){
                    int digits = number % 10;
                    reversedNumber = reversedNumber * 10 + digits;
                    number = number / 10;
                }
            System.out.println("Reverse of the number = " + reversedNumber);
        }
}
