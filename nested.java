class Outer {
   static int x= 10;

    static class Inner {
        static int y = 29;
        void display() {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
public class nested {
    public static void main(String args[]) {
        Outer.Inner n = new Outer.Inner();
        n.display();

    }
}
