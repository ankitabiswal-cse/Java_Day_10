class Animal{
    void eat(){
        System.out.println("Animal Is Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
}

public class BasicInheritance {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
