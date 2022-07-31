public class Animal {
    private int age ;
    private String race ;
    private String name ;
    private String color ;
    private double weight ;
    private int heightCm ;
    private int healthStatus ;
    private int hungryStatus ;
    private int spiritStatus ;
    private String favouriteFood  ;
    private String favouriteActivity;

    public void makeSound(){
        System.out.println("bark");
    }
    public void isHappy(){
        System.out.println("reaction");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(int healthStatus) {
        this.healthStatus = healthStatus;
    }

    public int getHungryStatus() {
        return hungryStatus;
    }

    public void setHungryStatus(int hungryStatus) {
        this.hungryStatus = hungryStatus;
    }

    public int getSpiritStatus() {
        return spiritStatus;
    }

    public void setSpiritStatus(int spiritStatus) {
        this.spiritStatus = spiritStatus;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }
}
