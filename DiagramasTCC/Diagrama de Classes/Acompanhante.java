package Diagrama de Classes;

public class Acompanhante extends Usuario {

	private String grauParentesco;

	private boolean isPermitido;

	public void setParentesco() {

	}

	public boolean autorizarAcompanhamento(boolean isPermitido) {
		return false;
	}

}
