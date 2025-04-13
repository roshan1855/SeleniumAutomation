package TestJava1;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner snc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= snc.nextInt();

        System.out.println("You hava entered : "+num );
    }

}
