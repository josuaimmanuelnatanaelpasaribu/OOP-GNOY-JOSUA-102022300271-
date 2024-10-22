// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.ArrayList;
import java.util.Scanner;

class ManajemenInventaris {
    // This class will manage the inventory
    private ArrayList<String> daftarBarang = new ArrayList<>();

    public void tampilkanMenu() {
        System.out.println("\n=== Manajemen Inventaris ===");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Hapus Barang");
        System.out.println("3. Tampilkan Barang");
        System.out.println("4. Keluar");
    }

    // Tambah barang ke dalam daftar
    public void tambahBarang() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama barang yang ingin ditambahkan: ");
            String barang = scanner.nextLine();
            daftarBarang.add(barang);
            System.out.println("Barang '" + barang + "' berhasil ditambahkan.");
        }
    }

    // Hapus barang dari daftar
    public void hapusBarang() {
       try (Scanner scanner = new Scanner(System.in)) {
        if (daftarBarang.isEmpty()) {
            System.out.println("Tidak ada barang yang bisa dihapus.");
            return;
        }
        System.out.println("Pilih barang yang ingin dihapus:");
        for (int i = 0; i < daftarBarang.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBarang.get(i));
        }
        System.out.print("Masukkan nomor barang: ");
        int index = scanner.nextInt();
        if (index > 0 && index <= daftarBarang.size()) {
            String barang = daftarBarang.remove(index - 1);
            System.out.println("Barang '" + barang + "' berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }
}

    // Tampilkan semua barang
    public void tampilkanBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Tidak ada barang di inventaris.");
        } else {
            System.out.println("Daftar Barang di Inventaris:");
            for (int i = 0; i < daftarBarang.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBarang.get(i));
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris inventaris = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);

        // Todo : Create Loop list menu
        boolean running = true;
        while (running) {
            inventaris.tampilkanMenu();
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    inventaris.tambahBarang();
                    break;
                case 2:
                    inventaris.hapusBarang();
                    break;
                case 3:
                    inventaris.tampilkanBarang();
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }

        scanner.close();
    }
}
