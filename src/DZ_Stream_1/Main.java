package DZ_Stream_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        filterCollectionAPI(numbers);

    }

    public static void filterCollectionAPI(List<Integer> numbers) {
        List<Integer> requiredNumbers = new ArrayList();

        for (Integer i : numbers) {
            if (i > 0 && i % 2 == 0) {
                requiredNumbers.add(i);
            }
        }
        requiredNumbers.sort(Comparator.naturalOrder());

        System.out.println("Числа отфильтрованные с использованием Collection API:");

        for (Integer i : requiredNumbers) {
            System.out.print(i + " / ");
        }
        System.out.println();
    }
}
