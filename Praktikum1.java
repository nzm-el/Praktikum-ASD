import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukan Nilai Tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukan Nilai Kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukan Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukan Nilai UAS: ");
        double uas = sc.nextDouble();

        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas < 0 || tugas >= 100 || kuis < 0 || kuis >= 100 || uts < 0 || uts >= 100 || uas < 0 || uas >= 100) {
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

            String huruf;
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                huruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                huruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                huruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                huruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                huruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                huruf = "D";
            } else {
                huruf = "E";
            }

            String keterangan = (huruf.equals("D") || huruf.equals("E")) ? "Tidak Lulus" : "Lulus";

            System.out.printf("nilai akhir : %.1f\n", nilaiAkhir);
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("==============================");
            System.out.println("==============================");
            
            if (keterangan.equals("Lulus")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }
    }
}