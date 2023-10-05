import java.util.Scanner;
public class prime
{  
   public static void main(String[] args) 
   { 
       Scanner s = new Scanner(System.in);  
       System.out.println("Enter a number : ");  
       int num = s.nextInt();  
       int flag=0; 
       int i, n1=num/2;      
       if(num==0||num==1)
       {  
          System.out.println(num+" is not prime number");      
       }
       else
       { 
         for(i=2;i<=n1;i++)
         {      
           if(num%i==0)
           {      
               System.out.println(num+" is not a prime number");      
               flag=1;      
               break;      
           }      
         }      
         if(flag==0)  
         { 
             System.out.println(num+" is a prime number");  
         }  
        } 
   }   
}  

