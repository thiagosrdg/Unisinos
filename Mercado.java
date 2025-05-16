/* Classe Mercado:
• um mercado possui 2 prateleiras
• crie um construtor que recebe parâmetros para inicializar todos os atributos
• crie os métodos GET dos atributos (não é necessário fazer SET)
• crie o método mediaValorProdutos, que retorna a média do preço dos produtos que estão nas
prateleiras do mercado. Atenção: algumas prateleiras podem ter 1, 2 ou até mesmo não ter
produtos */

public class Mercado{
    private Prateleira prateleira1;
    private Prateleira prateleira2;
    
    public Mercado(Prateleira prateleira1, Prateleira prateleira2){
        this.prateleira1 = prateleira1;
        this.prateleira2 = prateleira2;
    }
    public Prateleira getPrateleira1(){
        return prateleira1;
    }
    public Prateleira getPrateleira2(){
        return prateleira2;
    }
    public double mediaValorProdutos(){
        double soma = 0;
        int quantidade = 0;
        
        if (prateleira1.getProduto1() != null) {
            soma += prateleira1.getProduto1().getPreco();
            quantidade++;
        }
        if (prateleira1.getProduto2() != null) {
            soma += prateleira1.getProduto2().getPreco();
            quantidade++;
        }
        if (prateleira1.getProduto3() != null) {
            soma += prateleira1.getProduto3().getPreco();
            quantidade++;
        }
        if (prateleira2.getProduto1() != null) {
            soma += prateleira2.getProduto1().getPreco();
            quantidade++;
        }
        if (prateleira2.getProduto2() != null) {
            soma += prateleira2.getProduto2().getPreco();
            quantidade++;
        }
        if (prateleira2.getProduto3() != null) {
            soma += prateleira2.getProduto3().getPreco();
            quantidade++;
        }
        if (quantidade >0){
            return soma / quantidade;
        } else{
            return 0;
        }
    }
}
