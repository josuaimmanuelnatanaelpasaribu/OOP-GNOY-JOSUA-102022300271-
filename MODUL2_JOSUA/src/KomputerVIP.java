class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(boolean vipCard,int jumlahKomputer, String NamaWarnet, float hargaPerJam){
        super(jumlahKomputer, NamaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi(){
        super.Informasi();
       if (vipCard) {
        System.out.println("Status: Member VIP");
        System.out.println("Benefit Member VIP:");
        System.out.println("- DIskon 10% untuk Bermain Di Atas 3 jam");
        System.out.println("- Gratis Minuman Setiap 4 Jam Bermain");
        System.out.println("- Prioritas booking komputer gaming");
       } 
    }
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

}