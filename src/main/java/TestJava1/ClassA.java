package TestJava1;

import java.lang.Math;

public class ClassA {
    static int number=9;
    public void m1(Object o)
    {
        System.out.println("Object Version");
    }

    public void print_name(String name){
        System.out.println("Entered Name is : "+name);
    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        String str1=null;
        obj.print_name(str1);
        obj.print_name("123");




    }

}
