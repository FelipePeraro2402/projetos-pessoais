package model;

import exception.QuantidadeInsuficienteException;

public abstract class Veiculo {
     private String modelo;
     private double precoCompra;
     private double precoVenda;
     private int quantDisponivel;

     abstract void calcularPrecoVenda();

     public Veiculo(String modelo, double precoCompra, double precoVenda, int quantDisponivel){
         this.modelo = modelo;
         this.precoCompra = precoCompra;
         this.precoVenda = precoVenda;
         this.quantDisponivel = quantDisponivel;
     }

     public void vender (int qtd) throws QuantidadeInsuficienteException{
          if(qtd > quantDisponivel){
              throw new QuantidadeInsuficienteException();
          }
          this.quantDisponivel -= qtd;
     }

     public void comprar (int qtd){
         this.quantDisponivel += qtd;
     }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }
}
