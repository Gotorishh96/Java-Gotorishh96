import java.util.*;
public class RectangleSC{
	public static void main(String args[]){
		double l , b;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any value of the Length and Breadth");
			l = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println("Area of the Rectangle = " + l * b);
			System.out.println("Perimeter of the Rectangle = " + 2 * ( l + b ));
		}
	}
	
