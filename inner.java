class outer{
    int x= 2;
    class inner{
        int y=3;
        void display(){
            System.out.println("This is inner class");
        }
    }
    void dsiplay(){
        inner i= new inner();
        i.display();
    }
}public class inner {
    public static void main(String args[]){
        outer n= new outer();
        n.dsiplay();
    }
    
}
