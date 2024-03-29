import java.util.Arrays;

/**
 * Klasse die GenericUtils Klasse testen
 * @author Gustav Glatzel
 * @version 2024-02-28
 */
public class GenericMethodTest {
    /**
     * Main Methode zum Testen
     * @param args Kein Nutzen
     */
    public static void main(String[] args) {

        String[] obstSorten = {"Apfel", "Birne", "Banane"};
        System.out.println(Arrays.toString(obstSorten));
        GenericUtils.reverse(obstSorten);
        System.out.println(Arrays.toString(obstSorten));

        Integer[] nummern = {1, 3, 5, 1};
        System.out.println(GenericUtils.sum(nummern));

    }

}
