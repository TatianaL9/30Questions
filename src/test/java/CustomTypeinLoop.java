import java.util.ArrayList;
import java.util.List;

public class CustomTypeinLoop {
    public static void main(String[] args) {
        String[] firstNames = {"one", "two", "three"};
        String[] lastNames = {"a", "b", "c"};
        List<User> users = new ArrayList<User>();
        for (int i=0; i< firstNames.length; i++) {
            User u = new User();
            u.setFirstName(firstNames[i]);
            u.setLatsName(lastNames[i]);
            users.add(u);
        }
for (User u  : users) {
    System.out.println(u.output());
}
     }

    //Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.
    //
    //When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.
    //
    //Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
    //
    //S is misinterpreted as 5
    //O is misinterpreted as 0
    //I is misinterpreted as 1
    //The test cases contain numbers only by mistake.
    public static class Correct {
        public static String correct(String string) {

                    return string.replace('5', 'S').replace('0', 'O').replace('1', 'I');

        }
    }

    public static class SolutionTest {

        public static void main(String[] args) {

            System.out.println(Correct.correct(Correct.correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5")));
            System.out.println(Correct.correct(Correct.correct("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA")));
            System.out.println(Correct.correct(Correct.correct("UR5ULA K. LE GU1N - THE T0MB5 0F ATUAN")));
            System.out.println(Correct.correct(Correct.correct("UR5ULA K. LE GU1N - THE FARTHE5T 5H0RE")));
            System.out.println(Correct.correct(Correct.correct("UR5ULA K. LE GU1N - TALE5 FR0M EARTH5EA")));
        }
    }
}
