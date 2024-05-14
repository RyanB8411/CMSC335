package Homework_1;

public class Problem10 {

    class Tree{

        //private fields encapsulation
        private int height;
        private boolean needsWater;
        
        //constructor
        public Tree(int height){
            this.height = height;
            this.needsWater = true;
        }
        //getters
        public int getHeight(){
            return this.height;
        }
        public boolean getNeedsWater(){
            return this.needsWater;
        }
        //setters
        public void setHeight(int height){
            this.height = height;
        }
        public void setNeedsWater(boolean needsWater){
            this.needsWater = needsWater;
        }

    }
    class PineTree extends Tree{
        private boolean hasNeedles;
        //constructor
        public PineTree(int height, boolean hasNeedles){
            super(height);
            this.hasNeedles = hasNeedles;
        }
        //getters
        public boolean getHasNeedles(){
            return this.hasNeedles;
        }
        //setters
        public void setNeedles(boolean hasNeedles){
            this. hasNeedles = hasNeedles;
        }
    }
    class MapleTree extends Tree{
        private boolean hasLeaves;
        public MapleTree(int height, boolean hasLeaves){
            super(height);
            this.hasLeaves = hasLeaves;
        }
        //getters
        public boolean getHasLeaves(){
            return this.hasLeaves;
        }
        //setters
        public void setHasLeaves(boolean hasLeaves){
            this.hasLeaves = hasLeaves;
        }
    }
}
