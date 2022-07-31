public class Main {



    public static Dog dog = new Dog();
    public static Cat cat = new Cat();
    public static Duck duck = new Duck();
    public static Adoption adoption = new Adoption();
    public static Food food = new Food();
    public static Activities activities = new Activities();
    public static Vet vet = new Vet();

    public static void main(String[] args) {
        //Dog values
        dog.setAge(5);
        dog.setName("Ralph");
        dog.setFavouriteActivity("sleeping");
        dog.setFavouriteFood("NutriBest");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getFavouriteActivity());
        System.out.println(dog.getFavouriteFood());
        dog.makeSound();
        dog.isHappy();

        //Cat values
        cat.setAge(2);
        cat.setColor("black");
        cat.setName("Timi");
        cat.setHealthStatus(4);
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        System.out.println(cat.getName());
        System.out.println(cat.getHealthStatus());
        cat.makeSound();
        cat.isHappy();

        //Duck values
        duck.setRace("decorative");
        duck.setFavouriteFood("corn");
        System.out.println(duck.getRace());
        System.out.println(duck.getFavouriteFood());
        duck.makeSound();
        duck.isHappy();

        //Adoption values
        System.out.println(adoption.getName());
        System.out.println(adoption.getBudget());

        //Food values
        System.out.println(food.getFoodName());
        System.out.println(food.getPrice());
        System.out.println(food.getQuantity());

        //Activities values
        System.out.println(activities.getActivityName());

        //Vet values
        System.out.println(vet.getVetName());
        System.out.println(vet.getVetSpeciality());

    }
}
