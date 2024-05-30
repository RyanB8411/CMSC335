
public class H2ClassG { 
    final int x; 
    H2ClassG () {
        this.x=0;
    } 
    H2ClassG (int a) {x = a;} 
    public static void main(String[] args){
        H2ClassG obj = new H2ClassG();
        System.out.println(obj.x);
        H2ClassG obj2 = new H2ClassG(4);
        System.out.println(obj2.x);
    }
} // end class H2ClassG
