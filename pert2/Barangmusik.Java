package pert2;

class BarangMusik {
    private String kodeBarang;
    private String alatMusik;
    private double harga;
    private int stok;

    // Constructor
    public BarangMusik(String kodeBarang, String alatMusik ){
        this.kodeBarang = kodeBarang;
        this.alatMusik = alatMusik;
    }

    public BarangMusik(String kodeBarang, String alatMusik, double harga ){
        this.kodeBarang = kodeBarang;
        this.alatMusik = alatMusik;
        this.harga = harga;
    }

    public BarangMusik(String kodeBarang, String alatMusik, double harga, int stok ){
        this.kodeBarang = kodeBarang;
        this.alatMusik = alatMusik;
        this.harga = harga;
        this.stok = stok;
    }

    void ubahHarga(double harga) {
        this.harga = harga;
    }
    
    void tambahStok(int tambahStok) {
        this.stok += tambahStok;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + alatMusik + " | Kode: " + kodeBarang + " | Harga: Rp " + harga + " | Stok: " + stok + " unit");
    }
}