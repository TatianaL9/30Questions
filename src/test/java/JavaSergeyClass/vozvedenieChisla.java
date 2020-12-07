package JavaSergeyClass;

public class vozvedenieChisla {
    public static void main(String[] args) {
       double a=5.0;
       double num =0.0;
       double b = 1.0;


       while (1==1) {

           num = Math.pow(a,b);
           if (num >=10000) {
               break;
           }
            System.out.println(b + " " + num);
           //System.out.println(num);
           b= b+1;

        }

    }
}
