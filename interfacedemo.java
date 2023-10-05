interface stud{
    abstract void display();
}
class demo1 implements stud{
    int rollno=101;
    String name= "Sanket";
    public void display(){
        System.out.println("The Roll no is: "+rollno+" and the name is: "+name);
    }
}
class interfacedemo{
    public static void main(String args[]){
        demo1 d= new demo1();
        d.display();
    }
}