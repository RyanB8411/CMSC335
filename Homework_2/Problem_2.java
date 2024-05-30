import java.util.ArrayList; 
2  
3public class H2ClassA { 
4	ArrayList <H2ClassB> list = new ArrayList <H2ClassB> (); 5  
6	public static void main (String args []) { 
    7	H2ClassA y = new H2ClassA (); 
    8	int [] v = {4, 3, 7, 5, 99, 3}; 
    9	for (int m: v)  
    10	y.list.add (new H2ClassB (m)); 
    11	System.out.println (y); 
    12   } // end main 14
    } // end class H2ClassA 
13  
15  
16	class H2ClassB { 
17	int x; 
18	H2ClassB (int a) { x = a;} 19 } // end H2ClassB 
