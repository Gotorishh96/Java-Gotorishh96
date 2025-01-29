public class BreakContinue{
    public static void main(String args[]){
        int i ;
        i = 1;
       do{
           if( i % 2 == 0 ){
               i++;
               continue ;
           }
           System.out.println( "i = " + i );
           if ( i > 8 ){
               break;
           }
           i++;
       }
        while( i <= 10 );  
    }
}
