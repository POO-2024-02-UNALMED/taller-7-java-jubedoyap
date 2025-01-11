package comunicacion;

public class Tesis extends Escrito {
	
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
		
	}
	
	public String getIdea() {
		
		return idea;
	}
	
	public void setIdea(String nuevaIdea) {
		
		idea = nuevaIdea;
	}
	
	public String[] getArgumentos() {
		
		return argumentos;
	}
	
	public void setArgumentos(String[] nuevosArgumentos) {
		
		argumentos = nuevosArgumentos;
	}
	
	public String getConclusion() {
		
		return conclusion;
	}
	
	public void setConclusion(String nuevaConclusion) {
		
		conclusion = nuevaConclusion;
	}
	
	public String getReferencias() {
		
		return referencias;
	}
	
	public void setReferencias(String nuevasReferencias) {
		
		referencias = nuevasReferencias;
	}
	
	public void setInterpretacion(String nuevaInterpretacion) {
		
		interpretacion = nuevaInterpretacion;
	}
	
	@Override
	public int palabrasTotales(int palabrasPagina) {
		
		int factor = 5;
		int palabrasTotales = getPaginas() * palabrasPagina * factor;
		
		return palabrasTotales;
	}
	
	@Override
	public String interpretacion() {
		
		return interpretacion;
	}
	
	@Override
	public String toString() {
		
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + idea + "\n" + argumentos.length + "\n" + conclusion +
				"\n" + referencias;
	}
}
