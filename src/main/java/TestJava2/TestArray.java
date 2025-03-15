package TestJava2;

import org.testng.reporters.jq.Main;

public class TestArray {

    public static void main(String[] args) {

        int a[]= {10, 30,34,45,87};

        int sum=0;


        for(int i:a){
            sum+=i;
        }
        System.out.println("sum of elements of array a is "+sum);
    }
}
