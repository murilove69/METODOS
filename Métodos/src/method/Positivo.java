package method;

public class Positivo {
	//Atributo para armazenamento dos números
	private int n;
	
	//Construtor
	public Positivo(int n) {
		this.n=n;
	}
	
	//Método para verificação se é positivo ou negativo
	public String getPos() {
		
		if(n >= 0) {
			return "O número " + n + " é positivo";
		}else {
			return "O número " + n + " é negativo"; 
		}
		
	}

}
