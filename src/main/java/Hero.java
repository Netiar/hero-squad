import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String hName;
    private int hPower;
    private int hAge;
    private int hWeakness;
    private int hId;

    public static List<Hero> instances = new ArrayList<Hero>();

    public Hero(String name, int power, int age, int weakness, int id) {
        this.hName = name;
        this.hPower = power;
        this.hAge = age;
        this.hWeakness = weakness;
        this.hId = id;
    }

    public String getName() {
        return this.hName;
    }

    public int getPower() {
        return this.hPower;
    }

    public int getAge() {
        return this.hAge;
    }

    public int getWeakness() {
        return this.hWeakness;
    }

    public int getId() {
        return this.hId;
    }

    public static List<Hero> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public static Hero find(int id) {
        return instances.get(id - 1);
    }

    public static void add(Hero hero) {
        instances.add(hero);
    }

    public static void update(int id, String name, int power, int age, int weakness) {
        instances.get(id - 1).hName = name;
        instances.get(id - 1).hPower = power;
        instances.get(id - 1).hAge = age;
        instances.get(id - 1).hWeakness = weakness;
    }

    public static void destroy(int id) {
        instances.remove(id - 1);
    }
}






