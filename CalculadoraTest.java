//teste Unit4
package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSubtrair() {
		Calculadora calc = new Calculadora();
		int subtrai= calc.subtrair("5-5");
		assertEquals(0,subtrai);
	}

}
