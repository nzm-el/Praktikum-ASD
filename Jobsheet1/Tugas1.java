import java.util.Scanner;

public class Tugas1 {
public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] kota = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL"
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = sc.next().toUpperCase().charAt(0);

        boolean ketemu = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                System.out.println("Kota dari plat " + inputKode + " adalah " + kota[i]);
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Kode plat tidak ditemukan");
        }
    }
}