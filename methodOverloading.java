import java.util.Scanner;
public class methodOverloading {
 
    static final double pi = 3.14;

    // static int vol(int a){
    //     return a*a*a;
    // }
    // static double vol(int h, int r){
    //     return pi*(r*r)*h;
    // }
    // static int vol(int l,int w,int h){
    //     return l*w*h;
    
    public static void main(String[] args) {
        int side,cylinder,cuboid,radius,height,lenght,width;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the side of cube: ");
        side = s.nextInt();
        System.out.println("The Volume of Cube is : " + side*side*side);

        System.out.print("Enter radius and height of Cylinder with space in between: ");
        radius = s.nextInt();
        height = s.nextInt();
        System.out.println("The Volume of Cylinder is : " + radius*height);

        System.out.println("Enter the lenght, width and height of Cuboid : ");
        lenght = s.nextInt();
        width = s.nextInt();
        height = s.nextInt();
        System.out.println("The volume of Cuboid is : " + lenght*width*height);
    }
}

