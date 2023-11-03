import java.util.*;
public class for3 {
    public static void main(String[]args){
        int num;
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("enter the any number");
             num=obj.nextInt();
        }
        for( int i=1;i<=10;i++){
            //System.out.println(num+"*"i++);
            System.out.println(num+"*"+i+"="+num*i);
            //System.out.println("="+num*i);


        }
    }
    
}
