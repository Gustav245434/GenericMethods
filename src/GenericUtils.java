public class GenericUtils {

    public static <T> void reverse(T[] array) {
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            array[i] = array[array.length - 1];
            array[array.length - 1 - i] = element;
        }
    }

    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum;
    }

}
