/**
 * Created by liuzhouliang on 2018/10/12.
 * https://blog.csdn.net/TimHeath/article/details/71194938
 * 方法引用
 * <p>
 * 双冒号（::）操作符是 Java 中的方法引用。 当们使用一个方法的引用时，目标引用放在 :: 之前，目标引用提供的方法名称放在 :: 之后，即 目标引用::方法。比如：
 * <p>
 * Person::getAge;
 */
public class Lambda2 {

    public static void main(String[] args) {
        Test test = (agr) -> System.out.println("=========" + agr);
        test.test("dddddd");
        Test test1 = System.out::println;
        Test test2 = Lambda2::test;
    }

    interface Test {
        void test(String agr);
    }

    public static void test(String string) {

    }
}
