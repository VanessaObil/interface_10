package model;

public class Cuarteto extends AgrupacionOficial {

	private Integer numMiembros;

	
	public Cuarteto() {
		
	}

	public boolean insertarIntegrante(Integrante i) {
		return false;}
	
	public boolean eliminarIntegrante(Integrante i) {
		return false;}
	
	
	public Integer getNumMiembros() {
		return numMiembros;
	}

	public void setNumMiembros(Integer numMiembros) {
		this.numMiembros = numMiembros;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando el Cuarteto" + getNombre();
	}

	@Override
	public String hacerTipo() {
		return "El Cuarteto va de" + getNombre()+ "siendo" + getTipoDiz();
	}

	
	
}
