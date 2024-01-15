public class Main {
    public static void main(String[] args) {
        Prodotto lel = new Prodotto(70.0);
        Servizio furly = new Servizio(15);
        Saldo saldo = new Saldo(80, "carta");
        System.out.println("prodotto: " + lel.CalcolaPrezzo(saldo));
        try {
            lel.effettuaPagamento(saldo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("saldo: " + saldo.getSaldo());
        System.out.println("servizio: " + furly.CalcolaPrezzo(saldo));
        try {
            furly.effettuaPagamento(saldo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}