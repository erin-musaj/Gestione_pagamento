public class Saldo {

    private double saldo;
    private String modalità;

    public Saldo(double saldo, String modalità){
        this.saldo=saldo;
        this.modalità=modalità;
    }

    public void modSaldo(double modifica) throws Exception {
        if((this.saldo+modifica)<0){
            throw new Exception("in debito");
        } else {
            this.saldo+=modifica;
        }
    }

    public double getSaldo(){
        return saldo;
    }
    public String getModalità(){
        return this.modalità;
    }
}
