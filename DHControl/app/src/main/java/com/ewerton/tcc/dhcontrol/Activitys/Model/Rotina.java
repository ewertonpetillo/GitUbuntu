package com.ewerton.tcc.dhcontrol.Activitys.Model;

import java.util.ArrayList;

public class Rotina {

	private int codigo;

	private String data;

	private ArrayList<Glicemia> glicemia;

	private ArrayList<PressaoArterial> pressao;

	private ArrayList<AtividadeFisica> atividadefisica;

	private ArrayList<Medicamento> medicamento;

	private ArrayList<Refeicao> refeicao;

	public boolean isLembrete(String hora) {
		return false;
	}

}
