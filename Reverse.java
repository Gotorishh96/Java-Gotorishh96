public class Reverse{
	public static void main(String args[]){
		int num , rev , digit;
		num = 123;
		rev = 0;
			while(num != 0){
				digit = num % 10;
				rev = ( rev * 10 ) + digit;
				num = num / 10;
			}
		System.out.println("The Reverse Of the Number is = " + rev);
	}
}
