public class Produto {
	 private String nome;
	    private int quantEstoque;
	    private double valor;
	    
	    public Produto(String nome, int quantEstoque, double valor) {
	        this.nome = nome;
	        this.quantEstoque = quantEstoque;
	        this.valor = valor; 
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getQuantEstoque() {
	        return quantEstoque;
	    }

	    public void setQuantEstoque(int quantEstoque) {
	        this.quantEstoque = quantEstoque;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public void setValor(double valor) {
	        this.valor = valor;
	    }
	    
	    // Coloca uma quantidade de "produtos" em estoque 
	    public void adicionaEstoque(int quantidade){
	        this.quantEstoque += quantidade; 
	    }
	    
	    // Serve para retirar uma certa quantidade de "produtos" em estoque, caso não seja possível então ele mostra um alerta. 
	    public void baixaEstoque(int quantidade) {
	        if(quantidade > this.quantEstoque) {
	            System.out.println("Quantidade em estoque insuficiente.");
	        }
	        else {
	            this.quantEstoque -= quantidade; 
	        }
	    }
	    
	    // Imprime os dados dos produtos 	
	    public void imprimeInvetario(){
	        System.out.println("Nome: " + this.nome);
	        System.out.println("Quantidade em estoque: " + this.quantEstoque);
	        System.out.println("Valor:R$: " + this.valor);
	    }
}
