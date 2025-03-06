public class Dosen16{
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen16(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilkanData(int i) {
        System.out.println("Data Dosen ke-" + (i + 1));
        System.out.println("Kode          : " + this.kode);
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + (this.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + this.usia);
        System.out.println("--------------------------------");
    }
}