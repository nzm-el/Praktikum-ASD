public class MahasiswaDemo17 {
    public static void main(String[] args) {
        MahasiswaBerprestasi17 data = new MahasiswaBerprestasi17();
        data.tambah();

        System.out.println("Data mahasiswa sebelum sorting: ");
        data.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        data.bubblesort();
        data.tampil();
    }
}