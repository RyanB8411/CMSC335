public class MyClassA {
    int v = 12; 
    public MyClassA (int pV) { 
        v = pV;
    }
    public String toString(){
        return "v = " + v;
    }
    public static void main (String args []) { 
        MyClassA m = new MyClassA (22); 
        System.out.println(m);
    } // end main 
} // end class MyClassA 