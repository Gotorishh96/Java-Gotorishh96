public class Factorial{
	public static void main(String args[]){
		int num , i , fact;
		num = 10;
		fact = 1;
			for(i = 1 ; i <= num ; i++){
				fact = fact * i;
			}
				System.out.println("The Factorial of a Number is = "+ fact);
		}
	}
