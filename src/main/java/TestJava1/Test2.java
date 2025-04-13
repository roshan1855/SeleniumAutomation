package TestJava1;

public class Test2 extends Test1 {

    public void m1(String abc)
    {

        System.out.println("Child Static Method 2");
        //super.m1();
    }
    public void m1()
    {

        System.out.println("Child Static Method");
        //super.m1();
    }
    public static void main(String args[]){
        Test2 test2=new Test2();
        test2.m1();
        test2.m1("abc");
        test2.m1(10);
    }

}
