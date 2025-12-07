package pert5;

class MesinTraktorListrik extends MesinTraktor {
    private double kapasitasBaterai;

    public MesinTraktorListrik(String namaMesin, int tenagaHP, double kapasitasTarik, double kapasitasBaterai) {
        super(namaMesin, tenagaHP, kapasitasTarik);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Traktor Listrik " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | Baterai: " + kapasitasBaterai + " kWh | Tenaga: " + tenagaHP + " HP");
        System.out.println("Kategori: " + kategoriMesin());
        System.out.println("Performa: " + nilaiPerforma());
        System.out.println();
    }

    @Override
    public double nilaiPerforma() {
        return (tenagaHP * 1.1) + (kapasitasBaterai * 5);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    // Method Unik Override
    @Override
    public void suaraMesin() {
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}