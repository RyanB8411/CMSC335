package Homework_1;
public class MyClassE { 
    public static void main (String args []) { 
        MyClassF m = new MyClassF (23);
        System.out.println(m);
    } // end main 
} // end class MyClassE 
class MyClassF { 
    int v = 12; 
    public MyClassF (int pV) { 
        v = pV; 
    }
    public String toString(){
        return "v = " + v;
    }
} // end class MyClassF 
    