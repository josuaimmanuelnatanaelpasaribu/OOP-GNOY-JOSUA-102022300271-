public class Kucing extends Hewan {
    private String ras;

    // Constructor Kucing
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    // Method suara (Overriding)
    @Override
    public void suara() {
        System.out.println(nama + " mengeong");
    }

    // Method infoHewan untuk menampilkan informasi kucing (Overriding)
    @Override
    public String infoHewan() {
        return super.infoHewan() + "\nRas: " + ras;
    }
}

