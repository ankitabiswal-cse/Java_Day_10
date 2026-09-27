class Vehicle{
    Vehicle(){
        System.out.println("Vehicle Constructor");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("Car Constructor");
    }
}

public class InheritanceWithConstructor {
    public static void main(String[] args){
        Car c1 = new Car();
    }
}
