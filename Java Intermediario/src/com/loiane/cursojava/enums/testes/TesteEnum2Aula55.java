package com.loiane.cursojava.enums.testes;

import com.loiane.cursojava.enums.DiaSemana;

public class TesteEnum2Aula55 {

	public static void main(String[] args) {

		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

		System.out.println(dia);

	}

}