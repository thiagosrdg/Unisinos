/* Classe Produto:
• um produto possui um nome, um preço e uma data de validade (objeto do tipo Data)
• crie um construtor que recebe parâmetros para inicializar todos os atributos
• crie o método toString e os métodos GET e SET dos atributos
• crie um método chamado verificaProdutoVencido, que recebe uma Data por parâmetro. Este
método compara a data recebida por parâmetro com a data de vencimento do produto,
retornando verdadeiro caso o produto esteja vencido naquela data e falso caso contrário */

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public boolean verificaProdutoVencido(Data dataAtual) {
        if (dataValidade.getAno() < dataAtual.getAno()) {
            return true;
        } else if (dataValidade.getAno() == dataAtual.getAno()) {
            if (dataValidade.getMes() < dataAtual.getMes()) {
                return true;
            } else if (dataValidade.getMes() == dataAtual.getMes()) {
                if (dataValidade.getDia() < dataAtual.getDia())
                    return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco + ", Validade: " + dataValidade;
    }
}
