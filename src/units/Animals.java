package units;

public class Animals extends Units {
    protected int weight;
    protected int speed;
    protected int health;

    public Animals(String name, int weight, int speed, int health) {
        super(name);
        this.weight = weight;
        this.speed = speed;
        this.health = health;
    }
}
