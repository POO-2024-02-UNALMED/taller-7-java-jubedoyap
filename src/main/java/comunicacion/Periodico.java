package comunicacion;

public class Periodico extends Escrito{
	
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	public String getFecha() {
		
		return fecha;
	}
	
	public void setFecha(String nuevaFecha) {
		
		fecha = nuevaFecha;
	}
	
	public String getPrimicia() {
		
		return primicia;
	}
	
	public void setPrimicia(String nuevaPrimicia) {
		
		primicia = nuevaPrimicia;
	}
	
	
	public void setInterpretacion(String nuevaInterpretacion) {
		
		interpretacion = nuevaInterpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPaginas) {
		
		int factor = 10;
		int palabrasTotales = getPaginas() * palabrasPaginas * factor;
		
		return palabrasTotales;
	}
	
	@Override
	public String interpretacion() {
		
		return interpretacion;
	}
	
	@Override
	public String toString() {
		
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + fecha + "\n" + primicia;
	}
}
