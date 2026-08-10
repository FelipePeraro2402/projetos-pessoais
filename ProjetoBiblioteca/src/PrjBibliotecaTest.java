public class PrjBibliotecaTest {
    public static void main(String[] args) {
        //Criando Prateleiras
        Prateleira prat1 = new Prateleira();
        prat1.setCodigo(10);
        prat1.setCategoria("TI");

        Prateleira prat2 = new Prateleira();
        prat2.setCodigo(20);
        prat2.setCategoria("Ficcao Cientifica");

        //Criando Livros
        Livro livro1 = new Livro();
        livro1.setTitulo("Codigo Limpo");
        livro1.setAutor("Robert C. Martin");
        livro1.setNumeroPaginas(440);

        Livro livro2 = new Livro();
        livro2.setTitulo("Sistemas Operacionais Modernos");
        livro2.setAutor("Andrew S. Tanenbaum");
        livro2.setNumeroPaginas(816);

        Livro livro3 = new Livro();
        livro3.setTitulo("Perdido em Marte");
        livro3.setAutor("Andy Weir");
        livro3.setNumeroPaginas(336);

        //Adicionando livros nas prateleiras
        prat1.getLivroList().add(livro1);
        prat1.getLivroList().add(livro2);
        prat2.getLivroList().add(livro3);

        //Exibe o resultado
        prat1.listarLivrosDaPrateleira();
        prat2.listarLivrosDaPrateleira();
    }
}
