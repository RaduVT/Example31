import java.util.Scanner;

public class Example31 {
    public static void main(String[] args) {
        int n, line;

        Scanner inportValue;
        inportValue = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = inportValue.nextInt();

        for ( line = 1; line <= n; line++) {
            for (int i = 1; i <= n -line; i++){
                System.out.print("/ ");
            }
            for (int i = line;i >= 1; i--){
                System.out.print(i + " ");
            }
            for (int i = 2; i <= line; i++){
                System.out.print(i + " ");
            }
            for (int i = 1; i <= n -line; i++){
                System.out.print("/ ");
            }
                System.out.println();
            }
        }
    }
