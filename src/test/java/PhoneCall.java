import java.util.Scanner;

public class PhoneCall {
    static Scanner scaner = new Scanner(System.in);

    double fee;
    double tax ;
    double total;

    public static void main(String[] args) {
        System.out.println("plan Fee:  ");
        double planFee = scaner.nextDouble();
        System.out.println("number Overage Minutes ");
        int numberOverageMinutes = scaner.nextInt();
        System.out.println("used Minutes: ");
        int usedMinutes = scaner.nextInt();

        double fee= calculateFee(10, 20, 300);
        double tax = calculateTax(fee);
        double total = countFinalTotal(fee, tax);
        System.out.println(total);


    }
    static double calculateFee (double planFea, int numberOverageMinutes, int usedMinutes) {
        if (usedMinutes>numberOverageMinutes) {
            double fee = (planFea + (usedMinutes - numberOverageMinutes) * 0.25);
            return fee;
        } else {
            return planFea; }

    }
    static double calculateTax (double subTotal) {
        double tax = subTotal*0.15;
        return tax;
    }
    static double countFinalTotal (double fee, double tax) {
        return tax+fee;
    }
}

