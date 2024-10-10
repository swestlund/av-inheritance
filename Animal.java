public abstract class Animal extends Entity {

    public String favoriteFood;

    public Animal(String name, String favoriteFood){
        super(name);

        this.favoriteFood = favoriteFood;
    }

    public void eat(){

    }
}
