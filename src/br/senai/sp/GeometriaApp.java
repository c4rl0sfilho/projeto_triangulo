package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
		//criar um triangulo
		System.out.println("Criando t1...");
		Triangulo t1 = new Triangulo();
		System.out.println("Criando T2...");
		Triangulo t2 = new Triangulo();
		System.out.println("Criando t3...");
		Triangulo t3 = new Triangulo();
		System.out.println("             ");
		
		//Definindo as dimensões dos triangulos
		t1.base = 20;
		t1.ladoB = 15;
		t1.ladoC = 15;
		t1.altura = 12;
		t1.nome = "Triângulo 001";
		
		t2.nome = "Triângulo 002";
		t2.base = 10;
		t2.ladoB = 6;
		t2.ladoC = 8;
		t2.altura = 8;
		
		t3.nome = "Triângulo 003";
		t3.base = 18;
		t3.ladoB = 20;
		t3.ladoC = 21;
		t3.altura = 14;
				
		
		t1.mostrarDimensoes();
		t2.mostrarDimensoes();
		t3.mostrarDimensoes();
		
		
		
	}

}
