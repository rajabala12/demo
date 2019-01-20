public class InfiniteLoopTest {
    public static void main(String[] args) {
        int a = 1;
        String whilevar = "Testing Infinite Loop with WHILE";
        String forvar = "Testing Infinite Loop with FOR";

        while (true)
        {
            System.out.println(whilevar);
        }

/*
        for (; ;)
        {
            System.out.println(forvar);
        }
*/

    }
}
