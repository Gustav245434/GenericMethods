public class GenericUtils {

    public static <T> void reverse(T[] array) {
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            array[i] = array[array.length - 1];
            array[array.length - 1 - i] = element;
        }
    }

}
