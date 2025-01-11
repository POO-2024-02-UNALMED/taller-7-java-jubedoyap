package comunicacion;

public class Alfabeto extends Pictograma{
	
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion= interpretacion;
		
	}
	
	public String[] getLetras() {
		return letras;
	}
	
	public void setLetras(String[] alfabeto) {
		letras = alfabeto;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	
	@Override
	public String toString() {
		String alfabeto = letras[0];
		for (int i = 1; i < letras.length; i++) {
			alfabeto = alfabeto + ", " + letras[i] ;
		}
		return alfabeto;
	}
	
}
