public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    public Mahasiswa17() {
    }
    
    public Mahasiswa17(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    
    public void tampilInformasi() {
        System.out.println("NIM: " +this.nim+ " "+
                        "Nama: " +this.nama+ " "+
                        "Kelas: " +this.kelas+ " "+
                        "IPK: " +this.ipk);
    }
}