
 class student18 implements Cloneable{
    int rollno;
    String name;
    student18(int rollno, String name){
        this.rollno= rollno;
        this.name= name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String args[]){
        try{
        student18 s1= new student18(101,"Sanket");
        student18 s2=(student18)s1.clone();
        System.out.println(s1.rollno+" "+s1.name);
        System.out.println(s2.rollno+" "+s2.name);

    }catch (CloneNotSupportedException c){}
}
}
