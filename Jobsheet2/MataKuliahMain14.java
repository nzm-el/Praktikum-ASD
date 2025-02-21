public class MataKuliahMain14 {
    public static void main(String[] args) {
        MataKuliah14 mk1 = new MataKuliah14();
        mk1.kodeMK = "123";
        mk1.nama = "Rusdi";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(3);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();

        MataKuliah14 mk2 = new MataKuliah14("345", "", 3, 3);
        mk2.tampilInformasi();
    }
}

