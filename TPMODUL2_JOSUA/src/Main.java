public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan\n");

        // Membuat objek Kucing dan Burung
        Kucing kucing1 = new Kucing("Momo", 2, "Persia");
        Burung burung1 = new Burung("Rio", 1, "Hijau");

        // Menampilkan informasi Kucing
        System.out.println("Ini adalah " + kucing1.getNama() + "!");
        kucing1.suara();
        kucing1.makan("ikan");

        // Menampilkan informasi Burung
        System.out.println("\nIni adalah " + burung1.getNama() + "!");
        burung1.suara();
        burung1.makan();
        burung1.makan("biji-bijian");

        // Menampilkan informasi detail Kucing dan Burung
        System.out.println("\n" + kucing1.infoHewan());
        System.out.println(burung1.infoHewan());
    }
}
