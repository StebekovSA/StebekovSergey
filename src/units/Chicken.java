package units;

public class Chicken extends Pets {
    private int resources;
    public Chicken(String name, int weight, int speed, int health, int resources) {
        super(name, weight, speed, health);
        this.resources = resources;
    }
}
