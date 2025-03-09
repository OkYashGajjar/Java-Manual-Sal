abstract class Shape{
    double base, height;
    double calculation;
    void initValues(){
        base = 10;
        height = 5;
    }
    abstract void area();
}

class Triangle extends Shape{
    @Override
    public void area() {
        calculation = (base * height)/2;
        System.out.println("Area of triangle is : " + calculation);
    }
}

class Rectangle extends Shape{
    public void area() {
        calculation = (base * height);
        System.out.println("Area of rectangle is : " + calculation);
    }
}

public class Shape_7_2 {
    public static void main(String[] args){
        Triangle obj1 = new Triangle();
        Rectangle obj2 = new Rectangle();
        obj1.initValues(); //for implementation, we have to init values first.
        obj2.initValues(); //for implementation, we have to init values first.
        obj1.area();
        obj2.area();
    }
}
