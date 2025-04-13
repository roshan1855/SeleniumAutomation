public class TestA1 {

    public static void main(String[] args) {
        int[] arr={2,32,21,45,26};
        int max=arr[0];

        for(int num : arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Maximum number in array is : "+max);

    }
}
