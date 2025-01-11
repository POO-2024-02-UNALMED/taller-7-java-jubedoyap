package comunicacion;

public class Libro extends Escrito {
	
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor,  String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;	
	}
	
	public String getCo_autor() {
		return co_autor;
	}
	
	public void setCo_autor(String nuevoCo_autor) {
		co_autor = nuevoCo_autor;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String nuevoEditorial) {
		editorial = nuevoEditorial;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public void setEdicion(String nuevaEdicion) {
		edicion = nuevaEdicion;
	}
	
	public void setInterpretacion(String nuevaInterpretacion) {
		interpretacion = nuevaInterpretacion;
	}
	
	@Override
	public int palabrasTotales(int palabrasPagina) {
		int factor = 2;
		int palabrasTotales = getPaginas()*palabrasPagina*factor;
		
		return palabrasTotales;
	}
	
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	
	@Override
	public String toString() {
		
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + co_autor + "\n" + editorial +  "\n" + edicion + "\n" + interpretacion;
	}
}
