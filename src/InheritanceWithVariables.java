class Person {
    String name = "Ankita Biswal";

}
class Student extends Person{
    int regdNo = 20;

    void display(){
        System.out.println("Name :"+name);
        System.out.println("Regd Number :"+regdNo);
    }
}
public class InheritanceWithVariables {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.display();
    }
}
