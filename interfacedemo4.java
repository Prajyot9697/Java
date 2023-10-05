interface fy{
    abstract void display();
}
interface sy extends fy{
    abstract void show();
}
    public class interfacedemo4 implements sy{
        public void show(){
            System.out.println("This is SY");
        }
        public void display(){
            System.out.println("This is FY");
        }
    public static void main(String args[]){
        interfacedemo4 i= new interfacedemo4();
        i.display();
        i.show();
    }
}
