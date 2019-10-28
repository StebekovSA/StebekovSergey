package units;

public class Core extends Pets {
    private int resources;
    public Core(String name, int weight, int speed, int health, int resources) {
        super(name, weight, speed, health);
        this.resources = resources;
    }
}
