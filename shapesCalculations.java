class Shapes
        {
static final double pi = 3.14;
        int side,length, width,height;
        double radius;
        float base,sideC;
//Square
        Shapes(int s)
        {
        side = s;
        }
//Rectangle
        Shapes(int l,int w )
        {
                width = w;
                length = l;
        }
//Circle
        Shapes(double r)
        {
        radius = r;
        }
//Tringle
        Shapes(float b,int l)
        {
        base = b;
        length = l;
        }
//Cube
        Shapes(float s)
        {
        sideC = s;
        }
//Square area
        int areaSqu()
        {
        return side * side;
        }
//Rectangle area
        int areaRect()
        {
        return length * width;
        }
//Circle area
double areaCir()
        {
        return pi*(radius*radius);
        }
//Triangle area
        float areaTri()
        {
        return (base * length)/2;
        }
//Cube
        float areaCube()
        {
        return 6 * sideC;
        }
        }
class shapesCalculations
{
    public static void main(String args[])
    {
// create boxes using the various
// constructors
        Shapes Square = new Shapes(10);
        Shapes Rectangle = new Shapes((int)10,(int)20);
        Shapes Circle = new Shapes((double)10);
        Shapes Triangle = new Shapes((float)10,(int)20);
        Shapes Cube = new Shapes((float)10);
        int areaInt;
        double areaDouble;
        float areaFloat;
        areaInt = Square.areaSqu();
        System.out.println(" Area of Square is : " + areaInt);
        areaDouble = Rectangle.areaRect();
        System.out.println(" Area of Rectangle is : " + areaDouble);
        areaDouble = Circle.areaCir();
        System.out.println(" Area of Circle is : " + areaDouble);
        areaFloat = Triangle.areaTri();
        System.out.println(" Area of Triangle is : " + areaFloat);
        areaFloat = Cube.areaCube();
        System.out.println(" Area of Cube is : " + areaFloat);
    }
}
