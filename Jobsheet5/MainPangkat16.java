import java.util.Scanner;

public class MainPangkat16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        Pangkat16[] png = new Pangkat16[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis element ke-" + (i + 1) + " : ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat element ke-" + (i + 1) + " : ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat16(basis, pangkat);
        }

        System.out.println("Hasil Pangkat BruteForce: ");
        for (Pangkat16 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("Hasil Pangkat Divide and Conquer: ");
        for (Pangkat16 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}