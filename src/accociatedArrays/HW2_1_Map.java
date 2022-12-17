package accociatedArrays;

import java.util.*;

public class HW2_1_Map {
    public List<Integer> fillList() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int number;
        for (int i = 0; i < 3; i++) {
            number = random.nextInt(1000);
            list.add(i, number);
        }
        return list;
    }
}
