package com.test;

import javassist.*;
import javassist.CtClass;

import java.io.IOException;

/**
 * Created by liuzhouliang on 2018/7/20.
 */
public class Test {
    public static void  main(String[] args){
        try {
            System.out.println("===");
            ClassPool pool = ClassPool.getDefault();
            CtClass ct
                    = pool.makeClass("com.test.bean.Emp");
            //创建属性
            CtField e1
                    = CtField.make("public int no;",ct);
            CtField e2
                    = CtField.make("public String name;",ct);
            ct.addField(e1);
            ct.addField(e2);
            CtMethod m1 = CtMethod.make("public int getNo(){return no;}", ct);
            CtMethod m2 = CtMethod.make("public void setNo(int no){return this.no = no;}", ct);
            ct.addMethod(m1);
            ct.addMethod(m2);
            //添加构造器
            CtConstructor  constructor
                    = new CtConstructor(
                    new CtClass[]{CtClass.intType,pool.get("java.lang.String")},ct);//构造器的参数
            constructor.setBody("{this.no = no; this.name=name;}");//构造器的方法体
            ct.addConstructor(constructor);//如果不添加构造器 则会生成一个空的构造器
            ct.writeFile("E:\\JavaFile");//将构造好的类写出来
            System.out.println("类生成功");
        } catch (CannotCompileException e) {
            e.printStackTrace();
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
