import java.util.Scanner;

public class Tugas3 {
    static String[] matkul;
    static int[] sks;
    static int[] semester;
    static String[] hariKuliah;
    static int jumlahMatkul;

    public static void tambahData(Scanner sc) {
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMatkul = sc.nextInt();
        sc.nextLine();

        matkul = new String[jumlahMatkul];
        sks = new int[jumlahMatkul];
        semester = new int[jumlahMatkul];
        hariKuliah = new String[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            matkul[i] = sc.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }
    }

    public static void tampilkanSemuaJadwal() {
        System.out.println("\n=== Jadwal Kuliah ===");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalHari(Scanner sc) {
        System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
        String hariCari = sc.nextLine();
        System.out.println("\n=== Jadwal Kuliah Hari " + hariCari + " ===");

        boolean ditemukan = false;
        for (int i = 0; i < jumlahMatkul; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada hari " + hariCari);
        }
    }

    public static void tampilkanJadwalSemester(Scanner sc) {
        System.out.print("Masukkan semester yang ingin ditampilkan: ");
        int semesterCari = sc.nextInt();
        sc.nextLine();
        System.out.println("\n=== Jadwal Kuliah Semester " + semesterCari + " ===");

        boolean ditemukan = false;
        for (int i = 0; i < jumlahMatkul; i++) {
            if (semester[i] == semesterCari) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada semester " + semesterCari);
        }
    }

    public static void cariMataKuliah(Scanner sc) {
        System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
        String namaCari = sc.nextLine();
        System.out.println("\n=== Hasil Pencarian Mata Kuliah ===");

        boolean ditemukan = false;
        for (int i = 0; i < jumlahMatkul; i++) {
            if (matkul[i].equalsIgnoreCase(namaCari)) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah '" + namaCari + "' tidak ditemukan.");
        }
    }

    public static void tampilkanMenu(Scanner sc) {
        while (true) {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tambah Data Mata Kuliah");
            System.out.println("2. Tampilkan Semua Jadwal");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("4. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("5. Cari Mata Kuliah");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData(sc);
                    break;
                case 2:
                    tampilkanSemuaJadwal();
                    break;
                case 3:
                    tampilkanJadwalHari(sc);
                    break;
                case 4:
                    tampilkanJadwalSemester(sc);
                    break;
                case 5:
                    cariMataKuliah(sc);
                    break;
                case 6:
                    System.out.println("Program selesai");
                    return;
                default:
                    System.out.println("Pilihan tidak valid! Silahkan coba lagi.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tampilkanMenu(sc);
        sc.close();
    }
}