package method;

public class Transf {
	
	//Atribuindo
	private int minutos;


	//Criando o construtor:
	public Transf(int minutos) {
		this.minutos=minutos;
	}
	//Chamando o numero que está privado
	public int getMin() {
		return minutos;
	}
	//Criando um método para transformação de minutos em horas e minutos
	public String getConverter() {
		int hora = minutos / 60;
		int restante = minutos % 60;
		return "\n" + hora + "hora(s) e " + restante + "minuto(s)"; 	
	}

}
