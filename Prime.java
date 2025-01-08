public class Prime{
    public static void main(String args[]) {
        int num, i, ctr;
        num = 5;
        ctr = 0;

        for (i = 2; i < num; i++) { 
            if (num % i == 0) { // Corrected condition
                ctr++;
            }
        }

        if (ctr == 0) {
            System.out.println("Number is a Prime Number...!"); 
        } else {
            System.out.println("Number is not a Prime Number...!"); 
        }
    }
}
