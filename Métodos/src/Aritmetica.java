import method.Maior;
import method.Positivo;
import method.AB;
import method.Transf;
import method.Fatorial;
class Eu {

    // Atributo para armazenar o número.
    private int n1;
    private int n2;
    private int n3;

    // Construtor da classe.
    public Eu(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public double x (){
    	return (n1 + n2 + n3) / 3.0;
    }
	//Get para acessar os atributos privados.

    public int getN1() {
    	return n1;
    	}
    public int getN2() {
    	return n2;
    	}
    public int getN3() {
    	return n3;
    	}
}
    // Método para testar a classe:
 public class Aritmetica{
    public static void main(String[] args) {
        // Instanciando a classe:
        Eu n = new Eu (3,8,9);
      
        // Mostrando o resultado.
        System.out.println("O resultado da média aritmética dos números é: " + n.x());

		//Instanciando a classe
		Maior m = new Maior();
		
		//Testando os números através do IF.
		m.Menor(4,8,2);
		double maior = m.M();
		//Exibindo o resultado.
		System.out.println("\nO maior número é: "+ maior +"\n");
    
		//Testando se os numeros são positivos ou negativos.
		
		Positivo n1 = new Positivo(-8);
		Positivo n2 = new Positivo(7);
		Positivo n3 = new Positivo(0);
		
		System.out.println(n1.getPos());
		System.out.println(n2.getPos());
		System.out.println(n3.getPos());
		
		//Mostrando se os números a serem informados estão unidos.
		AB numeros1 = new AB(7,8); 
		System.out.println(numeros1.getUnir());
		
		//Mostrando os minutos transformados
		
		Transf min = new Transf(183);
		System.out.println(min.getConverter());
		
		// Instanciando a classe Fatorial:
		
		Fatorial f = new Fatorial(5);
	
		
		//Resultado
		
		 System.out.println("\nO fatorial de " + f.getNum() + " é " + f.getCalc());
    }
}
