import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList17 sll = new SingleLinkedList17();

        System.out.println("Masukkan jumlah data:");
        int n = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble(); sc.nextLine();

            Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        sll.print();
    }
}
