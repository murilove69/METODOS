package method;

public class AB {
	
	//Atributos
	private int n;
	private int n2;
	
	//Construtor
	public AB(int n, int n2) {
		this.n = n;
		this.n2 = n2;
	}
	//Método para mostrar o número.	
	public int getNome1() {
		return n;
	}
	//Método para unir os numeros
	public String getUnir() {
		return "\nOs números juntos são: " + n + n2;
	}
}
