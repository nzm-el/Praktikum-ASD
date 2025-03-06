import java.util.Scanner;

public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen16[] daftarDosen = new Dosen16[3];

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("Pria"); 

            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            System.out.println("--------------------------------");

            daftarDosen[i] = new Dosen16(kode, nama, jenisKelamin, usia);
        }
        System.out.println("\n----- Data Semua Dosen -----");
        DataDosen16.dataSemuaDosen(daftarDosen);

        System.out.println("\n----- Jumlah Dosen Berdasarkan Jenis Kelamin -----");
        DataDosen16.jumlahDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n----- Rata-rata Usia Dosen Berdasarkan Jenis Kelamin -----");
        DataDosen16.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n-----  Dosen Paling Tua -----");
        DataDosen16.infoDosenPalingTua(daftarDosen);

        System.out.println("\n----- Dosen Paling Muda -----");
        DataDosen16.infoDosenPalingMuda(daftarDosen);
    }
}