package Main;

import model.Veiculo;
import model.Carro;
import model.Moto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public List<Veiculo> veiculoList = new ArrayList<>();

    public static void main(String[] args) {
       Principal gerenciarVeiculos = new Principal();
       int opcao;
       do {
          opcao = construirMenu();
          switch(opcao){
              case 1 -> gerenciarVeiculos.execCadastrar();
              case 2 -> gerenciarVeiculos.execConsultar();
              case 3 -> gerenciarVeiculos.execEfetuarVenda();
              case 4 -> gerenciarVeiculos.execEfetuarCompra();
              case 9 -> System.out.println("Fim do Programa...");
              default -> System.out.println("Opcao Invalida!!");
          }
       }while (opcao != 9);
    }

    private static int construirMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU PRINCIPAL - CONTROLE DE VEICULOS");
        System.out.println("1. Cadastrar Novo Veiculo");
        System.out.println("2. Listar Todos os Veiculos");
        System.out.println("3. Efetuar Venda");
        System.out.println("4. Efetuar Compra");
        System.out.println("9. Sair");
        System.out.println("Escolha sua opcao: ");
        return Integer.parseInt(sc.nextLine());
    }

    public void execCadastrar(){
       Scanner sc = new Scanner(System.in);
       Veiculo veiculo;
       System.out.println("Cadastrando novo Veiculo");
       System.out.println("Escolha 1 para Carro, ou 2 para Moto ");
       int escolha = Integer.parseInt(sc.nextLine());
       System.out.println("Digite o Modelo: ");
       String modelo = sc.nextLine();
       System.out.println("Digite o Preco: R$");
       double precoCompra = Double.parseDouble(sc.nextLine());
       if(escolha == 1){
           System.out.println("Digite o Fabricante: ");
           String fabricante = sc.nextLine();
           veiculo = new Carro(modelo, precoCompra, 0, 0, fabricante);
           ((Carro)veiculo).calcularPrecoVenda();
       } else {
           System.out.println("Digite as Cilindradas: cc");
           int cilindradas = Integer.parseInt(sc.nextLine());
           veiculo = new Moto(modelo, precoCompra, 0, 0, cilindradas);
           ((Moto)veiculo).calcularPrecoVenda(4.75);
       }
        veiculoList.add(veiculo);
        System.out.println("Veiculo cadastrado com sucesso");
    }

    public void execConsultar(){
        System.out.println("Veiculos Cadastrados");
        for(Veiculo v: veiculoList){
            System.out.println("-------------------------------------");
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Preco Compra: " + v.getPrecoCompra());
            System.out.println("Preco Venda: " + v.getPrecoVenda());
            System.out.println("Quantidade Disponível: " + v.getQuantDisponivel());
            if(v instanceof Carro){
                System.out.println("Fabricante: " + ((Carro) v).getFabricante());
            } else {
                System.out.println("Cilindradas: " + ((Moto) v).getCilindradas());
            }
            System.out.println("-------------------------------------");
        }
    }

    public void execEfetuarVenda(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Venda de Veiculos");
        System.out.println("Modelo do veiculo: ");
        String descProcurada = sc.nextLine();
        for (Veiculo v : veiculoList) {
            if (v.getModelo().equalsIgnoreCase(descProcurada)) {
                try {
                    System.out.println("Digite a quantidade a ser vendida: ");
                    int qtdVenda = Integer.parseInt(sc.nextLine());
                    v.vender(qtdVenda);
                    System.out.println("Venda efetuada com sucesso!!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void execEfetuarCompra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Compra de Veiculos");
        System.out.println("Modelo do veiculo: ");
        String descProcurada = sc.nextLine();
        for (Veiculo v : veiculoList) {
            if (v.getModelo().equalsIgnoreCase(descProcurada)) {
                try {
                    System.out.println("Digite a quantidade a ser comprada: ");
                    int qtdCompra = Integer.parseInt(sc.nextLine());
                    v.comprar(qtdCompra);
                    System.out.println("Compra efetuada com sucesso!!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
