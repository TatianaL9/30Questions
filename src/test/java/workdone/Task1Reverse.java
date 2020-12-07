package workdone;

import java.util.Arrays;

public class Task1Reverse {
    public static int[] invert(int[] array) {
        int [] result = new int [array.length];
        for (int i=0;i<array.length; i++) {
            result[i] = -array[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {-1,-2,-3,-4,-5};
       int[] result = invert(arr);
        String strResult = Arrays.toString(result);
        System.out.println(strResult);

        System.out.println(Arrays.toString(invert(new int[] {-1,2,-3,4,-5})));
        System.out.println(Arrays.toString(new int[] {0}));
    }
}

