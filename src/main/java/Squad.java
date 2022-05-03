import java.util.List;
import java.util.ArrayList;

public class Squad {
    private int hMaxSize;
    private String hName;
    private String hCause;
    private int hId;
    private static List<Squad> instances = new ArrayList<Squad>();


    public Squad(int hMaxSize, String hName, String hCause) {
        this.hMaxSize = hMaxSize;
        this.hName = hName;
        this.hCause = hCause;
        this.hId = hId;
    }
}

