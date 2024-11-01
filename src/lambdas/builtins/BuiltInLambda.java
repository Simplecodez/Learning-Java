package lambdas.builtins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

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

    public static void showFunction(){
        Function<String, String> map1 = str -> str.replace(":", "=");
        Function<String, String> map2 = str -> "{"+str+"}";
        map2.compose(map1).apply("key:value"); // Same as andThen(), just reversed.
        System.out.println(map1.andThen(map2).apply("key:value"));;
    }

    public static void showPredicate(){
        Predicate<String> isLongerThanFive = string -> string.length() > 3;
        Predicate<String> isLessThanSix = string -> string.length() < 6;
        System.out.println(isLongerThanFive.and(isLessThanSix).test("thr"));
    }

    public static void showBinaryOperator(){
        BinaryOperator<Integer> add = Integer::sum;
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(add.andThen(square).apply(2, 3));
    }


}
