import java.util.ArrayList;

public class Arry {

    public static void main(String[] args) {

        int[] a={1,5,7,9,19,16};
        int[] b={1,0,7,10,17,16};
        ArrayList<Integer>alist =new ArrayList<Integer>();
        int i;

        com();
        containsmethod();
        matchesMethod();

        for(i=0;i<a.length;i++){
            if (a[i]==b[i])
            {
                alist.add(a[i]);
            };
        }
        System.out.println(alist.size());


    }

       //compareTo is used to compare lexicographically
        public static void com() {
            String str1 = "Apple";
            String str2 = "Appmz";

            System.out.println("compare "+str1.compareTo(str2)); // 0
        }


        public static void containsmethod() {
            String str = "Hello, welcome to Java!";

            System.out.println("Return of contains method "+str.contains("Java")); // true
        }


        public static void matchesMethod() {
            String str = "Hello123";

            System.out.println("Return 1st Match  "+str.matches("[A-Za-z]+")); // false (contains digits)
            System.out.println("Return 2nd Match  "+str.matches("Hell[A-Za-z][0-9]+")); // true
        }




}
