public class Livro {
    private String titulo, autor;
    private int anoPublicacao, qtdPaginas;
    private double preco;
    public static void main(String[] args) {
        Livro l = new Livro("As aventuras de Mafioso","Sandy",2021,56.9,87);
        l.imprimeInfos();
    }
    public Livro(String titulo, String autor, int anoPublicacao, double preco, int qtdPaginas ) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.qtdPaginas = qtdPaginas;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAnoPublicacao(int anoPublicacao){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    public double getPreco(double preco){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public int getQtdPaginas(int qtdPaginas){
        return qtdPaginas;
    }
    public void setQtdPaginas(int qtdPaginas){
        this.qtdPaginas =   qtdPaginas;
    }
    public double calcularPrecoPorPagina(){
        return preco / qtdPaginas;
    }
    public void imprimeInfos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicacao: " +  anoPublicacao);
        System.out.println("Quantidade de páginas: " + qtdPaginas);
        System.out.println("Preço: R$" + preco);
        System.out.println("Preço por página: R$" + preco);

    }
}
