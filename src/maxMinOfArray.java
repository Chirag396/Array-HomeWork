public class maxMinOfArray {

    // finding the minimum and maximum number in an array
    public static void maxMinOfArray(int[] nums)
    {
        // initialize minimum and maximum element with the first element
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            // if the current element is greater than the maximum found so far
            if (nums[i] > max) {
                max = nums[i];
            }

            // if the current element is smaller than the minimum found so far
            else if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
    }

    public static void main(String[] args)
    {
        int[] nums = { -5,-4,-3,-2,-1,0,1,2,3,4,5};

        // find the minimum and maximum element,
        maxMinOfArray(nums);
    }





}


