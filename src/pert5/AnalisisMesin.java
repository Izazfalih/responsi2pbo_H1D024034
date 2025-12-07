package pert5;

public class AnalisisMesin {
    public static void main(String[] args) {

        DefaultMesin[] inventaris = new DefaultMesin[5];
        inventaris[0] = new MesinMotor("Honda Supra X", 125, "Bebek");
        inventaris[3] = new MesinMotor("Yamaha R25", 250, "Sport");
        inventaris[1] = new MesinTraktor("Kubota MX5200", 520, 5);
        inventaris[2] = new MesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        inventaris[4] = new MesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        for (int i = 0; i < inventaris.length; i++) {
            inventaris[i].tampilInfo();
        }

        System.out.println("=== SUARA MESIN ===");

        for (DefaultMesin m : inventaris) {
            if (m instanceof MesinTraktorListrik) {
                ((MesinTraktorListrik) m).suaraMesin();
            }
            else if (m instanceof MesinTraktor) {
                ((MesinTraktor) m).suaraMesin();
            }
            else if (m instanceof MesinMotor) {
                ((MesinMotor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        DefaultMesin juara = inventaris[0];

        for (int i = 1; i < inventaris.length; i++) {
            if (inventaris[i].nilaiPerforma() > juara.nilaiPerforma()) {
                juara = inventaris[i];
            }
        }
        System.out.println(juara.namaMesin + " -> " + juara.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        for (int i = 0; i < inventaris.length - 1; i++) {
            for (int j = 0; j < inventaris.length - i - 1; j++) {
                if (inventaris[j].nilaiPerforma() < inventaris[j + 1].nilaiPerforma()) {
                    DefaultMesin temp = inventaris[j];
                    inventaris[j] = inventaris[j + 1];
                    inventaris[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + inventaris[i].namaMesin + " -> " + inventaris[i].nilaiPerforma());
        }
    }
}