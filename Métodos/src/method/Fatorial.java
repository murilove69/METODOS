package method;
public class Fatorial {
	
	//Atributos
	private int numero;
	
	// Construtor
    public Fatorial(int numero) {
        this.numero = numero;
        }
    //Chamar o numero.
    public int getNum() {
    	return numero;
    }
  //O método: fatorial de 0 ou 1 é 1.
    
    public int getCalc() {
	   if (numero == 0 || numero == 1) {
        return 1; 
    }
        
     // Método para ultiplicar os números de 2 até o valor informado
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;  
        }
        return fatorial;
    }
}
