package JavaSergeyClass;


public class HW6_2 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max= array[0];
        for (int i=1; i< array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                System.out.println(max);
            }

        }
    }
}
