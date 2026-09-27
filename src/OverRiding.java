class Animal1 {
    void sound() {
        System.out.println("Animal Makes Sound");
    }

}
class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

    public class OverRiding {
        public static void main(String[] args) {
            Dog1 d = new Dog1();
            d.sound();
        }
    }

