import java.util.Scanner;

public class AddAllNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter the number: ");
        num = sc.nextInt();
        int reverse = 0;
        while(num>0){
            int rem = num%10;
            reverse = reverse +rem;
            num = num/10;
        }
        System.out.println("Adding number is " + reverse);
    }
}
