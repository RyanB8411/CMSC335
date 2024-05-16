package Discussions;

public class Discussion_Response_Week2 {
    class Animal {
        public void sound() {
            System.out.println("Animal sound");
        }
    }
    class Dog extends Animal {
        public void sound() {
            System.out.println("Dog sound = Bark");
        }
    }
    class Cat extends Animal {
        public void sound() {
            System.out.println("Cat sound = Meow");
        }
    }
    class Tiger extends Cat {
        public void sound() {
            System.out.println("Tiger sound = Roar");
        }
    }
    class Shape {
        public void Draw() {
            System.out.println("Drawing a shape...");
        }
    }
    class Triangle extends Shape {
        public void Draw() {
            System.out.println("Drawing a Triangle...");
        }
    }
    class Circle extends Shape {
        public void Draw() {
            System.out.println("Drawing a Circle...");
        }
    }
    class Trapezoid extends Shape {
        public void Draw() {
            System.out.println("Drawing a Trapezoid...");
        }
    }
    public static void main (String[] args) {
        Discussion_Response_Week2 CullyResponse = new Discussion_Response_Week2();
        Animal a = CullyResponse.new Animal();
        a.sound();
        Animal d = CullyResponse.new Dog();
        d.sound();
        Animal c = CullyResponse.new Cat();
        c.sound();
        Animal t = CullyResponse.new Tiger();
        t.sound();
        Discussion_Response_Week2 MiguelResponse = new Discussion_Response_Week2();
        Shape s = MiguelResponse.new Shape();
        s.Draw();
        Shape tr = MiguelResponse.new Triangle();
        tr.Draw();
        Shape cir = MiguelResponse.new Circle();
        cir.Draw();
        Shape tra = MiguelResponse.new Trapezoid();
        tra.Draw();
    }
}
