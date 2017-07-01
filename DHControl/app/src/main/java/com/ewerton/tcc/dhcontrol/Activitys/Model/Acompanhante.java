package com.ewerton.tcc.dhcontrol.Activitys.Model;

public class Acompanhante extends Usuario {

	private String grauParentesco;

	private boolean isPermitido;

    public Acompanhante() {
    }

    public void setParentesco() {

	}

	public boolean autorizarAcompanhamento(boolean isPermitido) {
		return false;
	}

}
