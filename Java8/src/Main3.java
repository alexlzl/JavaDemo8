import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * https://www.jianshu.com/p/511df052fc1c
 * Created by liuzhouliang on 2018/10/16.
 * 因为这个Lambda表达式调用了一个已存在的方法，因此，我们可以直接使用方法引用来替代这个Lambda表达式，
 * <p>
 * 改进三，使用方法引用
 * <p>
 * 在以上代码中，方法引用Person::compareByAge在语义上与Lambda表达式 (a, b) -> Person.compareByAge(a, b) 是等同的，都有如下特性：
 * <p>
 * 真实的参数是拷贝自Comparator<Person>.compare方法，即(Person, Person)；
 * 表达式体调用Person.compareByAge方法；
 */
public class Main3 {
    public static void main(String[] args) {
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2016, 9, 1)),
                new Person("001", LocalDate.of(2016, 2, 1)),
                new Person("002", LocalDate.of(2016, 3, 1)),
                new Person("004", LocalDate.of(2016, 12, 1))};

        Arrays.sort(pArr, Person::compareByAge);

        System.out.println(Arrays.asList(pArr));
    }
}
