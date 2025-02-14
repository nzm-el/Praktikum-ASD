public class Praktikum4 {
    public static void main(String[] args) {
        int[][] stockBunga = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        int[] harga = { 75000, 50000, 60000, 10000 };
        String[] bunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        int[] bungaMati = { -1, -2, 0, -5 };

        pendapatan(stockBunga, harga);
        totalStock(stockBunga, bunga);
        kurangiStock(stockBunga, bungaMati);
    }

    public static void pendapatan(int[][] stockBunga, int[] harga) {
        System.out.println("Pendapatan Tiap Cabang Jika Semua Bunga Terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
        System.out.println("=========================");
        System.out.println();
    }

    public static void totalStock(int[][] stockBunga, String[] bunga) {
        System.out.println("Total Stok Setiap Jenis Bunga:");
        int[] totalStock = new int[bunga.length];
        for (int j = 0; j < bunga.length; j++) {
            for (int i = 0; i < stockBunga.length; i++) {
                totalStock[j] += stockBunga[i][j];
            }
            System.out.println(bunga[j] + ": " + totalStock[j]);
        }
        System.out.println("=========================");
        System.out.println();
    }

    public static void kurangiStock(int[][] stockBunga, int[] bungaMati) {
        System.out.println("Stok Setelah Dikurangi Karena Bunga Mati:");
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + ": ");
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] += bungaMati[j];
                System.out.print(stockBunga[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========================");
    }
}
