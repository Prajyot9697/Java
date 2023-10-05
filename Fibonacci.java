import java.util.*;
class Fibonacci {
    public static void main(String args[])
    {
        int n,i;
        System.out.println("Enter the nth term");
        Scanner s = new Scanner(System.in);
        
        n=s.nextInt();

        System.out.println("Fibonacci series of first "+n+" terms is : ");
        for(i=0;i<n;i++)
        {
            System.out.print(fibo(i)+" ");
        }
    }

    static int fibo(int n1)
    {
        if (n1==0)
        
            return 0;
        else if (n1==1)
            return 1;
        else
            return (fibo(n1-1)+fibo(n1-2));
    }
}
