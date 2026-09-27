class Animal2{
    void eat() {
        System.out.println("Animal Is Eating");
    }
}
class Dog2 extends Animal2{
    void bark(){
        System.out.println("Dog Barks");
    }
}
class puppy extends Dog2{
    void play(){
        System.out.println("Puppy Plays");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args){
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.play();
    }
}
