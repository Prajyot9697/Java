class circle {
    int radius=4;
 double area=3.14f*radius*radius;
    void area(){
        System.out.println("Area of circle is : "+area);
    }  
}
class cylinder extends circle{
    int radius=2;
    int height=4;
    double area1=3.14*radius*radius*height;
         void area(){
        System.out.println("Area of cylinder is : "+area1);
        //System.out.println(super.area);
    }
    void area1(){
        super.area();
    }
}
class areac{
    public static void main(String[] args) {
        cylinder c= new cylinder();
        c.area();
        c.area1();
    }
}
