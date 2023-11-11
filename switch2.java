public class switch2{
    public static void main(String[] args){
        System.out.println("enter the number");
        int number=20;
      // System.out.println("enter the number");
        switch(number){
            case 1: System.out.println("10");// if we are not use the break key then it run countinously
            
            case 2: System.out.println("20");
        
            case 3: System.out.println("30");
            case 4: System.out.println("40");
            case 5: System.out.println("50");
            default:
                System.out.println("not 10 ,or 20, or 30, or 40, or 50");
        }
    }
}