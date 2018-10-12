import java.util.Arrays;
import java.util.List;

/**
 * Created by liuzhouliang on 2018/10/12.
 * lambda 表达式必须满足以下条件才算是合法的Java代码：
 * <p>
 * • lambda 表达式必须出现在期望使用接口类型实例的地方；
 * <p>
 * • 期望使用的接口类型(即满足函数式接口)必须只有一个抽象方法（有且只有一个非默认方法，“单一抽象方法”（Single Abstract Method，SAM））；
 * <p>
 * • 这个强制方法的签名要完全匹配lambda 表达式。
 * <p>
 * lambda 表达式并不只是匿名类的语法糖。其实，lambda 表达式使用方法句柄和一个特殊的新JVM 字节码invokedynamic 实现。
 * <p>
 * 语法糖就是说只是帮助我们程序员轻松的少写一些代码，之后编译器帮我们把那部分代码生成出来。
 */
public class Lambda1 {
    public static void main(String[] args) {
//        test(new Call() {
//            @Override
//            public void onFail() {
//                System.out.println("onfail");
//            }
//
//            @Override
//            public void onSuccess() {
//
//            }
//        });
        test((s) -> {
            System.out.println("88");
            System.out.println("ss");
        });

        List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

//遍历一
        friends.forEach(name -> System.out.println(name));

//遍历二
        friends.forEach(System.out::println);


    }

    public static void test(Call call) {
        call.onFail("fi");
    }

    public static void test1() {
        System.out.println("out method===");
    }

    public interface Call {
        void onFail(String s);
//        void onSuccess();
    }
}
