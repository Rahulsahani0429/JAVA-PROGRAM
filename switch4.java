import java.util.*;
public class switch4{
    public static void main(String[] args){
 
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the bottom");
     int a=obj.nextInt();
    switch(a){
        case 1:
        System.out.println("you get the  first prize");
        break;
        case 2:
            System.out.println("you get the second prize");
            break;
            case 3:
                System.out.println("you get the any prize");
                break;
                default:
                    System.out.println("you can't the any prize");
        
    }

    
}
}