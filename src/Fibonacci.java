import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int n=1;

        System.out.println(" Enter the number of series ");
        int counter=sc.nextInt();
        while (n<=counter) {
            System.out.println(a);

            int c=a+b;
            a=b;
            b=c;
            n++;
        }



    }
}