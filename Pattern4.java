public class Pattern4{
    public static void main(String args[]){
        int i , j , n;
        n = 4;
        for( i = 1 ; i <= n ; i++ ){
            for( j = 1 ; j <= n-i ; j++ ){
                System.out.print( " " );
            }
             for( j = 1 ; j <= ( 2 * i - 1 ) ; j++){
                 System.out.print( "*" );
             }
            System.out.println( );
        }
    }
}
