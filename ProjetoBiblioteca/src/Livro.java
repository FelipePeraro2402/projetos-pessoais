public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DADOS DO LIVRO").append("\n");
        sb.append("Titulo: ").append(titulo).append("\n");
        sb.append("Autor: ").append(autor).append("\n");
        sb.append("Numero de Paginas: ").append(numeroPaginas).append("\n");
        sb.append("=-=-=-=-=-=-=-=-=-=-=-=");
        return sb.toString();
    }
}
