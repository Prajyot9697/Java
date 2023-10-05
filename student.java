// import java.util.Scanner;
// // class stud{
// //     String name,N1;
// //     stud(){
// //         System.out.println("Enter the Name");
// //         Scanner s = new Scanner(System.in);
// //         String name = s.nextLine();
// //          System.out.println("My name is "+name);
// //     }
// // }
// class marks{
//     int total;
//     double per;
//     int m1,m2,m3;
//     marks(){
//         System.out.println("Enter the Name");
//         Scanner s = new Scanner(System.in);
//         String name = s.nextLine();
//         System.out.println("My name is "+name);
    
//         //Scanner s1 = new Scanner(System.in);
//         System.out.println("Enter the marks");
//          m1 = s.nextInt();
//          m2 = s.nextInt();
//          m3 = s.nextInt();
//     }
    
//     void display(){
//        total= m1+m2+m3;
//        per=((m1+m2+m3)*100)/300;
//        System.out.println("Total : "+total+"Percentage : "+per);
       
//     }
// }
// public class student {
//     public static void main(String args[]) {
        
//          marks m= new marks();
//          m.display();
//         }
//     }
import java.util.Scanner;
class marks{
    int total;
    double per;
    int m1,m2,m3;
    marks(){
        System.out.println("Enter the Name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("My name is "+name);
    
        System.out.println("Enter the marks");
         m1 = s.nextInt();
         m2 = s.nextInt();
         m3 = s.nextInt();
    }
    
    void display(){
       total= m1+m2+m3;
       per=((m1+m2+m3)*100)/300;
       System.out.println("Total : "+total+"Percentage : "+per);
    }
}
public class student {
    public static void main(String args[]) {
        
         marks m= new marks();
         m.display();
        }
    }

