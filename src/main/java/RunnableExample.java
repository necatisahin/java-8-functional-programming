public class RunnableExample {

    public static void main(String[] args) {

        // Before
        Runnable runnableWithoutFunctionalProgramming = new Runnable() {
            public void run() {
                System.out.println("Without functional java programming.");
            }
        };
        new Thread(runnableWithoutFunctionalProgramming).start();

        // After
        Runnable runnableFunctionalProgramming = () -> System.out.println("Functional java programming.");
        runnableFunctionalProgramming.run();

        Runnable runnableFunctionalProgrammingWithMultiLambdaLines = () -> {
            System.out.println("Functional java programming with multi lambda lines. -1");
            System.out.println("Functional java programming with multi lambda lines. -2");
        };
        runnableFunctionalProgrammingWithMultiLambdaLines.run();

        Runnable runnableFunctionalProgrammingWithThread = () -> System.out.println("Functional java programming with thread.");
        new Thread(runnableFunctionalProgrammingWithThread).start();

        new Thread(() -> {
            System.out.println("thread-1");
            System.out.println("thread-1.1");
        }).start();
    }

}
