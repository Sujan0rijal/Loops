import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        char ch;
        do {
            int num ;
            int fact = 1;
            System.out.println("Enter the number ");
            num = sc.nextInt();
            for (int i=1;i<=num;i++){
                fact = fact*i;
            }
            System.out.println("Factorials of "+ num + " is "+ fact);
            System.out.println("DO You Want to continue (Y/N) :");
            ch = sc.next().toLowerCase().charAt(0);
        }while (ch == 'y');

    }
}
