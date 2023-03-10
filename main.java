import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Produto produtos[] = new Produto[3];

        produtos[0] = new Produto("Bola", 50, 120);
        produtos[1] = new Produto("Barril", 25, 310);
        produtos[2] = new Produto("Corda", 42, 250);

    	// Início 
        
        System.out.println("Digite o código do produto: ");
        int codigo = teclado.nextInt();
        if(codigo > 2 || codigo < 0) {
        	System.out.println("Código inválido, tente novamente.");
        	System.exit(0);
        }
        System.out.println("Digite a quantidade a ser adicionada: ");
        int quantidade = teclado.nextInt();
        produtos[codigo].adicionaEstoque(quantidade);
        produtos[codigo].imprimeInventario();
        
        System.out.println("Digite o código do produto: ");
        codigo = teclado.nextInt();
        if(codigo > 2 || codigo < 0) {
        	System.out.println("Código inválido, tente novamente.");
        	System.exit(0);
        }
        System.out.println("Digite a quantidade a ser adicionada: ");
        quantidade = teclado.nextInt();
        produtos[codigo].adicionaEstoque(quantidade);
        produtos[codigo].imprimeInventario();
        
        System.out.println("Digite o código do produto: ");
        codigo = teclado.nextInt();
        if(codigo > 2 || codigo < 0) {
        	System.out.println("Código inválido, tente novamente.");
        	System.exit(0);
        }
        System.out.println("Digite a quantidade a ser adicionada: ");
        quantidade = teclado.nextInt();
        produtos[codigo].adicionaEstoque(quantidade);
        produtos[codigo].imprimeInventario();
        
        // Continuação 
        for (int i = 0; i < produtos.length; i++) {
            produtos[i].imprimeInventario();
        }
    }
}
