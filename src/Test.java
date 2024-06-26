import java.util.Scanner;
public class Test 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter total no.of employees:");
        int limit=sc.nextInt();
        
        if(limit<1)
        {
            System.out.println("Please enter a valid employee count");
            return;
        }
        
        int age[]=new int[limit];
        
        System.out.println("Enter the age for "+limit+" employees:");
        
        for(int i=0;i<limit;i++)
        {
            age[i]=sc.nextInt();
            if(age[i]<28 && age[i]>40)
            {
                System.out.println("Invalid age encountered!");
            }
        }
        Test obj=new Test();
        
        System.out.format("The average age is %.2f",obj.calculateAverage(age,limit));
    }
        public double calculateAverage(int[] age,int limit)
        {
            int sum=0;
            for(int i=0;i<limit;i++)
            {
                sum+=age[i];
            }
            double avg=sum/(float)limit;
            return avg;
        }
    }
