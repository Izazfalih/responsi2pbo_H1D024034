package pert6;

public class UjiGalaksi {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===\n");
        PesawatTempur astra = new PesawatTempur("Astra-Fury", 2, 8);
        KapalEksplorasi voyager = new KapalEksplorasi("Voyager X", 10, 4);

        System.out.println("--- PESAWAT TEMPUR ---");
        astra.aktifkanMesin();
        astra.jelajah(10);
        astra.jelajah(30);
        astra.tembakRudal(3);
        astra.tampilStatus();

        System.out.println();

        System.out.println("--- KAPAL EKSPLORASI ---");
        voyager.aktifkanMesin();
        voyager.jelajah(15);
        voyager.scanPlanet("Kepler-442b");
        voyager.tampilStatus();

    }
}