public class MahasiswaDemo17 {
    public static void main(String[] args) {
        MahasiswaBerprestasi17 data = new MahasiswaBerprestasi17();
        data.tambah();

        System.out.println("Data mahasiswa sebelum sorting: ");
        data.tampil();
        data.bubblesort();
        System.out.println("\nData mahasiswa setelah sorting(DESC): ");
        data.tampil();

        System.out.println("Data yang sudah diurutkan menggunakan SELECTION SORT (ASC)");
        data.selectionSort();
        data.tampil();

        System.out.println("Data yang sudah diurutkan menggunakan INSERTION SORT (DESC)");
        data.insertionSort();
        data.tampil();
    }
}