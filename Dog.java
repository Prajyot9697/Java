//14.Create an inner class Animal which has a method called eating to display eating habits. Use this method  in the outer class.



interface Animal1
{
	void eat();
}
interface Animal2
{
	void travel();
}
class Animal implements Animal1, Animal2
{
	public void eat()
	{
		System.out.println("\nAnimal is eating");
	}
	public void travel()
	{
		System.out.println("\nAnimal is travelling");
	}
}
public class Dog
{
	public static void main(String s[])
	{
		Animal A= new Animal();
		A.eat();
		A.travel();
	}
}

		


