package TPMODUL2_JOSUA;

public class Hewan {
    protected String nama;
    protected int umur;

    // Constructor Hewan
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    // Method suara (default)
    public void suara() {
        System.out.println("Hewan bersuara");
    }

    // Method makan tanpa parameter
    public void makan() {
        System.out.println(nama + " sedang makan");
    }

    // Method makan dengan parameter (Overloading)
    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan);
    }

    // Method infoHewan untuk menampilkan informasi umum
    public String infoHewan() {
        return "Nama: " + nama + ", Umur: " + umur + " tahun";
    }
}
