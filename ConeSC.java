
import java .util.*;
public class ConeSC{
	public static void main(String args[]){
		double r , h , l, vol , tsa ;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any value of r , h , l");
			r = sc.nextDouble();
			h = sc.nextDouble();
			l = sc.nextDouble();
			System.out.println("Volume of the Cone = " + 0.33 * 3.14 * r * r * h);
			System.out.println("Total Surface Area of the Cone = " + 3.14 * r * (r + l));
		}
	}
