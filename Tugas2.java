import java.util.Scanner;

public class Tugas2 {
    public static double volume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double luasPermukaan(double sisi) {
        return 6 * (sisi * sisi);
    }

    public static double keliling(double sisi) {
        return 12 * sisi;
    }

    public static void menu() {
        System.out.println("\n---> Perhitungan Kubus <---");
        System.out.println("1. Hitung Volume");
        System.out.println("2. Hitung Luas Permukaan");
        System.out.println("3. Hitung Keliling");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu();

        int pilihan = sc.nextInt();

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();

        switch (pilihan) {
            case 1:
                System.out.println("Volume Kubus: " + volume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + luasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + keliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}