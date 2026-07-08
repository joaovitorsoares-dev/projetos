import java.util.Scanner;

public class CarrinhodeCompro {
    public static void main(String[] args) {
        // Scanner é usado para ler tudo que o usuário digita no console
        Scanner scanner = new Scanner(System.in);

        // ===================== CADASTRO DE USUÁRIO =====================
        // Aqui o programa apenas pede um usuário e uma senha e guarda
        // esses valores em memória (não é salvo em arquivo nem banco de dados)
        System.out.println("\n");
        System.out.println("===============================================================");
        System.out.println("Bem vindo ao carrinho de compras!");
        System.out.println("===============================================================");
        System.out.println("\n");

        System.out.println("\n");
        System.out.println("===============================================================");
        System.out.println("Faça seu cadastro para acessar o carrinho de compras");
        System.out.println("===============================================================");
        System.out.println("\n");
        System.out.println("Digite seu usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        String login;
        String passe;

        // ===================== LOGIN =====================
        // O "do-while" repete o bloco de código ATÉ que o usuário digite
        // o mesmo usuário/senha cadastrados acima.
        // A condição "!login.equals(usuario) || !passe.equals(senha)" significa:
        // "continue pedindo login enquanto os dados estiverem errados"
        do {
            System.out.println("\n");
            System.out.println("===============================================================");
            System.out.println("Faça login para acessar o carrinho de compras");
            System.out.println("===============================================================");
            System.out.println("\n");

            System.out.println("Digite seu usuario: ");
            login = scanner.nextLine();
            System.out.println("Digite sua senha ");
            passe = scanner.nextLine();
            System.out.println("Login realizado com sucesso!");
        } while (!login.equals(usuario) || !passe.equals(senha));

        // A partir daqui o usuário já está "logado" e pode ver a loja
        System.out.println("\n");
        System.out.println("===============================================================");
        System.out.println("Bem vindo ao carrinho de compras!");
        System.out.println("===============================================================");
        System.out.println("\n");

        System.out.println("\n");
        System.out.println("===============================================================");
        System.out.println("===============================================================");
        System.out.println("Mercadão do Gamer - Os melhores jogos para você!");
        System.out.println("===============================================================");
        System.out.println("===============================================================");
        System.out.println("\n");

        System.out.println("\n");
        System.out.println("===============================================================");
        System.out.println("Na compra de Dois jogos, você ganha um desconto de 20% no valor total da compra!");
        System.out.println("===============================================================");
        System.out.println("\n");

        System.out.println("\n");
        System.out.println("===============================================================");
        System.out.println("Disponiveis para compra: ");
        System.out.println("===============================================================");
        System.out.println("\n");

        System.out.println("\n");
        System.out.println("===============================================================");
        System.out.println("Digite o numero do produto que deseja comprar: ");
        System.out.println("===============================================================");
        System.out.println("\n");

        // "total" guarda a soma em R$ dos produtos no carrinho
        // "quantidade" guarda quantos produtos foram adicionados
        double total = 0;
        int quantidade = 0;
        int opcao;

        // ===================== LOOP PRINCIPAL DO CARRINHO =====================
        // Esse "do-while" é o coração do programa: ele fica repetindo o menu
        // (adicionar / retirar / finalizar) enquanto a opção escolhida for 1 ou 2.
        // Assim que o usuário digitar 3 (finalizar), o loop para.
        do {
            // Mostra o catálogo de produtos toda vez que o menu aparece
            System.out.printf(
                    "1 - God of War Ragnarok - R$ 299,99 \n2 - NBA 2K26 - R$ 399,90\n3 - Elden Ring - R$ 274,50\n4 - Call of Duty Black Ops 2 - R$ 274,00\n5 - PEAK- R$ 24,00\n6 - Horizon Forbidden West - R$ 299,99\n7 - Fallout 4 - R$ 79,90\n");
            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Retirar produto");
            System.out.println("3 - Finalizar compra");
            opcao = scanner.nextInt();

            // ---------- ADICIONAR PRODUTO ----------
            if (opcao == 1) {

                System.out.println("Digite o produto:");

                int produto1 = scanner.nextInt();

                // O "switch" verifica qual número o usuário digitou e, de acordo
                // com o produto escolhido, soma o preço no "total" e
                // incrementa a "quantidade" de itens no carrinho
                switch (produto1) {
                    case 1:
                        System.out.println("\nVocê escolheu o jogo God of War Ragnarok por R$ 299,99");
                        total += 299.99;
                        quantidade++;
                        break;
                    case 2:
                        System.out.println("\nVocê escolheu    o jogo NBA 2K26 por R$ 399,90");

                        total += 399.90;
                        quantidade++;
                        break;
                    case 3:
                        System.out.println("\nVocê escolheu o jogo Elden Ring por R$ 274,50");
                        total += 274.50;
                        quantidade++;
                        break;
                    case 4:
                        System.out.println("\nVocê escolheu o jogo Call of Duty Black Ops 2 por R$ 274,00");
                        total += 274.00;
                        quantidade++;
                        break;
                    case 5:
                        System.out.println("\nVocê escolheu o jogo PEAK por R$ 24,00");
                        total += 24.00;
                        quantidade++;
                        break;
                    case 6:
                        System.out.println("\nVocê escolheu o jogo Horizon Forbidden West por R$ 299,99");
                        total += 299.99;
                        quantidade++;
                        break;
                    case 7:
                        System.out.println("\nVocê escolheu o jogo Fallout 4 por R$ 79,90");
                        total += 79.90;
                        quantidade++;
                        break;
                    default:
                        System.out.println("Produto invalido!");

                }

                System.out.println("-----------------------------------------------");
                System.out.println(
                        "Deseja comprar mais algum produto ou retirar algum produto do carrinho? (1 - adicionar / 2 - retirar / 3 - finalizar compra)");
                opcao = scanner.nextInt();

                System.out.println("-----------------------------------------------");

                // ---------- RETIRAR PRODUTO ----------
                // Mesma lógica do "adicionar", só que subtraindo o preço do total
                // e diminuindo a quantidade
                if (opcao == 2) {
                    if (quantidade > 0) {
                        System.out.println("Digite o numero do produto que deseja retirar do carrinho: ");
                        int produtoRetirar = scanner.nextInt();

                        switch (produtoRetirar) {
                            case 1:
                                System.out.println("Você retirou o jogo God of War Ragnarok do carrinho.");
                                total -= 299.99;
                                quantidade--;
                                break;
                            case 2:
                                System.out.println("Você retirou o jogo NBA 2K26 do carrinho.");
                                total -= 399.90;
                                quantidade--;
                                break;
                            case 3:
                                System.out.println("Você retirou o jogo Elden Ring do carrinho.");
                                total -= 274.50;
                                quantidade--;
                                break;
                            case 4:
                                System.out.println("Você retirou o jogo Call of Duty Black Ops 2 do carrinho.");
                                total -= 274.00;
                                quantidade--;
                                break;
                            case 5:
                                System.out.println("Você retirou o jogo PEAK do carrinho.");
                                total -= 24.00;
                                quantidade--;
                                break;
                            case 6:
                                System.out.println("Você retirou o jogo Horizon Forbidden West do carrinho.");
                                total -= 299.99;
                                quantidade--;
                                break;
                            case 7:
                                System.out.println("Você retirou o jogo Fallout 4 do carrinho.");
                                total -= 79.90;
                                quantidade--;
                                break;
                            default:
                                System.out.println("Produto invalido!");
                        }
                    } else {
                        // Não deixa retirar produto se o carrinho estiver vazio
                        System.out.println("Carrinho vazio! Não há produtos para retirar.");
                    }
                }
            }
            // Enquanto "opcao" for 1 (adicionar) ou 2 (retirar), o loop continua.
            // Quando for 3 (ou qualquer outro valor), o loop encerra.
        } while (opcao == 1 || opcao == 2);

        // ===================== DESCONTO POR QUANTIDADE =====================
        // Regra de negócio: comprando 2 ou mais jogos, ganha 20% de desconto
        if (quantidade >= 2) {
            System.out.println("Parabéns! Você ganhou um desconto de 20% por comprar dois ou mais jogos!");
            double desconto = total * 0.2;
            total = total - desconto;
        }

        // ===================== FORMA DE PAGAMENTO =====================
        System.out.println("\n");
        System.out.println("===============================================================");
        System.out.println("\nFORMA DE PAGAMENTO");
        System.out.println("1 - Pix ( 5% de desconto)");
        System.out.println("2 - Cartão");
        System.out.println("===============================================================");
        System.out.println("\n");
        int formaPagamento = scanner.nextInt();

        // Aplica a regra de acordo com a forma de pagamento escolhida
        switch (formaPagamento) {
            case 1:
                // Pix: aplica mais 5% de desconto em cima do total (que já pode
                // ter o desconto de 20% aplicado acima)
                System.out.println("Você escolheu pagar com Pix.");
                total = total - (total * 0.05);
                break;
            case 2:
                System.out.println("Você escolheu pagar com cartão.");
                System.out.println("Digite  1 - para pagar à vista ou 2 - para pagar parcelado( 3x sem juros): ");
                int opcaoCartao = scanner.nextInt();

                if (opcaoCartao == 1) {
                    // Pagamento à vista: não altera o total
                    System.out.println("\nPagamento à vista no cartão");
                    System.out.println("Total da compra: R$ " + total);

                } else if (opcaoCartao == 2) {

                    System.out.print("Digite a quantidade de parcelas: ");
                    int parcelas = scanner.nextInt();

                    // Até 3 parcelas: sem juros, só divide o total pelo número de parcelas
                    if (parcelas <= 3) {

                        double valorParcela = total / parcelas;
                        System.out.println("\nPagamento parcelado em 3x sem juros");
                        System.out.println(parcelas + "x de R$ " + valorParcela);
                        System.out.println("Total da compra: R$ " + total);

                    } else {
                        // Mais de 3 parcelas: aplica 10% de juros no total antes de dividir
                        System.out.println("\nParcelamento com 10% de juros!");

                        total *= 1.10;

                        double valorParcela = total / parcelas;

                        System.out.println(parcelas + "x de R$ " + valorParcela);

                        System.out.println("Total com juros: R$ " + total);
                    }
                } else {
                    System.out.println("Opção de pagamento inválida para cartão.");
                }
                break;
            default:
                System.out.println("Forma de pagamento inválida!");
        }

        // ===================== RESUMO FINAL =====================
        // Mostra ao usuário quantos jogos ele comprou e o valor final já
        // com todos os descontos/juros aplicados
        System.out.println("\n");
        System.out.println("===============================================================");
        System.out.println("RESUMO DA COMPRA");
        System.out.println("Quantidade de jogos: " + quantidade);
        System.out.printf("Valor total da compra: R$ %.2f\n ", total);
        System.out.println("===============================================================");
        System.out.println("\n");

        System.out.println("\n=================================");
        System.out.println("      LOJA GAMES ONLINE");
        System.out.println("=================================");
        System.out.println("Pedido aprovado com sucesso!");
        System.out.println("Pagamento confirmado!");
        System.out.println("Sua compra foi finalizada.");
        System.out.println("Volte sempre!");
        System.out.println("=================================");

        // Fecha o Scanner para liberar o recurso de leitura do console
        scanner.close();
    }

}
