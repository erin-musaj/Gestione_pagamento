public class Servizio implements Pagabile{
    private double costo;

    public Servizio(double costo){
        this.costo = costo;
    }


    @Override
    public double CalcolaPrezzo(Saldo saldo) {
        double prezzo=this.costo;
        switch (saldo.getModalità().toLowerCase()){
            case "carta":
                prezzo+=0.5;
                break;
            case "contanti":
                prezzo-=(prezzo/100)*5;
                break;
            default:
                prezzo+=1.0;
        }
        return prezzo+(costo/100*5);
    }

    @Override
    public void effettuaPagamento(Saldo saldo) throws Exception {
        try {
            saldo.modSaldo(this.CalcolaPrezzo(saldo)*(-1));
        } catch (Exception e) {
            throw new Exception("Saldo insufficiente");
        }
    }
}
