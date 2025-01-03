public class Cone{
	public static void main(String args[]){
		double r,h,l;
		r = 5.0;
		h = 8.0;
		l = 9.4;
		double vol ;
		double tsa ;
			vol = 0.33 * 3.14 * r * r * h;
			tsa = 3.14 * r * (r + l);
				System.out.println("Volume of the Cone = " + vol);
				System.out.println("Total Surface Area of the Cone = " + tsa);
			}
	}
