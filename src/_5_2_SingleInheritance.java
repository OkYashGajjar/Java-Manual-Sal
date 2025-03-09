// SingleInheritance -->        class1<----class2

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
public class _5_2_SingleInheritance {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
