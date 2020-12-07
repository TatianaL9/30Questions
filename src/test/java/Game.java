import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();



        int winNumber = 20;
        int total = 0;


        for (int i=1; i<=5; i++) {

            int die = random.nextInt(6) + 1;
            System.out.println(die);

            total = total + die;

            if (total == 20){

                System.out.println("You win:" + total + " played: " + i);
                System.out.println("points left to win " + (20 -total));

                break;

            }
            //System.out.println("You rolled : " + i);


            //int more = winNumber-total;
               System.out.println("you rolled "+ i+ "You are on the " +total +" space. To win you should have: " + (20 - total) +"spaces" );

           // System.out.println("You win");

            }

        if (total > 20 || total < 20)
            System.out.println("you lost");



        System.out.println("Next time you will win");


        }


    }

