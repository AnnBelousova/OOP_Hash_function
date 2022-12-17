package multiplicationTable;

import transport.Mechanic;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestTable {
    public static void main(String[] args) {
        int min = 3;
        int max = 9;
        int differences = max - min;
        Random random = new Random();
        Set<Task> tasks = new HashSet<>();
        Task task;
        while (tasks.size() < 15) {
            int a = random.nextInt(differences + 1);
            int b = random.nextInt(differences + 1);
            task = new Task(a,b);
            a += min;
            b += min;
            tasks.add(task);
            System.out.println(task);
        }
        //System.out.println(tasks);
    }
}
