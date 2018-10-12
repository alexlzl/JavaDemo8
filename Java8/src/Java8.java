/**
 * Created by liuzhouliang on 2018/10/12.
 * <p>
 * Java 8用默认方法与静态方法这两个新概念来扩展接口的声明。
 * 默认方法可以包含实现代码，默认方法与抽象方法不同之处在于抽象方法必须要求实现，但是默认方法则没有这个要求。
 * 相反，每个接口都必须提供一个所谓的默认实现，这样所有的接口实现者将会默认继承它（如果有必要的话，可以覆盖这个默认实现）。
 * Java 8带来的另一个有趣的特性是接口可以声明（并且可以提供实现）静态方法。
 * <p>
 * <p>
 * 语言设计者投入了大量精力来思考如何使现有的函数友好地支持lambda。
 * 最终采取的方法是：增加函数式接口的概念。函数式接口就是一个具有一个抽象方法的普通接口。
 * 像这样的接口，可以被隐式转换为lambda表达式。
 * java.lang.Runnable与java.util.concurrent.Callable是函数式接口最典型的两个例子。
 * 在实际使用过程中，函数式接口是容易出错的：如有某个人在接口定义中增加了另一个方法，这时，这个接口就不再是函数式的了，
 * 并且编译过程也会失败。为了克服函数式接口的这种脆弱性并且能够明确声明接口作为函数式接口的意图，
 * Java 8增加了一种特殊的注解@FunctionalInterface（Java 8中所有类库的已有接口都添加了该注解） 。
 * 函数式接口的定义(只有一个抽象方法)：
 */
@FunctionalInterface
public interface Java8 {
    void method();//只能有一个抽象方法


    default void defaultMethod() {
        //statement
        System.out.println("fffff");
    }

    static void staticMethod() {
        //statement
        System.out.println("==========");
    }
}


