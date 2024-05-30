import java.util.ArrayList; 
  
public class H2ClassA { 
	ArrayList <H2ClassB> list = new ArrayList <H2ClassB> (); 
	
	@Override//Override the toString built in method
    public String toString() {
        StringBuilder sb = new StringBuilder();//Create the new string builder
        for (H2ClassB itemInList : list) {//Initialize a for loop for each element in the class object
            sb.append(itemInList.toString()).append(" ");//Add each item in the list and a space
        }
        return sb.toString().trim(); // remove trailing space at the very end
    }
	public static void main (String args []) { 
    	H2ClassA y = new H2ClassA (); 
    	int [] v = {4, 3, 7, 5, 99, 3}; 
    	for (int m: v)  
    	y.list.add (new H2ClassB (m)); 
    	System.out.println (y); 
       } // end main 14
    } // end class H2ClassA 
  
  
	class H2ClassB { 
	int x; 
	H2ClassB (int a) {
		x = a;
	}
	@Override//Override the toString built in method
	public String toString() {
		return Integer.toString(x); // return the value of x
		}
 } // end H2ClassB 
