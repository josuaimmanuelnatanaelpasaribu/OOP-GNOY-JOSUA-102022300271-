public class Burung extends Hewan {
    private String warnaBulu;

    // Constructor Burung
    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    // Method suara (Overriding)
    @Override
    public void suara() {
        System.out.println(nama + " berkicau");
    }

    // Method infoHewan untuk menampilkan informasi burung (Overriding)
    @Override
    public String infoHewan() {
        return super.infoHewan() + "\nWarna bulu: " + warnaBulu;
    }
}


