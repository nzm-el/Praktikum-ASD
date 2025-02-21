public class DosenMain14 {
    public static void main(String[] args) {
        Dosen14 d1 = new Dosen14();
        d1.idDosen = "123";
        d1.nama = "Faiz";
        d1.statusAktif = true;
        d1.tahunBergabung = 2010;
        d1.bidangKeahlian = "Matematika";

        d1.tampilInformasi();
        System.out.println("Dosen " + d1.nama + " sudah mengajar selama " + d1.hitungMasaKerja(2012) + " tahun");
        d1.ubahKeahlian("Informatika");
        d1.setStatusAktif(false);
        System.out.println();
        System.out.println("==== Setelah dilakukan perubahan ====");
        d1.tampilInformasi();

        System.out.println("====================================");
        System.out.println();

        Dosen14 d2 = new Dosen14("456", "Azril", false, 2007, "Biologi");
        d2.tampilInformasi();
    }
}