public class StackSurat17 {
    private static final int MAX = 100; 
    private Surat17[] suratArray;
    private int top;
    
    public StackSurat17() {
        suratArray = new Surat17[MAX];
        top = -1; 
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == MAX - 1;
    }
    public void push(Surat17 surat) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak dapat menambahkan surat izin baru.");
            return;
        }
        suratArray[++top] = surat;
        System.out.println("Surat izin berhasil ditambahkan.");
    }
    public Surat17 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat izin untuk diproses.");
            return null;
        }
        Surat17 poppedSurat = suratArray[top];
        suratArray[top--] = null; 
        return poppedSurat;
    }
    public Surat17 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat izin untuk dilihat.");
            return null;
        }
        return suratArray[top];
    }
    public boolean search(String namaMahasiswa) {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat izin untuk dicari.");
            return false;
        }
        for (int i = top; i >= 0; i--) {
            if (suratArray[i].NamaMahasiswa().equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat izin ditemukan untuk mahasiswa: " + namaMahasiswa);
                suratArray[i].lihatInfo();
                return true;
            }
        }
        System.out.println("Surat izin untuk mahasiswa '" + namaMahasiswa + "' tidak ditemukan.");
        return false;
    }
    public int size() {
        return top + 1;
    }
}