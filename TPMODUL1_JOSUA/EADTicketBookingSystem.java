package TPMODUL1_JOSUA;

public class EADTicketBookingSystem {

    // Class Penerbangan
    public static class Penerbangan {
        private String nomorPenerbangan;
        private String bandaraKeberangkatan;
        private String bandaraTujuan;
        private String waktuKeberangkatan;
        private String waktuKedatangan;
        private float hargaTiket;

        // Constructor
        public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, 
                           String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
            this.nomorPenerbangan = nomorPenerbangan;
            this.bandaraKeberangkatan = bandaraKeberangkatan;
            this.bandaraTujuan = bandaraTujuan;
            this.waktuKeberangkatan = waktuKeberangkatan;
            this.waktuKedatangan = waktuKedatangan;
            this.hargaTiket = hargaTiket;
        }

        // Getter methods
        public String getNomorPenerbangan() {
            return nomorPenerbangan;
        }

        public String getBandaraKeberangkatan() {
            return bandaraKeberangkatan;
        }

        public String getBandaraTujuan() {
            return bandaraTujuan;
        }

        public String getWaktuKeberangkatan() {
            return waktuKeberangkatan;
        }

        public String getWaktuKedatangan() {
            return waktuKedatangan;
        }

        public float getHargaTiket() {
            return hargaTiket;
        }

        // Method untuk menampilkan daftar penerbangan
        public void tampilDaftarPenerbangan() {
            System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
            System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan);
            System.out.println("Bandara Tujuan: " + bandaraTujuan);
            System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan);
            System.out.println("Waktu Kedatangan: " + waktuKedatangan);
            System.out.println("Harga Tiket: " + hargaTiket);
            System.out.println("-----------------------------");
        }
    }

    // Class Penumpang
    public static class Penumpang {
        private String NIK;
        private String namaDepan;
        private String namaBelakang;

        // Constructor
        public Penumpang(String NIK, String namaDepan, String namaBelakang) {
            this.NIK = NIK;
            this.namaDepan = namaDepan;
            this.namaBelakang = namaBelakang;
        }

        // Method untuk menampilkan daftar penumpang
        public void tampilDaftarPenumpang() {
            System.out.println("NIK: " + NIK);
            System.out.println("Nama Depan: " + namaDepan);
            System.out.println("Nama Belakang: " + namaBelakang);
        }
    }

    // Main class
    public static void main(String[] args) {
        // Membuat array untuk menyimpan daftar penerbangan
        Penerbangan[] daftarPenerbangan = new Penerbangan[3];
        Penumpang[] daftarPesanan = new Penumpang[10];
        Penerbangan[] pesananPenerbangan = new Penerbangan[10];
        int jumlahPesanan = 0;

        // Menambahkan beberapa penerbangan ke dalam daftar
        daftarPenerbangan[0] = new Penerbangan("ID001", "Jakarta", "Bali", "08:00", "10:00", 1500000);
        daftarPenerbangan[1] = new Penerbangan("ID002", "Jakarta", "Surabaya", "09:00", "11:00", 1000000);
        daftarPenerbangan[2] = new Penerbangan("ID003", "Jakarta", "Medan", "07:00", "09:00", 1300000);

        boolean running = true;

        // Menggunakan Console untuk input
        java.io.Console console = System.console();
        
        // Menu utama
        while (running) {
            System.out.println("\n======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            String menuInput = console.readLine("Silahkan Pilih Menu: ");
            int menu = Integer.parseInt(menuInput);

            switch (menu) {
                case 1: // Tampilkan Daftar Penerbangan
                    System.out.println("\nDaftar Penerbangan:");
                    for (int i = 0; i < daftarPenerbangan.length; i++) {
                        System.out.println((i + 1) + ". " + daftarPenerbangan[i].getNomorPenerbangan() + " - " +
                                           daftarPenerbangan[i].getBandaraKeberangkatan() + " ke " +
                                           daftarPenerbangan[i].getBandaraTujuan());
                    }
                    break;

                case 2: // Beli Tiket
                    System.out.println("\nDaftar Penerbangan:");
                    for (int i = 0; i < daftarPenerbangan.length; i++) {
                        System.out.println((i + 1) + ". " + daftarPenerbangan[i].getNomorPenerbangan() + " - " +
                                           daftarPenerbangan[i].getBandaraKeberangkatan() + " ke " +
                                           daftarPenerbangan[i].getBandaraTujuan());
                    }

                    // Memilih penerbangan
                    String pilihanInput = console.readLine("Pilih penerbangan (masukkan nomor): ");
                    int pilihan = Integer.parseInt(pilihanInput);
                    Penerbangan penerbanganDipilih = daftarPenerbangan[pilihan - 1];

                    // Memasukkan data penumpang
                    String NIK = console.readLine("Masukkan NIK Penumpang: ");
                    String namaDepan = console.readLine("Masukkan Nama Depan Penumpang: ");
                    String namaBelakang = console.readLine("Masukkan Nama Belakang Penumpang: ");

                    Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

                    // Menyimpan pesanan
                    daftarPesanan[jumlahPesanan] = penumpang;
                    pesananPenerbangan[jumlahPesanan] = penerbanganDipilih;
                    jumlahPesanan++;

                    System.out.println("Tiket berhasil dipesan.");
                    break;

                case 3: // Tampilkan Pesanan Tiket
                    if (jumlahPesanan == 0) {
                        System.out.println("Tidak ada pesanan tiket.");
                    } else {
                        System.out.println("\nPesanan Tiket:");
                        for (int i = 0; i < jumlahPesanan; i++) {
                            System.out.println("\nPenumpang " + (i + 1) + ":");
                            daftarPesanan[i].tampilDaftarPenumpang();
                            System.out.println("Penerbangan:");
                            pesananPenerbangan[i].tampilDaftarPenerbangan();
                        }
                    }
                    break;

                case 4: // Exit
                    running = false;
                    System.out.println("Terima kasih telah menggunakan sistem kami.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
