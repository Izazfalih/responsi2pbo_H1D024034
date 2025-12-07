package pert6;

public class KapalEksplorasi extends KendaraanGalaksi {
    private int modulScan;

    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    void jelajah(int jarak) {
        int kebutuhanEnergi = jarak * 2;
        if (getLevelEnergi() >= kebutuhanEnergi) {
            ubahEnergi(getLevelEnergi() - kebutuhanEnergi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi kritis! Tidak bisa menjelajah.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        ubahEnergi(getLevelEnergi() + jumlah);
        System.out.println("Energi kapal eksplorasi telah diisi.");
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}