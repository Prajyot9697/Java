// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         System.out.println("Enter the no of arrays you want");
//         Scanner s= new Scanner(System.in);
//         int n= s.nextInt();
//         int [] marks= new int [n];
//         int i;
//         // marks[0]=90;
//         // marks[1]=91;
//         // marks[2]=92; 
//         // marks[3]=96;
//         // marks[4]=93;
//         // marks[5]=94;
//         // marks[6]=95;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         System.out.println("Enter the elements");
//         for(i=0; i<n; i++){
//            marks[i]= s.nextInt();
//         }
//         // System.out.print("The Elements are :");
//         // for(int i=0; i<n; i++){
//         //     System.out.print(" "+marks[i]+"");
//         // }
//         System.out.println("Enter the element whose index you want to know");
//         int x= s.nextInt();
//         for(i=0; i<marks.length;i++ ){
//             if(marks[i]==x){
//                     System.out.println("The element found at index :"+i);
//             }
//         }
//     }
// }
import java.util.*;
public class array{
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int marks[]= new int[n];
        int i;
        System.out.println("Enter the elements");
        for(i=0; i<n;i++){
            marks[i]= s.nextInt();
        }
        System.out.println("the elements are:");
        for(i=0;i<n;i++ ){
            System.out.println(" "+marks[i]);
        }
        int x=s.nextInt();
        for(i=0; i<marks.length; i++){
            if(marks[i]==x){
                System.out.println(i);
            }
        }
    }
}