class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahKomputer;
    protected String NamaWarnet;
    protected float hargaPerJam;
    // To do: Buatlah 3 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahKomputer, String NamaWarnet, float hargaPerJam){
        this.jumlahKomputer = jumlahKomputer;
        this.NamaWarnet =  NamaWarnet;
        this.hargaPerJam = hargaPerJam;

    }
    
    
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void Informasi(){
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer:" + jumlahKomputer);
        System.out.println("Nama warnet:" + NamaWarnet);
        System.out.println("HargaPerJam:" + hargaPerJam);
    }

}