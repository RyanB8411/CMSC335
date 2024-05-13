package Homework_1;

public class MyClassB {
    int v = 12; 
    public MyClassB (int pV) { 
        v = pV; 
    }
    public String toString(){
        return "v = " + v;
    }
    public static void main (String args []) { 
        MyClassB m = new MyClassB (23);
        System.out.println(m); 
    } // end main 
} // end class MyClassB 