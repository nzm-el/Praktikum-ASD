public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa17() {

    }
    public Mahasiswa17(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    void tampilInformasi() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("IPK     : " + ipk);
        System.out.println("Kelas   : " + kelas);
    }
}