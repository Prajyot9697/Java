class demo{
    static int count;
    demo(){
    System.out.println("Constructor Called !");
    count++;
    }
    static int objCount() {
    return count;
    }
    public static void main(String[] args){
    demo obj1 = new demo();
    demo obj2 = new demo();
    demo obj3 = new demo();
    demo obj4 = new demo();
    int cnt = objCount();
    System.out.println("Number of Object is: " + cnt);
    }
    } 
    