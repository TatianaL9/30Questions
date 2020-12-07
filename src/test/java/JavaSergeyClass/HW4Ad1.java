package JavaSergeyClass;
//Create a program print only even numbers from 1 to 20 must be used while loops
public class HW4Ad1 {
    public static void main(String[] args) {
        for (int i=0; i<20;i++ )
        while ( i % 2 == 0 ) {
            System.out.println(i);
            i= i+1;
        }
    }
}
