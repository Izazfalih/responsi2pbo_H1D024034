package pert3;

// Simpan di file Manajer.java
class Manajer extends Karyawan {
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok + " | Tunjangan: Rp " + tunjangan);
        double total = gajiPokok + tunjangan;
        System.out.println("Total Pendapatan: Rp " + total);
    }
}