package Collection;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Xstreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                result.add(number * number);
            }
        }

        Collections.sort(result, Collections.reverseOrder());
//        System.out.println(result);


        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result2 = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
//                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
//        System.out.println(result2);


        List<Integer> numbers3 = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
//        numbers3.forEach(n-> System.out.println(n));





        numbers3.forEach((i)-> System.out.println(i));

    }
}
