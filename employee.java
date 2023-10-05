class emp{
    int e,sal;
    String name;
    emp( int eno,String ename, int s){
        e=eno;
        name=ename;
        sal=s;
    }
    void display(){
        System.out.println(e+" "+name+" "+sal);
    }
}public class employee {
    public static void main(String args[]){
    emp e1= new emp(1,"sanket",2434);
    e1.display();
}
}