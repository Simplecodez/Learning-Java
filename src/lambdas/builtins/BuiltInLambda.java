package lambdas.builtins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInLambda {
    public static void showConsumer(){
        Consumer<String> print = System.out::println;
        Consumer<String> printUpperCase = message -> System.out.println(message.toUpperCase());
        List<String> list = new ArrayList<>(Arrays.asList("a","b"));
        list.forEach(print.andThen(printUpperCase));
    }
    public static void showSupplier(){
        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());
    }
}
