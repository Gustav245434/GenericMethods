import java.util.Arrays;

public class GenericMethodTest {

    public static void main(String[] args) {

        String[] obstSorten = {"Apfel", "Birne", "Banane"};
        System.out.println(Arrays.toString(obstSorten));
        GenericUtils.reverse(obstSorten);
        System.out.println(Arrays.toString(obstSorten));

        Integer[] nummern = {1, 3, 5, 1};
        System.out.println(GenericUtils.sum(nummern));

    }

}
