
abstract class Vegetable {
    String color;
    Vegetable(String color){
        this.color = color;
    }
    public abstract String toString();
}

class Potato extends Vegetable{
    public Potato(String color){
        super(color);
    }
    public String toString() {
        return "Vegetable : Potato , Color : " + color;
    }
}

class Brinjal extends Vegetable{
    public Brinjal(String color){
        super(color);
    }
    public String toString() {
        return "Vegetable : Brinjal , Color : " + color;
    }
}

class Tomato extends Vegetable{
    public Tomato(String color){
        super(color);
    }
    public String toString() {
        return "Vegetable : Tomato , Color : " + color;
    }
}

public class AbstractClass_7_1 {
    public static void main(String[] args){
        Vegetable potato = new Potato("Brown");
        Vegetable brinjal = new Brinjal("Purple");
        Vegetable tomato = new Tomato("Red");
        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}
