
class FindArea{
    final float pi = 3.14F;
    FindArea(){
        
    }
    float area(float radius ,boolean isCircle){
            return pi*radius*radius;
    }
    float area(float length, float width){
        return length*width;
    }
    float area(float length ){
        return length*length;
    }
}

public class ClassWithMethodOverloading_5_1 {
    public static void main(String args[]){
        FindArea obj = new FindArea();
        System.out.println("Area of circle " + obj.area(2, true));
        System.out.println("Area of rectangle " + obj.area(3, 6));
        System.out.println("Area of square " + obj.area(2));
    }
}
