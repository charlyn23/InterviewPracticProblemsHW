import java.util.ArrayList;
import java.util.List;

/**
 * Created by charlynbuchanan on 11/13/15.
 */
public class ExceptIndex {

    static int[] numbers = {1, 7, 3, 4};
    static List<Integer> products = new ArrayList<Integer>();


    public static List<Integer> productOfAllIntsExceptAtIndex(int[] array) {
        int product = 1;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i] = 1;

                product = product * array[j];
//                System.out.println(product);
            }
        }
        products.add(product);


        System.out.println(products);
        return  products;
    }



    public static void main (String[] args) {
        productOfAllIntsExceptAtIndex(numbers);
    }
}
