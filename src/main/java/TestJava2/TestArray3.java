package TestJava2;

import java.util.*;

public class TestArray3 {

    public static void main(String[] args) {
        int a[]={10,30,34,45,87,32,35};
        int b[]={10,36,34,40,87,32,35};

        ArrayList <Integer> list =new ArrayList<>();

        for (int i=0;i<a.length;i++){
            if (a[i]==b[i]) {
                list.add(a[i]);
            }
        }
        System.out.println(list);

        int c[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            c[i]=list.get(i);
        }

        System.out.println("Array c is "+Arrays.toString(c));
    }
}
