// 15. Write a program for Deep cloning and shallow cloning.
// Ans:
class ObjectClass
{
	String Name;
	int Age;
	int deepValue = 90;
}
class Deep_Shallow_Clonning
{
	public static void main(String[] args)
	{
		System.out.println("Shallow Cloning");
		ObjectClass obj1 = new ObjectClass();
		obj1.Name = "Puja";
		obj1.Age = 23;

		System.out.println("\nOriginal Values of First Object: ");
		System.out.println("Name: "+obj1.Name);
		System.out.println("Age: "+obj1.Age);

		//Assigning ref
		ObjectClass obj2 = obj1;
		obj2.Name = "Ritesh";
		obj2.Age = 20;

		System.out.println("\nAfter Shallow Cloning: ");
		System.out.println("\n\nFirst Object: ");
		System.out.println("Name: "+obj1.Name);
		System.out.println("Age: "+obj1.Age);

		System.out.println("\nSecond Object Ref Object One: ");
		System.out.println("Name: "+obj2.Name);
		System.out.println("Age: "+obj2.Age);

		System.out.println("\nDeep Cloning");
		ObjectClass obj3 = new ObjectClass();
		obj3.Name = "Sanket";
		obj3.Age = 22;

		System.out.println("\nOriginal Values of First Object: ");
		System.out.println("Name: "+obj3.Name);
		System.out.println("Age: "+obj3.Age);
		System.out.println("deepValue: "+obj3.deepValue);

		ObjectClass obj4 = new ObjectClass();
		obj4.Name = "Krishna";
		obj4.Age = 21;
		obj4.deepValue = 50;

		System.out.println("\nAfter Deep Cloning: ");
		System.out.println("\n\nFirst Object: ");
		System.out.println("Name: "+obj3.Name);
		System.out.println("Age: "+obj3.Age);
		System.out.println("deepValue: "+obj3.deepValue);

		System.out.println("\nSecond Object Ref Object One: \n"+ "Name: "+obj4.Name+"\nAge: "+obj4.Age+" \n deepValue: "+obj4.deepValue);
	}
}	
