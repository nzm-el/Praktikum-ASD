import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            String[] matkul = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thingking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Keria"
            };

        int jumlahMK = matkul.length;
        double totalBobot = 0;
        double totalSKS = jumlahMK;

        double[] nilaiAngka = new double [jumlahMK];
        String[] huruf = new String [jumlahMK];
        double[] bobotNilai = new double [jumlahMK];
        
        
        System.out.println("=============================");
        System.out.println("Program Menghitung IP Semeter");
        System.out.println("=============================");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukan nilai Angka untuk " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] >= 80) {
                huruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] >= 73) {
                huruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] >= 65) {
                huruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] >= 60) {
                huruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] >= 50){
                huruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] >= 39) {
                huruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                huruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
            totalBobot += bobotNilai[i];
        }

        double IPS = totalBobot / totalSKS;

        System.out.println("=============================");
        System.out.println("Hasil konversi Nilai");
        System.out.println("=============================");
        System.out.printf("%-40s %-10s %-10s %-10s%n","MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f%n", matkul[i], nilaiAngka[i], huruf[i], bobotNilai[i]);
        }
        System.out.println("=============================");
        System.out.printf("IP : %.2f%n", IPS);
    }
}