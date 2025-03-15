package TestJava2;

public class TestArray2 {

    public static void main(String[] args) {

        multiply(5,10);


    }

    public static void multiply(int a, int b){
        int increment=5;
        for(int i=0;i<b;i++){
            int p=i+1;
            System.out.println("5 multiply "+p+" ="+a);
            a=a+increment;
        }

    }


}
