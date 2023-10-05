interface sy {
int strength=80;
abstract void display();    
}
class stud implements sy{
    public void display (){
        System.out.println("SY strength is: "+sy.strength);
    }
}
class interfacedemo1{
    public static void main(String args[]){
        stud s= new stud();
        s.display();
    }
}
