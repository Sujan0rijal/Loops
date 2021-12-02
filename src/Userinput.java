import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start;
        System.out.println("Enter the start value ");
        start = sc.nextInt();
        int end;
        System.out.println("Enter the end value ");
        end = sc.nextInt();
        int sumofevennumber = 0;
        for (int i = start; i <= end; i++){
            if (i%2 != 0){
                sumofevennumber += i;

            }
        }
        int lasteven = 0;
        if (end%2 == 0){
            lasteven = end;
        }
        else if ((end-1)%2 == 0){
            lasteven = end-1;
        }
        System.out.println(sumofevennumber + lasteven);
    }
}
