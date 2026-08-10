package model;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String modelo, double precoCompra, double precoVenda, int quantDisponivel, int cilindradas){
        super(modelo, precoCompra, precoVenda, quantDisponivel);
        this.cilindradas = cilindradas;
    }

    public void calcularPrecoVenda(double taxa){
        this.setPrecoVenda(this.getPrecoCompra() * taxa);
    }
    @Override
    public void calcularPrecoVenda(){
        System.out.println("Informe a Taxa de Ajuste!!");
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
