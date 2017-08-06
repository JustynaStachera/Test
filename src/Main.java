import java.util.Arrays;

/**
 * Created by Józefina on 2017-05-27.
 */
public class Main {
    public static void main(String[] args) {
        int[] arrays = {2,5,6,7,8,3,7};

        System.out.println(Arrays.toString(arrays));
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.binarySearch(arrays,7));

        /***/

        StringBuilder string = new StringBuilder();
        System.out.println(string.capacity());

        /***/

        String s = "ALA12";
        if(s.matches("(.*[0-9A-Z]){5}")) {
            System.out.println("OK!");
        }
    }
}
