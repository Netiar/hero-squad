import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String hName;
    private String hPower;
    private int hAge;
    private int hWeakness;
    private int hId;

    public static List<Hero> instances = new ArrayList<Hero>();

    public Hero(String name, String power, int age, String weakness) {
        this.hName = name;
        this.hPower = getName();
        this.hAge = age;
        this.hWeakness = getWeakness();
        this.hId = instances.size() ;
    }

    public Hero(String name, String power, String age, String weakness, String id) {
    }

    public String getName() {
        return this.hName;
    }

    public String getPower() {
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
        instances.get(id - 1).hPower = String.valueOf(power);
        instances.get(id - 1).hAge = age;
        instances.get(id - 1).hWeakness = weakness;
    }

    public static void destroy(int id) {
        instances.remove(id - 1);
    }
}






