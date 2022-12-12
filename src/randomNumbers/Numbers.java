package randomNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numbers {
    List<Integer> numbersList = new ArrayList<>();
    List<Integer> newNumberList = new ArrayList<>();
    public void fillList(){
        int min = 0;
        int max = 1000;
        int differences = max - min;
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(differences + 1);
            number += min;
            numbersList.add(number);
        }
       // System.out.println(numbersList);
    }

    public void deleteOddNumbers(){
        for (int i = 0; i < numbersList.size(); i++) {
            if(numbersList.get(i) % 2 == 0){
                newNumberList.add(numbersList.get(i));
            }
        }
        System.out.println(newNumberList);
    }
}
