public class H2ClassE { 
    int x, y, z; 
    public static final int MyNumber = 17;
    public static final double MyNumberCorrection = 17.36;
      
    H2ClassE (int a) {
    this (5, 12); 
    x = a;  
    } 
      
    H2ClassE (int b, int c) { 
    y = b; 
    z = c; 
    }
    public static void main(String[] args){
        H2ClassE obj = new H2ClassE(10);
        System.out.println(obj.x + " " + obj.y + " " +  obj.z);
    } 
}
    