public class Main {

    public static Dog dog = new Dog();
    public static Adoption adoption = new Adoption();
    public static Food food = new Food();
    public static Activities activities = new Activities();
    public static Vet vet = new Vet();

    public static void main(String[] args) {
        //Dog values
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.favouriteActivity);
        System.out.println(dog.favouriteFood);

        //Adoption values
        System.out.println(adoption.name);
        System.out.println(adoption.budget);

        //Food values
        System.out.println(food.foodName);
        System.out.println(food.price);
        System.out.println(food.isAvailable);

        //Activities values
        System.out.println(activities.activityName);

        //Vet values
        System.out.println(vet.vetName);
        System.out.println(vet.vetSpeciality);

    }
}
