// meaning : class A is accessible by Class B, Class B is accessible by class C,
// indirectly & Directly class A & B is accessible by class C

class NewAnimal{
    void eat(){
        System.out.println("eating...");
    }
}
class BabyDog extends NewAnimal{
    void weep(){
        System.out.println("Weeping...");
    }
}
class NewDog extends BabyDog{
    void bark(){
        System.out.println("barking...");
    }
}


public class MultiLevelInheritance {
    public static void main(String args[]){
        NewDog obj = new NewDog();
        obj.eat();
        obj.weep();
        obj.bark();
    }
}
