import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        while( num > 0 ){
            if( num % 2 == 0 ){
                num /= 2;
                //System.out.println("valor do num if " + num);
                //System.out.println("valor do step if " + step);
            }else{
                num--;
                //System.out.println("valor do num else " + num);
                //System.out.println("valor do step else " + step);
            }
            step++;
            //System.out.println("valor do num while " + num);
            //System.out.println("valor do step while" + step);
        }

        if( step > 0 ){
            System.out.println( step );
        }else{
            System.out.println( step );
        }

    }
}