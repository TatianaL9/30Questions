package JavaSergeyClass;

import java.util.Arrays;

public class HW6_5 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            int[] subarray = array[i];

            for (int j = 0; j < subarray.length; j++) {
                sum = sum + subarray[j];
            }
        }
        System.out.println(sum);
    }
}

