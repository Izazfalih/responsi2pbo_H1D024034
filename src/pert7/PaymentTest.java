package pert7;

public class PaymentTest {

    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        EWalletPayment eWallet = new EWalletPayment("OVO", 150000, 50000);
        System.out.println("Saldo awal: " + (int)eWallet.getBalance());
        eWallet.processPayment();
        System.out.println("Sisa saldo: " + (int)eWallet.getBalance());
        System.out.println("Detail Transaksi: " + eWallet.getPaymentDetails());
    }
}