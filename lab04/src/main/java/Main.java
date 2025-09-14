import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация методов с использованием Stream API ===\n");

        /////////////////////////////////////////////////////////////////////////////

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("1. Среднее значение списка " + numbers + " = " + StreamUtils.getAverage(numbers));

        List<Integer> emptyList = Arrays.asList();
        System.out.println("   Среднее значение пустого списка = " + StreamUtils.getAverage(emptyList));

        /////////////////////////////////////////////////////////////////////////////

        List<String> strings = Arrays.asList("hello", "world", "java", "stream");
        System.out.println("\n2. Преобразование строк " + strings);
        System.out.println("   Результат: " + StreamUtils.transformToUpperCaseWithPrefix(strings));

        /////////////////////////////////////////////////////////////////////////////

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6);
        System.out.println("\n3. Квадраты уникальных элементов списка " + numbersWithDuplicates);
        System.out.println("   Результат: " + StreamUtils.getSquaresOfUniqueElements(numbersWithDuplicates));

        /////////////////////////////////////////////////////////////////////////////

        List<String> nonEmptyList = Arrays.asList("first", "middle", "last");
        System.out.println("\n4. Последний элемент списка " + nonEmptyList + " = " + StreamUtils.getLastElement(nonEmptyList));

        try {
            StreamUtils.getLastElement(Arrays.asList());
        } catch (NoSuchElementException e) {
            System.out.println("   Попытка получить последний элемент пустого списка: " + e.getMessage());
        }

        /////////////////////////////////////////////////////////////////////////////

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\n5. Сумма четных чисел в массиве " + Arrays.toString(array) + " = " + StreamUtils.sumEvenNumbers(array));

        int[] arrayWithoutEven = {1, 3, 5, 7, 9};
        System.out.println("   Сумма четных чисел в массиве " + Arrays.toString(arrayWithoutEven) + " = " + StreamUtils.sumEvenNumbers(arrayWithoutEven));

        /////////////////////////////////////////////////////////////////////////////

        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "avocado", "blueberry");
        System.out.println("\n6. Преобразование строк в Map " + stringList);
        Map<Character, String> resultMap = StreamUtils.stringsToMap(stringList);
        System.out.println("   Результат: " + resultMap);

        System.out.println("\n=== Конец демонстрации ===");
    }
}


