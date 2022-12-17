package accociatedArrays;

import java.util.*;

public class Test {
    static HW2_1_Map map = new HW2_1_Map();
    static List<ArrayList<Integer>> list = new ArrayList<>();
    static Map<String, List<Integer>> listMap = new HashMap<>();
    static Map<String, Integer> listMapNew = new HashMap<>();

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        listMap.put("one", map.fillList());
        listMap.put("two", map.fillList());
        listMap.put("three", map.fillList());
        listMap.put("four", map.fillList());
        listMap.put("five", map.fillList());
        System.out.println("Task 2.1: ");
        System.out.println("Printing initial map: ");
        for (Map.Entry<String, List<Integer>> entry : listMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for (List<Integer> entry : listMap.values()) {
            list.add((ArrayList<Integer>) entry);
        }
        String[] str = listMap.keySet().toArray(new String[0]);
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> arr = list.get(i);
            int sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                sum += arr.get(j);

            }
            listMapNew.put(str[i], sum);
        }
        System.out.println("\nPrinting new Map: ");
        for (Map.Entry<String, Integer> entry : listMapNew.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

    public static void task2(){
        System.out.println("\nTask 2 :");
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(5,"one");
        map.put(8,"eight");
        map.put(1,"one");
        map.put(3,"three");
        map.put(6,"six");
        map.put(4,"four");
        map.put(5,"five");
        map.put(2,"two");
        map.put(7,"seven");
        map.put(0,"zero");
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
