import java.util.*;
public class ArmstrongSC{
    public static void main(String args[]){
        int n, a;
        int r = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three-digit number: ");
        n = sc.nextInt();
        a = n;
        while(a != 0){
            rem = a % 10; // Corrected remainder calculation
            r = r + (int)Math.pow(rem, 3); // Corrected power calculation
            a = a / 10; // Corrected update of a
        }
        if(r == n) // Corrected comparison
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
