package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        int data[] = {1, 5, 3, 0, 4, 10, 1, 5, 9, 4, 10, 12, 5, 7, 9};
        Map <Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }

        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]+ " ==> " + histogram.get(data[i]));            
        }
    }
}
