package pert1;

class Pengguna {
    int umur;
    double berat;
    double tinggi;
    final double faktorAktivitas = 1.2;

    double hitungBMI() {
        double tinggiMeter = tinggi / 100.0;
        return berat / (tinggiMeter * tinggiMeter);
    }

    void tampilKategori() {
        double bmi = hitungBMI();
        System.out.print("Kategori: ");
        if (bmi < 18.5) {
            System.out.println("Kurus");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else {
            System.out.println("Obesitas");
        }
    }

    double hitungKalori() {
        return berat * faktorAktivitas * 10;
    }

    void tampilInfo() {
        System.out.println("\n=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.printf("BMI: %.2f\n", hitungBMI());
        tampilKategori();
        System.out.printf("Kebutuhan Kalori: %.0f kal/hari\n", hitungKalori());
        System.out.println("====================================");
    }
}