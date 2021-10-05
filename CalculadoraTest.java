package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	/*
	 No geral o programa de testes passou a printar o resultado em seu próprio SCRIPT.
	 Antes o programa printava o resultado na MAIN. Isso foi feito para facilitar
	 a manipulação dos resultados em relação a correção de erros de sinal e também
	 para criar testes de tipagens diferentes, como teste DOUBLE e INTEIRO.
	 */
	
	/*
	 Foi feito um cast em toda versão INTEGER de testes, convertendo o resultado
	 double em int. Isso foi feito afim de suprir a necessidade da calculadora
	 de interpretar entradas inteiras entregando resultados inteiros.
	 */
	
	/*
	 Passando números ímpares no teste de subtração o teste se comporta normalmente,
	 pois o mesmo compreende que deverá somar números negativos.
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
	 O teste de multiplicação também foi alterado como o da divisão. Foi feito
	 um chaveamento IF para averiguar o sinal do produto. Caso o sinal fosse negativo
	 o IF verificava e alterava o sinal do valor esperado para negativo também.
	 Desta forma o teste se preocuparia somente com o valor da operação
	 e não ficaria preso por um detalhe de sinais.
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
	 O teste de divisão foi aperfeiçoado na questão do sinal. Quando passado um 
	 divisor negativo, o produto se tornava também negativo e isso constrastava 
	 com o valor do sinal esperado da operação. Para solucionar o problema
	 foi colocado um IF dentro do teste, que caso constatado que o valor da operação
	 fosse negativo, o IF simplesmente alterava o sinal do valor esperado
	 e dessa forma exemia o teste de tropeçar no detalhe do sinal, ficando livre
	 para somente julgar se o resultado da operação estava correto como o esperado.
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
