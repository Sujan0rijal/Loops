import java.util.Scanner;

public class ReverseUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        int one = num;
        int reverse = 0;
        while(one>0)
        {
            int rem = one%10;
            reverse = reverse * 10 + rem;
            one = one/10;
        }
        System.out.println("reverse number is "+ reverse);
        if (num==reverse){
            System.out.println("Number is palindrom");
        }
        else{
            System.out.println("number is not palindrom");
        }
    }
}
