package com.test;

/**
 * Created by liuzhouliang on 2018/8/7.
 * 与常规抽象类一样，enum类允许我们为其定义抽象方法，然后使每个枚举实例都实现该方法，以便产生不同的行为方式，注意abstract关键字对于枚举类来说并不是必须的如下：
 */
public enum EnumDemo3 {
    FIRST {
        @Override
        public String getInfo() {
            return "FIRST TIME";
        }
    },
    SECOND {
        @Override
        public String getInfo() {
            return "SECOND TIME";
        }
    };

    /**
     * 定义抽象方法
     *
     * @return
     */
    public abstract String getInfo();

    //测试
    public static void main(String[] args) {
        System.out.println("F:" + EnumDemo3.FIRST.getInfo());
        System.out.println("S:" + EnumDemo3.SECOND.getInfo());
        /**
         输出结果:
         F:FIRST TIME
         S:SECOND TIME
         */
    }
}
