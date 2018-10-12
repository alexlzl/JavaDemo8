/**
 * Created by liuzhouliang on 2018/10/12.
 */
public class Lambda2 {

    public static void  main(String[] args){
        Test test=()->System.out.println("=========");
        test.test();
    }

    interface Test{
        void test();
    }
}
