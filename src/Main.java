import units.*;

public class Main {
    public static void main(String[] args) {
        Farmer farmer = new Farmer("Фермер", 5);
        Farm farm = new Farm(farmer);
        WildAnimals[] wildAnimals = new WildAnimals[10];
        Cat cat = new Cat("Кот", 3, 10, 70);
        Chicken chicken = new Chicken("Курица", 5, 7, 30, 3);
        Core core = new Core("Корова", 50,3, 100, 5 );
        Rabbit rabbit = new Rabbit("Кролик", 4, 25, 40);
        Pets[] pets = {cat, chicken, core, rabbit};
        Wolf wolf = new Wolf("Волк", 15, 20, 70, 30);
        Fox fox = new Fox("Лиса", 10, 15, 50, 15);
        Bear bear = new Bear("Медведь", 80, 50, 100, 50);
        WildAnimals[] wildAnimals1 = {wolf, fox, bear};




    }
}
