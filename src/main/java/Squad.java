import java.util.List;
import java.util.ArrayList;

public class Squad {
    private int hMaxSize;
    private String hName;
    private String hCause;
    private int hId;
    private static List<Squad> instances = new ArrayList<Squad>();


    public Squad(int hMaxSize, String hName, String hCause) {
        this.hMaxSize = 3;
        this.hName = hName;
        this.hCause = hCause;
        this.hId = instances.size();
    }

    public int getId() {
        return hId;
    }

    public int getMaxSize() {
        return hMaxSize;
    }

    public String getName() {
        return hName;
    }

    public String getCause() {
        return hCause;
    }

    public static List<Squad> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public static Squad find(int id) {
        return instances.get(id - 1);
    }

    public boolean checkForMaximumMembers(){
        return true;
    }
}

