package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {

		var civic = new Civic();

		civic.acelerar();
		System.out.println(civic);

		civic.acelerar();
		System.out.println(civic);

		civic.acelerar();
		System.out.println(civic);

		var ferrari = new Ferrari();
		ferrari.VelocidadeDoAr();
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
	}

}
