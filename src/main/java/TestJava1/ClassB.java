package TestJava1;

public class ClassB extends ClassA{

    public void m1(String str1)
    {
        System.out.println("String Version");
    }

    public static void main(String[] args) {
        ClassB obj1 = new ClassB();
        obj1.m1("xyz");     //  String Version.
        obj1.m1(null);      //  String Version.
        obj1.m1(Integer.valueOf(10)); // Error
    }

}
