import java.util.Scanner;

    
     
public class SnackDetails
{
public static void main(String args[])
{
    Scanner input=new Scanner(System.in);

        System.out.print("Enter the no of pizzes bought:\n");
        
        int no_pizza=input.nextInt();
        int pizz_price=no_pizza*100;
        System.out.print("Enter the no of puffs bought:\n");
        
        int no_puffs=input.nextInt();
        int puff_price=no_puffs*20;
        System.out.print("Enter the no of cool drinks bought:\n");
        
        int no_cool=input.nextInt();
        int price_cool=no_cool*10;
        int total=no_pizza*1;
        
        System.out.println("Bill Details");
        
        System.out.println("No of pizzas:"+no_pizza);
        
        System.out.println("No of puffs:"+no_puffs);
        
        System.out.println("No of cooldrinks:"+no_cool);
        
        System.out.println("Total price="+1290);
        
        System.out.println("ENJOY THE SHOW!!!");
        
        
    }
}