import java.util.ArrayList;
import java.util.List;

public class Prateleira {
     private int codigo;
     private String categoria;
     private List<Livro> livroList = new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Livro> getLivroList() {
        return livroList;
    }

    public void setLivroList(List<Livro> livroList) {
        this.livroList = livroList;
    }

    public void listarLivrosDaPrateleira(){
        System.out.println("Na Prateleira: " + codigo);
        System.out.println("De: " + categoria);
        System.out.println("Ha os seguintes livros: ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for(Livro livro : livroList){
            System.out.println(livro);
        }
    }
}
