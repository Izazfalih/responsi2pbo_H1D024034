package pert1;

class UjiPengguna {
    public static void main(String[] args) {
        Pengguna user = new Pengguna();
        user.umur = 25;
        user.berat = 60;
        user.tinggi = 170;
        user.tampilInfo();
        // Tampilkan demonstrasi tentang konstanta final
        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + user.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");
        System.out.println("\nJika kita mencoba menulis: user.faktorAktivitas = 1.5;");
        System.out.println("Maka compiler akan menolak dengan error:\n" +
                "/Users/izazfalih/IdeaProjects/Responsi 2 Praktikum PBO/src/pert1/UjiPengguna.Java:9:13\n" +
                "java: cannot assign a value to final variable faktorAktivitas");
    }
}