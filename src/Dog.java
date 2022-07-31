public class Dog extends Animal {

    public void makeSound() {
        System.out.println("woof");
    }

    @Override
    public void isHappy() {
        System.out.println("tail moving");
    }
}
