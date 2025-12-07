package pert5;

class DefaultMesin {
    // Variabel umum mesin (namaMesin, tenagaHP)
    protected String namaMesin;
    protected int tenagaHP;

    // Constructor
    public DefaultMesin(String namaMesin, int tenagaHP) {
        this.namaMesin = namaMesin;
        this.tenagaHP = tenagaHP;
    }

    public void tampilInfo() {
        System.out.println("Mesin " + namaMesin + " | Tenaga: " + tenagaHP + " HP");
    }

    public double nilaiPerforma() {
        // Hitung performa dasar
        return tenagaHP * 1.0;
    }

    String kategoriMesin() {
        return "Mesin Umum";
    }
}
