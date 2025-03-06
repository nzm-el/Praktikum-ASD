import java.util.Scanner;

public class MataKuliahDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan Jumlah Data Kuliah: ");
        int data = sc.nextInt();
        sc.nextLine();

        MataKuliah16[] arrayOfMataKuliah = new MataKuliah16[data];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah16("", "", 0, 0);
            arrayOfMataKuliah[i].tambahData(sc);
        }
        for(int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}