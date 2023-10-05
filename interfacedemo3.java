interface fy {
    int sum = 90;

    abstract void display();
}

interface sy {
    int sum = 40;

    abstract void display();
}

class stud implements fy, sy {
    public void display() {
        System.out.println("Sum is : " + fy.sum);
        System.out.println("Sum is : " + sy.sum);
    }
}

public class interfacedemo3 {
    public static void main(String srgs[]) {
        stud s = new stud();
        s.display();
    }
}
