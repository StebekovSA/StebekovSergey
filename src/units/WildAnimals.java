package units;

public class WildAnimals extends Animals {
protected int force;

    public WildAnimals(String name, int weight, int speed, int health, int force) {
        super(name, weight, speed, health);
        this.force = force;


    }
}
