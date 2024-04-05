public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro(Teclado.leString("Digite o título do livro: "),
                Teclado.leString("Digite o autor do livro: "),
                Teclado.leInt("Digite o ano de publicação do livro: "),
                Teclado.leDouble("Digite o preço do livro: "),
                Teclado.leInt("Digite a qtd de páginas do livro :"));
        System.out.println("Preço por página do livro " + l1.getTitulo() + ": R$" + l1.calcularPrecoPorPagina());

        Livro l2 = new Livro(Teclado.leString("Digite o título do livro: "),
                Teclado.leString("Digite o autor do livro: "),
                Teclado.leInt("Digite o ano de publicação do livro: "),
                Teclado.leDouble("Digite o preço do livro: "),
                Teclado.leInt("Digite a qtd de páginas do livro :"));
        System.out.println("Preço por página do livro " + l2.getTitulo() + ": R$" + l2.calcularPrecoPorPagina());

        Livro l3 = new Livro(Teclado.leString("Digite o título do livro: "),
                Teclado.leString("Digite o autor do livro: "),
                Teclado.leInt("Digite o ano de publicação do livro: "),
                Teclado.leDouble("Digite o preço do livro: "),
                Teclado.leInt("Digite a qtd de páginas do livro :"));
        System.out.println("Preço por página do livro " + l3.getTitulo() + ": R$" + l3.calcularPrecoPorPagina());

        Cliente c1 = new Cliente(Teclado.leString("Digite seu nome: "),
                Teclado.leString("Digite seu EMAIL: "),
                Teclado.leInt("Digite sua idade: "),
                Teclado.leInt("DIgite sua senha: "),
                Teclado.leChar("dIGITE SEU SEXO: "));
        Cliente c2 = new Cliente(Teclado.leString("Digite seu nome: "),
                Teclado.leString("Digite seu EMAIL: "),
                Teclado.leInt("Digite sua idade: "),
                Teclado.leInt("DIgite sua senha: "),
                Teclado.leChar("dIGITE SEU SEXO: "));
        Cliente c3 = new Cliente(Teclado.leString("Digite seu nome: "),
                Teclado.leString("Digite seu EMAIL: "),
                Teclado.leInt("Digite sua idade: "),
                Teclado.leInt("DIgite sua senha: "),
                Teclado.leChar("dIGITE SEU SEXO: "));
        System.out.println("Clientes:   ");
        c1.imprimeInformacoes();
        c2.imprimeInformacoes();
        c3.imprimeInformacoes();
        System.out.println("Livros:   ");
        l1.imprimeInfos();
        l2.imprimeInfos();
        l3.imprimeInfos();
    }
}
