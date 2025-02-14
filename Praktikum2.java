import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long nim = 0;
        System.out.print("Masukan Nim : ");
        nim = input.nextLong();

        long n = nim % 100;

        if (n < 10) {
            n += 10;
        }

        System.out.println("==========================");
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}