
class student1 {
    //private access specifier
    //private void display()
    //public access specifier
    //public void display()
    protected void display(){
        System.out.println("this is student 1");
    }
}
class student2{
    public static void main(String args[]){
        student1 s1= new student1();
        s1.display();
    }
}
