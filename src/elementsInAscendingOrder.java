import java.util.Arrays;

public class elementsInAscendingOrder{

        public static void main(String[] args)
        {

            //printing number randomly to be sorted out in Ascending order
            int [] array = new int [] {100,40,20,30,60,50,70,10,90,80}; //

            //method of the Arrays class
            Arrays.sort(array);
            System.out.println("Elements sorted in ascending order: ");

            //array using the for loop
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i]+" - ");
            }
        }
    }


