import java.util.Scanner;

public class JavaStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers for your operation: ");
        int a = scanner.nextInt();
        int[] number = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Choose a number: ");
            number[i] = scanner.nextInt();
        }
        System.out.print("Choose any operator (+, -, /, *): ");
        String b = scanner.next();
        if (b.equals("*")) {
            int c = 1;
            for (int i = 0; i < a; i++) {
                c *= number[i];
            }
            System.out.print(c);
        } else if (b.equals("+")) {
            int c = 0;
            for (int i = 0; i < a; i++) {
                c += number[i];
            }
            System.out.print(c);
        } else if (b.equals("-")) {
            int c = 0;
            for (int i = 0; i < a; i++) {
                c -= number[i];
            }
            System.out.print(c);
        } else if (b.equals("/")) {
            int c = 1;
            for (int i = 0; i < a; i++) {
                c /= number[i];
            }
            System.out.print(c);
        } else {
            System.out.print("Error!");
        }
    }
}