import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by liuzhouliang on 2018/10/19.
 */
public class Test4 {

    public static void main(String[] args) {
        List list = new ArrayList(10);
//        countNumSeq("2s3k4kk4k6");
//        test();
//
//        test2();
//        test1();
        test4();
    }

    private static void countNumSeq(String text) {
        IntStream stream = IntStream.range(0, text.length())
                .mapToObj(i -> text.charAt(i))//拿到每个字符
                .filter(c -> Character.isDigit(c))//过滤掉不是数字的字符
                .mapToInt(c -> Character.digit(c, 10));//将所有字符转为数字
        System.out.println(String.format("它们的和是[%d]", stream.sum()));
    }

    public static void test() {
        List<String> l = new ArrayList(Arrays.asList("one", "two"));
        Stream<String> sl = l.stream();
        l.add("three");
        sl.forEach(System.out::println);
    }

    public static void test1() {
        List<String> l = new ArrayList(Arrays.asList("one", "two"));
        Stream<String> sl = l.stream();
        sl.forEach(s -> l.add("three"));
    }

    public static void test2() {
        List<String> l = new CopyOnWriteArrayList<>(Arrays.asList("one", "two"));
        Stream<String> sl = l.stream();
        sl.forEach(s -> l.add("three"));
    }

    public static void test3() {
        Stream stream = Stream.of("a", "b", "c");
    }

    public static void test4() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream().
                map(n -> n * n).
                collect(Collectors.toList());
        System.out.println(squareNums.toString());
    }

}
