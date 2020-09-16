import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[10];
        System.out.println("put the number: ");


        for (int i =0; i < grades.length; i++) {
            int x = input.nextInt();
            grades[i] =x;

        }
        System.out.println(Arrays.toString(grades));
    }
}
