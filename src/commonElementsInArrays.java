public class commonElementsInArrays {


    public static void main(String[] args) {

        // generating random number to be compared, to find the common one's
        int arr1[] = {2,7,8,5,40,5};
        int arr2[] = {2,9,40,7,10};

        //using for loop

        for(int i=0;i<arr1.length;i++)
        {

            for(int j=0;j<arr2.length;j++) {

                if(arr1[i] == arr2[j]) {
                    // user should see common number printed
                    System.out.println("Number which common in arr1 and arr2  = "+arr1[i] +" ");

                }
            }
        }





    }

}
