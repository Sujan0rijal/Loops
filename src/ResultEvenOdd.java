import java.util.Scanner;

public class ResultEvenOdd {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        int odd= 0;
//        int even = 0;
//        for (int i = 1;i<21;i = i+1){
//            if (i%2==0){
//                even++;
//            }
//            else{
//                odd++;
//            }
//        }
//        System.out.println("No of even " + even+ "No of odd number "+ odd);
        int SumOfOddNumber = 0;
        int start = 0;
        int end = 20;
        for (int i = start;i<=end;i++){
            if (i%2 !=0){
                SumOfOddNumber += i;
            }
        }
        int lastEven = 0;
        if(end%2 == 0){
            lastEven = end;
        }
        else if((end-1)%2 ==0){
            lastEven = end -1;
        }
        System.out.println(SumOfOddNumber + lastEven);

    }
}
