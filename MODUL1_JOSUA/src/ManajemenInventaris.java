// Don't delete any comments below!!!
// Todo : Import ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner;

class MakananKering {
    private String nama;
    private int jumlah;
    private double harga;
    private String brand;

    public MakananKering(String nama, int jumlah, double harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Jumlah: " + jumlah + ", Harga: " + harga + ", Brand: " + brand;
    }
}

class MakananBasah {
    private String nama;
    private int jumlah;
    private double harga;
    private String bahan;

    public MakananBasah(String nama, int jumlah, double harga, String bahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Jumlah: " + jumlah + ", Harga: " + harga + ", Bahan: " + bahan;
    }
}

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    private ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    private ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    @SuppressWarnings("resource")
    public void tambahMakananKering() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan nama Makanan Kering: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Consume leftover newline
        System.out.print("Masukkan brand: ");
        String brand = scanner.nextLine();

        // Todo : Create a new object for MakananKering
        MakananKering makananKering = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(makananKering);

        // Todo : Create Print Notification "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil ditambahkan!");
    }

    @SuppressWarnings("resource")
    public void tambahMakananBasah() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("Masukkan nama Makanan Basah: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Consume leftover newline
        System.out.print("Masukkan bahan: ");
        String bahan = scanner.nextLine();

        // Todo : Create a new object for MakananBasah
        MakananBasah makananBasah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(makananBasah);

        // Todo : Create Print Notification "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan basah berhasil ditambahkan!");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan di sini"
            System.out.println("Tidak ada makanan di sini.");
        } else {
            // Todo : Create print notification for Makanan Kering  
            if (!daftarMakananKering.isEmpty()) {
                System.out.println("Daftar Makanan Kering:");
                for (MakananKering mk : daftarMakananKering) {
                    System.out.println(mk);
                }
            } else {
                System.out.println("Tidak ada Makanan Kering.");
            }

            // Todo : Create print notification for Makanan Basah
            if (!daftarMakananBasah.isEmpty()) {
                System.out.println("Daftar Makanan Basah:");
                for (MakananBasah mb : daftarMakananBasah) {
                    System.out.println(mb);
                }
            } else {
                System.out.println("Tidak ada Makanan Basah.");
            }
        }
    }
}


