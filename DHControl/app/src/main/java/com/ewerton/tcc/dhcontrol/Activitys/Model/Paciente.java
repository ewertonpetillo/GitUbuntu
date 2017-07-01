package com.ewerton.tcc.dhcontrol.Activitys.Model;

public class Paciente extends Usuario {

	private String dataNascimento;

	private double peso;

	private double altura;

	private double indiceAtividadeFisica;

	public double calcularIMC(double peso, double altura, char sexo) {
		return 0;
	}

	public double calcularTMB(double imc, int idade, double indAF) {
		return 0;
	}

}
