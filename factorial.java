 import java.util.*;


//normal method 
//public class factorial {
//     public static void main(String args[]) {

//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the number");
        
//         int n = s.nextInt();
//         int f = 1;
//         for (int i = 1; i <= n; i++) {
//             f = f * i;
//         }
//         System.out.println("the factorial of number " + n + " is " + f);

//     }
// }
class factorial{
    static int factorial(int n){
        if(n!=0){
            return n*factorial(n-1);
        }
        else
        {return 1;}
    }
    public static void main(String args[]){
        int Result;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int number= s.nextInt();
        Result= factorial(number);
        System.out.println("the factorial is: "+Result);        


    }
}
