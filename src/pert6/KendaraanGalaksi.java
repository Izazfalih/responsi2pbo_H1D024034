package pert6;

public abstract class KendaraanGalaksi {

    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    protected void ubahEnergi(int nilai) {
        this.levelEnergi = nilai;
        if (this.levelEnergi > 100) this.levelEnergi = 100;
        if (this.levelEnergi < 0) this.levelEnergi = 0;
    }

    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " awak");
    }
    abstract void aktifkanMesin();
    abstract void jelajah(int jarak);
    abstract void isiEnergi(int jumlah);
}