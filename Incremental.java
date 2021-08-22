package pacote;

public class Incremental {
	
	private static int count = 0;
	private static Incremental Instancia;
	private int numero;
	
	public static Incremental cria() {
		if(Instancia == null) {
			Instancia = new Incremental();
		}
		return Instancia;
	}
	
	private Incremental() {
		numero = ++count;
	}
	
	public String toString() {
		return "Incremental "+ numero;
	}
}
