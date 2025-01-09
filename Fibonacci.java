public class Fibonacci{
	public static void main(String args[]){
		int i , n , n1 , n2 , n3;
		i = 1;
		n = 10;
		n1 = 0;
		n2 = 1;
	System.out.println("Fibonacci Series till n terms : ");
			while( i <= n ){
				System.out.println(n1 + " ");
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				i++;
			}
		}
	}
	
