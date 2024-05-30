public class H2ClassC { 
    H2ClassC (int a) {} 
} // end class H2ClassC 

class H2ClassD extends H2ClassC{ 
    H2ClassD(int a) {
        super(a); // call the superclass constructor
    }
} // end class H2ClassD