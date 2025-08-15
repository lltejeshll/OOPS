abstract class Shape {
    abstract void draw();

    void info(){
        System.out.println("This is a shape.");
    }
    
}

class Rectangle extends Shape{
    @ Override

    void draw(){
        System.out.println("Drawing a Rectangle.");
    }
    }

class Circle extends Shape{
    @ Override
    void draw(){
        System.out.println("Drawing a Circle.");
    }
}
