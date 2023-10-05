import java.io.OutputStream;
import java.net.SocketPermission;
import java.util.*;

import javax.annotation.processing.SupportedOptions;

public class practice {
    // public static void main(String[] args) {
    // System.out.println("Enter the no. to print Fibonacchi series upto that no.");
    // Scanner s = new Scanner(System.in);
    // float count = s.nextFloat();
    // int n1 = 0, n2 = 1, n3;
    // System.out.print(" " + n1 + " " + n2);
    // for (int i = 2; i < count; i++) {
    // n3 = n1 + n2;
    // System.out.print(" " + n3);
    // n1 = n2;
    // n2 = n3;
    // }
    // }



    // ----------------------- resursive method------------------------


    // public static void main(String[] args) {
    //     int n, i;
    //     System.out.println("Enter the nth number");
    //     Scanner s = new Scanner(System.in);
    //     n = s.nextInt();
    //     System.out.println("Fibonacchi series is : ");

    //     for (i = 0; i < n; i++) {
    //         System.out.print(" " + fibo(i));
    //     }
    // }
    // static int fibo(int n1) 
    // {
    //     if (n1 == 0)
    //         return 0;
    //     else if (n1 == 1)
    //         return 1;
    //     else
    //         return (fibo(n1 - 1) + fibo(n1 - 2));
    // }
    //-----------------------prime number-----------------------
    // public static void main(String[] args) {
    //     int i,n,flag=0;
    //     Scanner s= new Scanner(System.in);
    //     System.out.println("Enter number you wanna check whether it is prime or not");
    //     n= s.nextInt();
    //     if(n==0 || n==1)
    //     {
    //         System.out.println("Prime number");
    //     }
    //     for(i=2; i<n;i++){
    //         if(n%i==0){
    //             System.out.println("Not a prime number");
    //             flag=1;
    //             break;
    //         }
    //     }
    //         if(flag==0){
    //             System.out.println("Prime number");
    //         }
    //     }
    // }

  //     public static void main(String[] args) {
//         int n,i,flag=0;
//         Scanner s= new Scanner(System.in);
//         System.out.println("Enter the number");
//         n=s.nextInt();
//         if(n==0||n==1){
//             System.out.println("Prime numbers");
//         }
//         for(i=2;i<n;i++){
//             if(n%i==0){
//                 System.out.println("Not a Prime number");
//                 flag=1;
//                 break;
//             }
//         }
//         if(flag==0)
//     {
//         System.out.println("prime number");
//     } 
//    }
//------------------------------pallindrom program-------------------
// public static void main(String[] args) {
//     int n,sum=0,temp,r;
//     Scanner s= new Scanner(System.in);
//     System.out.println("Enter the number");
//     n=s.nextInt();
//     temp=n;
//     while(n>0)
//     {
//         r=n%10;
//         sum=(sum*10)+r;
//         n=n/10;
//     }
//     if(temp==sum){
//         System.out.println("Pallindrom number");
//     }
//     else{
//         System.out.println("not an pallindrom number");
//     }
// }
// }
//--------------------Factorial number---------------------

// public static void main(String[] args) {
//     int n,i,fact=1;
//     Scanner s= new Scanner(System.in);
//     System.out.println("Enter the number");
//     n=s.nextInt();
//     for(i=1;i<n;i++){
//         fact=fact*i;
//     }
//     System.out.println("The factorial of "+n+" is: "+fact);
// }
// //-----------------------Armstrong number----------------------
// public static void main(String[] args) {
//     int n,i,sum=0,r,temp;
//     Scanner s= new Scanner(System.in);
//     System.out.println("Enter the number ");
//     n=s.nextInt();
//     temp=n;
//     while(n>0){
//         r=n%10;
//         sum=sum+(r*r*r);
//         n=n/10;
//     }
//     if(sum==temp){
//         System.out.println("armstrong number");
//     }
//     else{
//         System.out.println("not an armstrong number");
//     }
// }
// public static void main(String[] args) {
//     int size;
//     Scanner s= new Scanner(System.in);
//     System.out.println("Enter how many rows and columns to be printed");
//     size= s.nextInt();
//     for(int i=0; i<size; i++){
//         for(int j=0; j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
//     }
//     }
    public static void main(String[] args) {
        int size;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of pattern to be printed");
        size= s.nextInt();
        for(int i=0;i<size;i++){
            for(int j=2*(size-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       
    }
}
