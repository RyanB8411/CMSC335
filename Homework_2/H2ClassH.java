public class H2ClassH { 
    final int x;

    H2ClassH () {
        x=7;
    }
    int H2ClassHMethod(){
        if (x == 7)return 1;
        return 2;
    }//end

    public static void main(String[] args){
        H2ClassH h = new H2ClassH();
        System.out.println(h.H2ClassHMethod());
    }
} // end class H2ClassH