package model;

public class Romancero extends Agrupacion {

	private String tematicaCartelon;
	
	public Romancero() {
		
	}

	public String getTematicaCartelon() {
		return tematicaCartelon;
	}

	public void setTematicaCartelon(String tematicaCartelon) {
		this.tematicaCartelon = tematicaCartelon;
	}

	@Override
	public String toString() {
		return "Romancero [getTematicaCartelon()=" + getTematicaCartelon() + "]";
	}

	@Override
	public String cantarPresentacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hacerTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
