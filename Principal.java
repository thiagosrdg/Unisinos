/* Classe Principal:
Nesta classe, crie o método main. No main, faça o que se pede:
• crie uma prateleira com 3 produtos, conforme listagem abaixo:
o Produto 1: amaciante, preço solicitado pelo Teclado, validade 10/4/2014
o Produto 2: creme dental, preço solicitado pelo Teclado, validade 5/5/2015
o Produto 3: leite condensado, preço solicitado pelo Teclado, validade 4/12/2012
Atenção: garanta que o preço de cada produto será maior do que zero
• crie uma prateleira sem produto algum. Em seguida, insira nesta prateleira o produto "cortina",
que custa R$167,98 e tem data de validade 13/10/2025
• crie um mercado com estas duas prateleiras
• mostre na tela as informações dos produtos vencidos, supondo a data 10/10/2014
• imprima as informações do produto mais caro do mercado
• imprima a média de preço dos produtos do mercado */

public class Principal {
    public static void main(String[] args) {
        // ===== Criando prateleira com 3 produtos =====
        double preco1 = Teclado.leDouble("Digite o preço do amaciante:");
        while (preco1 <= 0) {
            preco1 = Teclado.leDouble("Preço inválido. Digite novamente o preço do amaciante:");
        }

        double preco2 = Teclado.leDouble("Digite o preço do creme dental:");
        while (preco2 <= 0) {
            preco2 = Teclado.leDouble("Preço inválido. Digite novamente o preço do creme dental:");
        }

        double preco3 = Teclado.leDouble("Digite o preço do leite condensado:");
        while (preco3 <= 0) {
            preco3 = Teclado.leDouble("Preço inválido. Digite novamente o preço do leite condensado:");
        }

        Produto produto1 = new Produto("amaciante", preco1, new Data(10, 4, 2014));
        Produto produto2 = new Produto("creme dental", preco2, new Data(5, 5, 2015));
        Produto produto3 = new Produto("leite condensado", preco3, new Data(4, 12, 2012));

        Prateleira prateleira1 = new Prateleira(produto1, produto2, produto3);

        // ===== Criando prateleira vazia e inserindo 1 produto =====
        Prateleira prateleira2 = new Prateleira();
        Produto cortina = new Produto("cortina", 167.98, new Data(13, 10, 2025));
        prateleira2.setProduto1(cortina);

        // ===== Criando o mercado com as duas prateleiras =====
        Mercado mercado = new Mercado(prateleira1, prateleira2);

        // ===== Mostrando produtos vencidos (em 10/10/2014) =====
        System.out.println("\n--- Produtos vencidos em 10/10/2014 ---");
        Data dataReferencia = new Data(10, 10, 2014);

        Produto[] produtos = {
            prateleira1.getProduto1(), prateleira1.getProduto2(), prateleira1.getProduto3(),
            prateleira2.getProduto1(), prateleira2.getProduto2(), prateleira2.getProduto3()
        };

        for (Produto p : produtos) {
            if (p != null) {
                Data validade = p.getDataValidade();
                boolean vencido = false;

                if (validade.getAno() < dataReferencia.getAno()) {
                    vencido = true;
                } else if (validade.getAno() == dataReferencia.getAno()) {
                    if (validade.getMes() < dataReferencia.getMes()) {
                        vencido = true;
                    } else if (validade.getMes() == dataReferencia.getMes()) {
                        if (validade.getDia() < dataReferencia.getDia()) {
                            vencido = true;
                        }
                    }
                }

                if (vencido) {
                    System.out.println(p);
                }
            }
        }

        // ===== Mostrando produto mais caro do mercado =====
        Produto maisCaro1 = prateleira1.produtoMaisCaro();
        Produto maisCaro2 = prateleira2.produtoMaisCaro();

        Produto maisCaro;
        if (maisCaro1 == null) {
            maisCaro = maisCaro2;
        } else if (maisCaro2 == null) {
            maisCaro = maisCaro1;
        } else if (maisCaro1.getPreco() > maisCaro2.getPreco()) {
            maisCaro = maisCaro1;
        } else {
            maisCaro = maisCaro2;
        }

        System.out.println("\n--- Produto mais caro do mercado ---");
        if (maisCaro != null) {
            System.out.println(maisCaro);
        } else {
            System.out.println("Nenhum produto disponível.");
        }

        // ===== Mostrando média de preço dos produtos do mercado =====
        double media = mercado.mediaValorProdutos();
        System.out.printf("\n--- Média de preço dos produtos: R$ %.2f\n", media);
    }
}
