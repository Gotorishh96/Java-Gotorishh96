import java .util.*;
public class ArithmeticSC{
	public static void main(String args[]){
		int a , b ;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any Two Number");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Sum of Two Number = " + (a + b));
			System.out.println("Difference of Two Number = " + (a - b));
			System.out.println("Product of Two Number = " + (a * b));
			System.out.println("Division of Two Number = " + (a / b));
			System.out.println("Remainder of Two Number = " + (a % b));
		}
	}
