public class Main {

    public static Dog dog = new Dog();
    public static Adoption adoption = new Adoption();
    public static Food food = new Food();
    public static Activities activities = new Activities();
    public static Vet vet = new Vet();

    public static void main(String[] args) {
        //Dog values
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getFavouriteActivity());
        System.out.println(dog.getFavouriteFood());

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
