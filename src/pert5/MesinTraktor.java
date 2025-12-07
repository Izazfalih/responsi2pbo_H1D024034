package pert5;

class MesinTraktor extends DefaultMesin {
    protected double kapasitasTarik;

    public MesinTraktor(String namaMesin, int tenagaHP, double kapasitasTarik) {
        super(namaMesin, tenagaHP);
        this.kapasitasTarik = kapasitasTarik;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Traktor " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | Tenaga: " + tenagaHP + " HP");
        System.out.println("Kategori: " + kategoriMesin());
        System.out.println("Performa: " + nilaiPerforma());
        System.out.println();
    }

    @Override
    public double nilaiPerforma() {
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor";
    }

    public void suaraMesin() {
        System.out.println("GGGRRRR! Hidup mesinnn!");
    }
}