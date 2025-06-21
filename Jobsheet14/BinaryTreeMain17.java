public class BinaryTreeMain17 {
    public static void main(String[] args) {
        BinaryTree17 bst = new BinaryTree17();
        
        System.out.println("== Penambahan Data Mahasiswa ke Binary Tree ==");
        bst.addRekursif(new Mahasiswa17("24416021", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa17("24416022", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa17("24416185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa17("24416220", "Dewi", "B", 3.54));
        bst.addRekursif(new Mahasiswa17("24416131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa17("24416205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa17("24416170", "Fizi", "B", 3.46));

        System.out.println("\n== Daftar Mahasiswa (InOrder Traversal) ==");
        bst.traverseInOrder(bst.root);
        
        System.out.println("\n== Pencarian Data Mahasiswa ==");
        System.out.print("Cari mahasiswa dengan IPK 3.54: ");
        System.out.println(bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan");

        System.out.print("Cari mahasiswa dengan IPK 3.22: ");
        System.out.println(bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan");

        System.out.println("\n== Traversal Tree ==");
        System.out.println("InOrder:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreOrder:");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPostOrder:");
        bst.traversePostOrder(bst.root);
        
        System.out.println("\n== IPK Tertinggi dan Terendah ==");
        Mahasiswa17 max = bst.cariMaxIPK();
        Mahasiswa17 min = bst.cariMinIPK();
        if (max != null && min != null) {
            System.out.print("Mahasiswa dengan IPK Tertinggi: ");
            max.tampilInformasi();
            System.out.print("Mahasiswa dengan IPK Terendah: ");
            min.tampilInformasi();
        }

        System.out.println("\n== Penghapusan Data Mahasiswa ==");
        bst.delete(3.57);
        System.out.println("\nSetelah Menghapus Mahasiswa dengan IPK 3.57:");
        bst.traverseInOrder(bst.root);
    }
}