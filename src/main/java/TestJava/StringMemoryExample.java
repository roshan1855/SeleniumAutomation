package TestJava;

public class StringMemoryExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";

        System.out.println("str1: " + str1 + " | HashCode: " + System.identityHashCode(str1));
        System.out.println("str2: " + str2 + " | HashCode: " + System.identityHashCode(str2));
        System.out.println("str3: " + str2 + " | HashCode: " + System.identityHashCode(str3));
    }

}
