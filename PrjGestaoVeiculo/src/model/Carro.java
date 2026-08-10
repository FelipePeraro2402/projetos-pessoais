package model;

public class Carro extends Veiculo{
    private String fabricante;

    public Carro(String modelo, double precoCompra, double precoVenda, int quantDisponivel, String fabricante) {
        super(modelo, precoCompra, precoVenda, quantDisponivel);
        this.fabricante = fabricante;
    }

    @Override
    public void calcularPrecoVenda() {
        this.setPrecoVenda(this.getPrecoCompra() + 1.20);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void calcularPrecoVenda(double v) {
    }
}
