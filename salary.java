import java.util.*;
class employee
{    
    double basicsalary,HRA,DA,TADA,incometax,netsalary;
     int empid;
     String empname;
   
     public void show()
     {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the employee id");
        empid=s.nextInt();
        System.out.println("Enter the employee name");
        empname=s.next();
        System.out.println("Enter the basic salary of an employee");
        basicsalary=s.nextInt();
       
     }
   
     public void display() 
     {  
        HRA=0.18*basicsalary;
        DA=0.2*basicsalary;
        TADA=basicsalary+DA+HRA;
        incometax=0.10*TADA;
        netsalary=TADA-incometax;
        System.out.println("Employeeid  :  "+empid+"\n"+"Employename  :  "+empname+"\n"+"Employee basic salary :  "+basicsalary+"\n"+"HRA  :  "+HRA+"\n"+"DA  :  "+DA+"\n"+"TADA  :  "+TADA+"\n"+"Incometax  :  "+incometax+"\n"+"netsalary  :  "+netsalary);
     }
 
}
class salary
{
     public static void main(String args[])

     {
         employee eobj=new employee();
         eobj.show(); 
         eobj.display(); 
     }
}
