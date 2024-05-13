package Homework_1;
public class MyClassD { 
    public static void main (String args []) { 
        MyClassC m = new MyClassC (23);
        System.out.println(m);
    } // end main 
} // end class MyClassD 
class MyClassC { 
    int v = 12; 
    public MyClassC (int pV) { 
        v = pV;
    }public String toString(){
        return "v = " + v;
    }
} // end class MyClassC 
    