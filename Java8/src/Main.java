import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by liuzhouliang on 2018/10/16.
 * <p>
 * 假设我们有一个Person数组，并且想对它进行排序，这时候，我们可能会这样写：
 */
public class Main {
    static class PersonAgeComparator implements Comparator<Person> {
        public int compare(Person a, Person b) {
            return a.getBirthday().compareTo(b.getBirthday());
        }
    }

    public static void main(String[] args) {
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2016, 9, 1)),
                new Person("001", LocalDate.of(2016, 2, 1)),
                new Person("002", LocalDate.of(2016, 3, 1)),
                new Person("004", LocalDate.of(2016, 12, 1))};

        Arrays.sort(pArr, new PersonAgeComparator());

        System.out.println(Arrays.asList(pArr));
    }
}
