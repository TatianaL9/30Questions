public class triangle2 {
    public static void main(String[] args) {

            int n=6;
            int l, i, k, number=1, j;


            for(i=0;i<n;i++)
            {
                for(k=n; k>i; k--)
                {
                    System.out.print(" ");
                }
                number = 1;
                for(j=0;j<=i;j++)
                {
                    System.out.print(number+ " ");
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
                
            }
        }
    }




