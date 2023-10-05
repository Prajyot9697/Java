abstract class shape {
    abstract void area();
   
}
class rectangle extends shape{
    int breadth, height;
    rectangle(int b,int h){
        breadth=b;
        height=h;
    }
   
            void area(){
            System.out.println("area of Rectangle is : "+breadth*height);
            }
        }
class triangle extends shape{
            int base, height;
            triangle(int b,int h){
                base=b;
                height=h;
            }
            void area(){
                System.out.println("area of triangel is : "+0.5f*base*height);
            }
        }
class shape1{
    public static void main(String[] args) {
        rectangle r = new rectangle(2,3);
        r.area();
        triangle t= new triangle(3, 4);
        t.area();
    }
}
