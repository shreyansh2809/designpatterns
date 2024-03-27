import java.util.HashMap;
import java.util.Map;

public class InterviewRound2 {

    int a = 289235825;
    long var = a;

    long b = 21893458983593l;

    Map<Integer, Integer> mp = new HashMap<>();
    Map<Integer, Integer> mp1 = new HashMap<>();

    for(Integer i: mp.values()) {
        Integer key = new Integer(i);
        Integer value = new Integer(mp.get(i));
        mp1.put(key,value);
    }

//    2 <-> 3 <-> 4
//
//            (1)

//    Obj1 -> "Shriyansh"

}

class DBConnection {

    public static DBConnection instance;

    private DBConnection(){}

    public static DBConnection getInstance() {
        if(instance==null) {
            instance = new DBConnection();
        }
        return instance;
    }

}


