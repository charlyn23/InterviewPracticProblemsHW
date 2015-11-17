import java.util.ArrayList;
import java.util.List;

/**
 * Created by charlynbuchanan on 11/13/15.
 */
public class ExceptIndex {

    static int[] numbers = {2, 3, 4, 5};
    static List<Integer> products = new ArrayList<Integer>();


    public static List<Integer> productOfAllIntsExceptAtIndex(int[] array) {
        int temp;
        int loop;

        for(int i = 0; i < array.length; i++) {
            int product = 1;



            for (int j = 0; j < array.length; j++) {
                loop = i;
                temp = array[loop];
                array[loop] = 1;
                product *= array[j];
                array[loop] = temp;

            }
            products.add(product);

        }


        System.out.println(products);
        return products;

    }



    public static void main (String[] args) {

        productOfAllIntsExceptAtIndex(numbers);
    }
}
