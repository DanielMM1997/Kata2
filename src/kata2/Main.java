package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        Integer[] data = {1, 5, 3, 0, 4, 10, 1, 5, 9, 4, 10, 12, 5, 7, 9};
        Histogram histo = new Histogram(data); 
        Map<Integer, Integer> histgr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histgr.entrySet()) {
            System.out.println(entry.getKey()+ "==>" + entry.getValue());
        }
    }
}
