import java.util.*;

class a {
    float a;
    void circle(float r){
        a= 3.14f*r*r;
        System.out.println("The area of circle is "+a);
    }
    void triangle(float b, float h){
        a= 0.5f*b*h;
        System.out.println("The area of triangle is "+a);
    }
}
class area{
public static void main(String args[])throws Exception{
    // float r,b,h;
    Scanner s= new Scanner(System.in);
    System.out.println("The values of r,b,h");
    float r=s.nextFloat();
    float b=s.nextFloat();
    float h=s.nextFloat();
  
    a n= new a();
    n.circle(r);
    n.triangle(b,h);
}
}
