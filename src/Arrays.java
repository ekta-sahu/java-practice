public class Arrays{
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 34;
        arr[4] = 67;
        for (int i = 0; i <= arr.length-1; i++){
            System.out.println(arr[i]);
        }
        System.out.println("\n");

        int[] arr1 = {1,3,5,6,7,9};
        int max = Integer.MIN_VALUE;
        for (int i: arr1){
            if (i > max){
                max = i;
            }
        }
        System.out.printf("Max value in arr1 is : %d%n",max);

        int maxval = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] > maxval){
                maxval = arr1[i];
            }
        }
        System.out.printf("Max value in arr1 is : %d%n",maxval);
        System.out.println("\n");

        //print reverse array
        for (int i = arr1.length-1; i >=0; i--){
            System.out.println(arr1[i]);
        }
        System.out.println();

        //sum of elements
        int sum = 0;
        for (int i : arr1){
            sum += i;
        }
        System.out.printf("Sum of elements of arr1 : %d%n",sum);
        System.out.println();

        //2D arrays
        int[][] arr2 = new int[3][3];
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();

        // jagged array [n][] = {
        //                      {1,2,3}
        //                      {4,5}
        //                      {6,7,8}}
        int[][] arr3 = new int[3][];
            // initialise each row:
        arr3[0] = new int[2];
        arr3[1] = new int[1];
        arr3[2] = new int[2];
           // insert values:
        arr3[0][0] =1;
        arr3[0][1] =2;
        arr3[1][0] =3;
        arr3[2][0] =4;
        arr3[2][1] =5;
        for (int i = 0; i < arr3.length; i++){
            for (int j = 0;j < arr3[i].length; j++){
                System.out.print(arr3[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        // char array
        char[][] char_arr = new char[2][2];
        char_arr[0][0] = 'a';
        char_arr[0][1] = 'b';
        char_arr[1][0] = 'c';
        char_arr[1][1] = 'd';
        for (int i = 0; i < char_arr.length; i++){
            for (int j = 0; j < char_arr[i].length; j++){
                System.out.print(char_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
