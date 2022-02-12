package com.yxx.x5x5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {


  public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException {
         Class people1=Name.class;
         Class people2=Class.forName("com.yxx.x5x5.Name");
         Name name=new Name(18,"","");
         Class people3=name.getClass();
         System.out.println("获得的Class对象：");
         System.out.println(people1);
         System.out.println(people2);
         System.out.println(people3);
         System.out.println("================");
         System.out.println("获得的public字段有：");
        Field[] fields=people2.getFields();
        for (Field field:fields){
            System.out.println(field);
        }
        System.out.println("================");
        System.out.println("获得的所有字段有：");
        Field[] decfields=people2.getDeclaredFields();
        for (Field field:decfields){
            System.out.println(field);
        }
        System.out.println("================");
        System.out.println("获取构造方法");
        Constructor[] constructors=people2.getConstructors();
        for (Constructor constructor:constructors){
            System.out.println(constructor);
        }
        System.out.println("================");
        Object person=people2.newInstance(  );
         Method method=people2.getMethod("input", String.class, String.class);
        System.out.println("获得的方法"+method);
        System.out.println("================");
        System.out.println("调用该方法后");
        method.invoke(person,"yx","女");


    }
}
