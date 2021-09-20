package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSubtrair() {
		Calculadora calc = new Calculadora();
		float subtrai= calc.subtrair("5,5");
		assertEquals(0,subtrai,0);
	}
	@Test
	public void testSomar() {
		Calculadora calc1 = new Calculadora();
		int soma= calc1.somar("0,5");
		assertEquals(15,soma);
	}
	@Test
	public void testMultiplicar() {
		Calculadora calc2 = new Calculadora();
		int multi= calc2.multiplicar("3,5");
		assertEquals(15,multi);
	}
	@Test
	public void testDividir() {
		Calculadora calc3 = new Calculadora();
		int div= calc3.dividir("5");
		assertEquals(2,div);
	}
	

}
