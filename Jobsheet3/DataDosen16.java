public class DataDosen16 {
    public static void dataSemuaDosen(Dosen16[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i].tampilkanData(i);
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("--------------------------------");
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int hitPria = 0, hitWanita = 0;

        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                hitPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                hitWanita++;
            }
        }

        double rataPria = (hitPria > 0) ? (double) totalUsiaPria / hitPria : 0;
        double rataWanita = (hitWanita > 0) ? (double) totalUsiaWanita / hitWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
        System.out.println("--------------------------------");
    }
    public static void infoDosenPalingTua(Dosen16[] arrayOfDosen) {
        Dosen16 tertua = arrayOfDosen[0];
        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.tampilkanData(0);
    }
    public static void infoDosenPalingMuda(Dosen16[] arrayOfDosen) {
        Dosen16 termuda = arrayOfDosen[0];
        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.tampilkanData(0);
    }
}