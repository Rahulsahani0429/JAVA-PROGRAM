import java.util.*;
public class switch1{
    public static void main(String[] args){ 
        //System.out.println("enter the player");
        Scanner obj6=new Scanner(System.in);
    
        System.out.println("enter the player");
        int player=obj6.nextInt();
         //System.out.println("enter the condition");

        switch(player) {
            case 1 :
            System.out.println("you are hockey player");
            break;
            case 2:
            System.out.println("you are cricket player");
            break;
            case 3:
            System.out.println("you are bollyboll player");
            break;
            default:
                System.out.println("this player is not available in the team");
        }
    }
}