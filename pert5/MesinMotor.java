package pert5;

class MesinMotor extends DefaultMesin {
    private String tipeMotor;

    public MesinMotor(String namaMesin, int tenagaHP, String tipeMotor) {
        super(namaMesin, tenagaHP);
        this.tipeMotor = tipeMotor;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Motor " + namaMesin + " | Tipe: " + tipeMotor + " | Tenaga: " + tenagaHP + " HP");
        System.out.println("Kategori: " + kategoriMesin());
        System.out.println("Performa: " + nilaiPerforma());
        System.out.println(); // Jarak antar output
    }

    @Override
    public double nilaiPerforma() {
        return tenagaHP * 1.2;
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Motor";
    }

    // Method Unik
    public void suaraMesin() {
        System.out.println("Brummm! Mesin motor menyala!");
    }
}