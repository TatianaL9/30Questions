import java.util.Scanner;

public class CointGame {
    public static void main(String[] args) {
        int sum = 100;

        System.out.println("how many pennies do you have: ");
        Scanner scaner = new Scanner(System.in);
        int pennies = scaner.nextInt();
        int sumPennies = pennies * 1;
        System.out.println("how many nickles do you have: ");
        int nickles = scaner.nextInt();
        int sumNickles = nickles * 5;
        System.out.println("how many quaters do you have: ");
        int quaters = scaner.nextInt();
        int sumQuaters = quaters * 25;
        System.out.println("how many dimmes do you have: ");
        int dimmes = scaner.nextInt();
        int sumDimmes = dimmes * 10;
        scaner.close();
        int YourSum = sumDimmes + sumNickles + sumPennies + sumQuaters;
        if (YourSum == sum) {
            System.out.println("you win");
        } else {
            System.out.println("You were so close " + YourSum + " <> " + sum);


        }
    }
}
