package JavaDelevomentKitLesson3.ArrayComparator;

public class ArrayComparator {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};
        System.out.println(compareArrays(array1, array2)); // true

        String[] array3 = {"apple", "banana", "orange"};
        String[] array4 = {"apple", "grape", "orange"};
        System.out.println(compareArrays(array3, array4)); // false
    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        // сравнение длины массивов
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            // сравнение элементов в массивах
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

}
