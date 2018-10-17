import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by liuzhouliang on 2018/10/16.
 * 改进二，使用Lambda表达式，调用已存在的方法
 */
public class Main2 {
    public static void main(String[] args) {
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2016, 9, 1)),
                new Person("001", LocalDate.of(2016, 2, 1)),
                new Person("002", LocalDate.of(2016, 3, 1)),
                new Person("004", LocalDate.of(2016, 12, 1))};

        Arrays.sort(pArr, (a, b) -> Person.compareByAge(a, b));
        //因为这个Lambda表达式调用了一个已存在的方法，因此，我们可以直接使用方法引用来替代这个Lambda表达式，
        System.out.println(Arrays.asList(pArr));
    }
}
