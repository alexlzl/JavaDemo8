import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by liuzhouliang on 2018/10/16.
 *
 * 使用Lambda表达式，未调用已存在的方法
 *
 * 然而，在以上代码中，关于两个人生日的比较方法在Person类中已经定义了，因此，我们可以直接使用已存在的Person.compareByAge方法。
 */
public class Main1 {
    public static void main(String[] args)
    {
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2016,9,1)),
                new Person("001", LocalDate.of(2016,2,1)),
                new Person("002", LocalDate.of(2016,3,1)),
                new Person("004", LocalDate.of(2016,12,1))};

        Arrays.sort(pArr, (Person a, Person b) -> {
            return a.getBirthday().compareTo(b.getBirthday());
        });

        System.out.println(Arrays.asList(pArr));
    }
}
