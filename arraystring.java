// import java.util.*;
// public class arraystring {
//     public static void main(String[] args) {

//         System.out.println("Enter the size of array :");
//         Scanner s= new Scanner(System.in);
//         int size= s.nextInt();

//         String name[]= new String [size];
        
//         System.out.println("Enter the name");
//         for(int i=0; i<size; i++){
//             name[i]=s.next();
//         }
//         for(int i=0; i<name.length; i++){
//             System.out.println("Name "+(i+1)+" is "+name[i]+".");
//         }
//     }
// }
import java.util.*;
public class arraystring{
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        String name[]= new String[size];

        System.out.println("enter the name");
        for(int i=0; i<size; i++){
            name[i]=s.next();
        }
        for(int i=0;i<name.length;i++){
            System.out.println("name"+(i+1)+"is"+name[i]);
        }
    }
}
