package Homework_1;

public class MyClassG { 
    public static void main (String args []) { 
        MyClassH m = new MyClassH (23, true);
        System.out.println(m); 
    } // end main 
} // end class MyClassG 
class MyClassH { 
    int v = 12; 
    public MyClassH (int x, boolean b) { 
        this (x);
    }
    private MyClassH (int pV) { 
        v = pV; 
    }
    public String toString(){
        return "v = " + v;
    }
} // end class MyClassH 
