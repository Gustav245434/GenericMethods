/**
 * GenericUtils Klasse zum GenericArray flippen und Summe aus Generic Number Array berechnen
 * @author Gustav Glatzel
 * @version 2024-02-28
 */
public class GenericUtils {
    /**
     * Methode die einen Array reversed
     * @param array Der Array der geflipped werden soll
     * @param <T> Der Generic Datentyp
     */
    public static <T> void reverse(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            T element = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = element;
        }
    }

    /**
     * Methode zum Berechnen von einer Summe eines Number Array
     * @param array Der Array aus dem die Summe berechnet werden soll
     * @return Die Summe des Arrays
     * @param <T> Der Generic Datentyp der von Number erben muss
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum;
    }

}
