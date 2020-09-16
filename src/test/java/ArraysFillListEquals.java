import java.util.Arrays;

public class ArraysFillListEquals {
    public static void main(String[] args) {
        //
    /*    int[] grades1 = {4, 98, 56, 25, 9};
        int[] grades2 = {4, 198, 56, 25, 9};
        if (Arrays.equals(grades1, grades2)) {
            System.out.println("Equal");
        }
        else System.out.println("NotEqual");*/
        int[] grades = new int[5];
        Arrays.fill(grades, 8);
        System.out.println(Arrays.toString(grades));
    }

}
