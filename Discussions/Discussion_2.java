package Discussions;

public class Discussion_2 {
    public class Airplane {
        public void fly() {
            System.out.println("The airplane is flying in the sky.");
        }
    }
    class Passenger extends Airplane {
        @Override
        public void fly() {
            System.out.println("The P-3 is flying in the sky with 200 passengers.");
        }
    }
    class Fighter extends Airplane {
        @Override
        public void fly() {
            System.out.println("The F-16 is flying in the sky at high speed.");
        }
    }
    class Cargo extends Airplane {
        @Override
        public void fly() {
            System.out.println("The C-130 is flying in the sky, carrying freedom and democracy.");
        }
    }
    public static void main(String[] args) {
        Discussion_2 discussion = new Discussion_2();

        Airplane plane = discussion.new Airplane();
        plane.fly();

        Airplane plane1 = discussion.new Passenger();
        plane1.fly();

        Airplane plane2 = discussion.new Fighter();
        plane2.fly();

        Airplane plane3 = discussion.new Cargo();
        plane3.fly();
    }
}