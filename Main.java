import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    // Entity entity = new Entity();
    // Animal animal = new Animal();
    Cow cow = new Cow("Rosa", "Tacos");
    Zombie zombie = new Zombie("Frank");
    cow.name = "";
    cow.eat();

    List<Entity> entities = new ArrayList<>();
    entities.add(cow);
    entities.add(new Zombie("Adam"));

    for (Entity entity : entities){
        if (entity instanceof Cow){
        }

        if (entity instanceof Zombie){
        }

        if (entity instanceof Animal){
            Animal animal = (Animal) entity;
            System.out.println(animal.favoriteFood);
        }
    }



    }
    //entities.add(cow);
   // entities.add(new Zombie());
    //entities.add(cow);
    //entities.add(new Zombie("Frank"));

}
