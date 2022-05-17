import java.util.Arrays;

public class equalityOfTwoArrays {


    public static void main(String[] args) {

        // initializing three integer arrays
        int[] arr1 = new int[] { 1, 20, 3, 4 };
        int[] arr2 = new int[] { 1, 20, 3, 4 };
        int[] arr3 = new int[] { 0, 50, 6, 12 };

        // comparing arr1 and arr2 are equal to each other
        boolean Result01 = Arrays.equals(arr1, arr2);
        System.out.println("arr1 and arr2 equal: " + Result01);

        // comparing arr2 and arr3 are equal to each other
        boolean Result02 = Arrays.equals(arr2, arr3);
        System.out.println("arr2 and arr3 equal: " + Result02);

        // comparing arr2 and arr3 are equal to each other
        boolean Result03 = Arrays.equals(arr1,arr3);
        System.out.println("arr1 and arr3 equal: " + Result03);
    }

}
