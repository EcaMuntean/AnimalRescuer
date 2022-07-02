public class Dog {

    private int age = 10;
    private String race = "buldog";
    private String name = "Ralph";
    private String color = "gray";
    private double weight =  10.5;
    private int heightCm = 20;
    private int healthStatus = 9;
    private int hungryStatus = 4;
    private int spiritStatus = 8;
    private String favouriteFood = "Chicken meat";
    private String favouriteActivity = "Sleeping";

    //Getters
    public int getAge(){
        return age;
    }
    public String getRace(){
        return race;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public double getWeight(){
        return weight;
    }
    public int getHeightCm(){
        return heightCm;
    }
    public int getHealthStatus(){
        return healthStatus;
    }
    public int getHungryStatus(){
        return hungryStatus;
    }
    public int getSpiritStatus(){
        return spiritStatus;
    }
    public String getFavouriteFood(){
        return favouriteFood;
    }
    public String getFavouriteActivity(){
        return favouriteActivity;
    }
    //Setters
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setRace(String newRace){
        this.race = newRace;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setColor(String newColor){
        this.color=newColor;
    }
    public void setWeight(double newWeight){
        this.weight = newWeight;
    }
    public void setHeightCm(int newHeight){
        this.heightCm = newHeight;
    }
    public void setHealthStatus(int newHealthStatus){
        this.healthStatus = newHealthStatus;
    }
    public void setHungryStatus(int newHungryStatus){
        this.hungryStatus = newHungryStatus;
    }
    public void setSpiritStatus(int newSpiritStatus){
        this.spiritStatus = newSpiritStatus;
    }
    public void setFavouriteFood(String newFavouriteFood){
        this.favouriteFood = newFavouriteFood;
    }
    public void setFavouriteActivity(String newFavouriteActivity){
        this.favouriteActivity = newFavouriteActivity;
    }
}
