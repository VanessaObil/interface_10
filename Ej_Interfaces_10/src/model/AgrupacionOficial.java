package model;

public abstract class AgrupacionOficial extends Agrupacion{

	private Integer puntosObtenidos;
	
	
	public AgrupacionOficial() {
		
	}

	public boolean insertarintegrante(Integrante[] i) {
		return false;
	}
	public boolean eliminarIntegrante(Integrante[] i) {
			return false;	
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}
	
	
	
}
