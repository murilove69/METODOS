package method;
public class Maior{
	//Atributo de armazenamento do número
	private int n1;
	private int n2;
	private int n3;
	
	//Construtor
	public void Menor(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	//Método para verificação de qual é o maior número.
	public double M() {
		if(n1>=n2 && n1 >= n3) {
			return n1;
		}else if(n2>=n1 && n2>=n3) {
			return n2;
		}else {
			return n3;
		}
	}
 









}