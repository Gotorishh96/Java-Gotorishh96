public class Pattern3{
    public static void main(String args[]){
        int i , j , k;
        for( i = 1 ; i <= 4 ; i++ ){
            for( k = 2 ; k <= i ; k++){
                System.out.print( " " );
            }
             for( j = 4 ; j >= i ; j--){
                 System.out.print( "*" );
             }
            System.out.print( "\n" );
        }
    }
}
