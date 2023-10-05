// Q.13.Define a class Student with attributes rollno and name. Define default and parameterized constructor.
//  Override the toString() method. Keep the count of Objects created. Create objects using parameterized constructor and Display the object count after each object is created.

// Ans:
import java.util.Scanner;
class Student
{
	int rollNo;
	String StudentName;
	static int objCount=0;

	Student(int rno, String name)
	{
		rollNo =rno;
		StudentName=name;
		objCount++;
		System.out.println("Created Objects Count is: "+ objCount);
	}
	public String toString()
	{
		return ("Student Roll No: "+rollNo+"\nStudent Name: "+StudentName);
	}
}
class Student1
{
	public static void main(String[] args)
	{
		Student s1 = new Student(1,"Sanket");
		Student s2 = new Student(2,"Ritesh");
		Student s3 = new Student(3,"Krishna");
		System.out.println("\nAll objects values are: \n");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
