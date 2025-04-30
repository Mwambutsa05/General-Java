package Generics;
import java.util.Arrays;

public class GenericArrayUtility {

    public static void main(String[] args) {
        // Test with Integer arrays
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {4, 5, 6};
        Integer[] mergedInt = mergeArrays(array1, array2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedInt));

        String[] words1 = {"Hello", "World"};
        String[] words2 = {"Java", "Generics"};
        String[] mergedStr = mergeArrays(words1, words2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedStr));
    }
    public static <T> T[] mergeArrays(T[] a, T[] b) {

        T[] result = Arrays.copyOf(a, a.length + b.length);

        // Copy elements of b into the new array
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }

}
