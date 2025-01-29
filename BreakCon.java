public class BreakCon{
    public static void main(String args[]){
        int i ;
        i = 1;
        System.out.println( " Using Continue Keyword : " );
        while( i <= 10 ){
            if( i == 5 ){
                i++;
                continue;
            }
            System.out.println("i = " + i );
            i++;
        }
        i = 1;
        System.out.println( " \n Using Break Keyword : " );
        while( i <= 10 ){
            if( i == 7 ){
                break;
            }
            System.out.println( " i = " + i );
            i++;
        }
    }
}
