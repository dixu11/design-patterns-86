package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(23, 45, 56, 67, 34, 23, 12, 345,3 ));
        /*for (Integer number : numbers) {
            if (number == 67) {
                int index = numbers.indexOf(67);
                System.out.println("67 jest na pozycji " + index);
                numbers.remove(index);
            }
            System.out.println(number);
        }
        System.out.println(numbers);*/

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number == 67) {
               // int index = numbers.indexOf(67);
               // System.out.println("67 jest na pozycji " + index);
               // numbers.remove(index);
                iterator.remove();
            }
            System.out.println(number);
        }
        System.out.println(numbers);


    }
}
