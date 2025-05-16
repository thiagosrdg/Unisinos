/* Classe Prateleira:
• uma prateleira pode armazenar 3 produtos
• crie um construtor que recebe parâmetros para inicializar todos os atributos
• crie um construtor que não recebe parâmetros (ou seja, uma prateleira criada sem produtos)
• crie os métodos de acesso dos atributos (GET e SET)
• crie um método chamado produtoMaisCaro, que retorna o produto mais caro da prateleira (caso
haja produtos). Atenção: este método retorna o produto mais caro, ou seja, um objeto do tipo
Produto
• crie o método toString */

public class Prateleira {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;

    // Construtor
    public Prateleira(Produto produto1, Produto produto2, Produto produto3) {
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
    }

    public Prateleira() {
        // Construtor vazio
    }

    // GET e SET
    public Produto getProduto1() {
        return produto1;
    }

    public Produto getProduto2() {
        return produto2;
    }

    public Produto getProduto3() {
        return produto3;
    }

    public void setProduto1(Produto produto1) {
        this.produto1 = produto1;
    }

    public void setProduto2(Produto produto2) {
        this.produto2 = produto2;
    }

    public void setProduto3(Produto produto3) {
        this.produto3 = produto3;
    }

    public Produto produtoMaisCaro() {
        Produto maisCaro = null;

        if (produto1 != null) {
            maisCaro = produto1;
        }

        if (produto2 != null) {
            if (maisCaro == null || produto2.getPreco() > maisCaro.getPreco()) {
                maisCaro = produto2;
            }
        }

        if (produto3 != null) {
            if (maisCaro == null || produto3.getPreco() > maisCaro.getPreco()) {
                maisCaro = produto3;
            }
        }

        return maisCaro;
    }

    @Override
    public String toString() {
        return "Prateleira: \nProduto 1: " + produto1 +
               "\nProduto 2: " + produto2 +
               "\nProduto 3: " + produto3;
    }
}

