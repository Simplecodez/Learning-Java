package generics;

public class Utils {

    public static <T extends Comparable<T>> T max(T user1, T user2){
        int result = user1.compareTo(user2);
        System.out.println("result "+result);
        return result>=0?user1:user2;
    }
}
