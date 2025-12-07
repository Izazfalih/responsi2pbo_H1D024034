package pert2;
class UjiBarang {
    public static void main(String[] args) {
        BarangMusik gitar = new BarangMusik("GTR-01", "Gitar Akustik Yamaha");
        gitar.ubahHarga(1500000);
        gitar.tambahStok(10);
        BarangMusik drum = new BarangMusik("DRM-01", "Drum Set Pearl", 8500000, 3);
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();

    }
}