import java.util.Scanner;

public class JavaStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers for your operation:");
        int a = scanner.nextInt();
        int[] number = new int[a];;
        for (int i = 0; i < a; i++) {
            System.out.println("Choose a number:");
            int b = scanner.nextInt();
            number[i] = b;
            System.out.println(number);
            scanner.close()
        }

    }
}