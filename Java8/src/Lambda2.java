/**
 * Created by liuzhouliang on 2018/10/12.
 * https://blog.csdn.net/TimHeath/article/details/71194938
 * 方法引用
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
