package lambdas;

public class LambdaDemo {
    public static void show() {
        greet(LambdaDemo::new);
    }

    public LambdaDemo (String item){
        System.out.println(item);
    }

    private static void greet(Printer<String> printer){
        printer.print("Here to say hello...");
    }
}
