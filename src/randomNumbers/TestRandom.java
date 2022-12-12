package randomNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
      Numbers numbers = new Numbers();
      numbers.fillList();
      System.out.println(numbers.numbersList.toString());
      numbers.deleteOddNumbers();
    }
}
