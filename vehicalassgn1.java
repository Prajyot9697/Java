import javax.sound.sampled.SourceDataLine;

 class vehicalassign1 {
    protected int regNo;
    protected double Speed;
    protected String color;
    protected String ownerName;

    void Showdata(){
        System.out.println("This is Vehical class");
    }
}
class bus extends vehicalassign1{
    private int routeNo;
    bus(int No,double speed,String Color, String Owner,int rNo){
        regNo=No; 
        Speed=speed;
        color= Color;
        routeNo=rNo;
        ownerName= Owner;
    }
    void Showdata(){
        System.out.println(" rgno "+regNo+"\n color :"+color+"\n speed :"+Speed+"\n owner :"+ownerName+"\n routeno :"+routeNo);
    }
}
class Car extends vehicalassign1{
    private String Manufracturername;

    Car(int No,double speed,String Color, String Owner,String Mname){
        regNo=No; 
        Speed=speed;
        color= Color;
        Manufracturername=Mname;
        ownerName= Owner;
    }
    void Showdata(){
        System.out.println(" rgno "+regNo+" color :"+color+"\n speed :"+Speed+"\n owner :"+ownerName+"\n Manufracturer :"+Manufracturername);
    }
}
class vehicalassgn1{
    public static void main(String[] args) {
        Car c= new Car(911, 90, "black", "sanket", "tata");
        bus b= new bus(123, 89, "red", "ST", 36);
        c.Showdata();
        b.Showdata();
    }
}
