public class Exception extends Throwable {
    public Exception(String throwing_a_message) {
    }

    public static void main(String[] args) {
        try {
            testThrow();
        } catch (Exception e) {
            e.getMessage();
            System.out.println(e.getMessage());
        }
    }
    private static void testThrow() throws Exception {
        throw new Exception ("throwing a message");
    }
}
