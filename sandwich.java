import java.util.Scanner;
public class sandwich {
public static void main(String[] args) {
Scanner s1 = new Scanner(System.in);
String[] s = new
String[] {"Pizza","Sandwhich","coffee","Burger","Quit"};
int[] rate = new int[]{400,200,50,100,0};
int[] qt = new int[5];
int sum=0;
boolean quit=true;
do{
System.out.println("ITEM"+"\t\tPrice");
for(int i=0;i<5;i++)
System.out.println((i+1)+"."+s[i]+"\t\t"+rate[i]);

System.out.println("enter your choice");
int ch=s1.nextInt();
if(ch>0 && ch<5)
{
System.out.println("enter the no of quantites of "+s[ch-1]);
int q=s1.nextInt();
qt[ch-1]+=q;
quit=false;
}
else
{
quit=false;
}
}while(quit);
System.out.println("Your Orders are:\n");
for(int i=0;i<5;i++)
{
if(qt[i]!=0)
{
sum+=qt[i]*rate[i];
System.out.println(s[i]+" * "+qt[i]+"=="+qt[i]*rate[i]+"rs");
}
}
System.out.println("Your total bill="+sum);
System.out.println("Thank you");
}
}
