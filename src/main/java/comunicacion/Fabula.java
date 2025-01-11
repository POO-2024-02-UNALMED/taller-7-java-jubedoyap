package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanzas;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanzas = ensenanzas;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza() {
		
		return ensenanzas;
	}
	
	public void setEnsenanza(String nuevasEnsenanzas) {
		
		ensenanzas = nuevasEnsenanzas;
	}
	
	public void setInterpretacion(String nuevaInterpretacion) {
		
		interpretacion = nuevaInterpretacion;
	}
	
	@Override
	public int palabrasTotales(int palabrasPagina) {
		
		int factor = 1;
		int palabrasTotales = getPaginas()* palabrasPagina * factor;
		
		return palabrasTotales;
	}
	
	@Override
	public String interpretacion() {
		
		return interpretacion;
	}
	
	@Override
	public String toString() {
		
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + ensenanzas + "\n" + interpretacion;
	}
}
