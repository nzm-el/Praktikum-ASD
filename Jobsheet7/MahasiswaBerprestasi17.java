import java.util.Scanner;
public class MahasiswaBerprestasi17 {
    Mahasiswa17 [] listMhs;
    int idx;
    Scanner input = new Scanner(System.in);
    
    public MahasiswaBerprestasi17(int kapasitas) {
        listMhs = new Mahasiswa17[kapasitas];
        idx = 0;   
    }
    void tambah(Mahasiswa17 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
        if(idx == 0) {
            System.out.println("Tidak ada data mahasiswa");
            return;
        }
        for(int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("---------------------------");
        }
    }
    int sequentialSearching(double cari) {
        int posisi = -1;
        for(int j = 0; j < listMhs.length; j++) {
            if(listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x, int pos) {
        if(pos !=-1) {
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos );
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos) {
        if(pos !=-1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}