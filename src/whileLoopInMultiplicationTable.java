public class whileLoopInMultiplicationTable {

    public static void main(String[] args) {
        //instantiate multidimensional Array in java
       int [][] arr=new int[3][3];

        arr = new int[][]{{1, 2, 3, 4,},{2, 4, 6, 8,},{3, 6, 9,12,}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}









