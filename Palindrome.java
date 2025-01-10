public class Palindrome{
	public static void main(String args[]){
		int r , sum , temp , n;
		sum = 0;
		n = 454;
		temp = n;
			while( n > 0 ){
				r = n % 10;
				sum = ( sum * 10 ) + r;
				n = n / 10;
			}
		if( temp == sum ){
			System.out.println("Palindrome Number..!");
			}
			else{
				System.out.println("Not a Palindrome Number..!");
			}
		}
	}
