public interface Pagabile {

    double CalcolaPrezzo(Saldo saldo);
    void effettuaPagamento(Saldo saldo) throws Exception;

}
