package com.teste;

public class Calculadora {
	
	public float subtrair(String expressao) {
		float subtrai = 10;
		for (String valorSubtrair : expressao.split("\\,"))
			subtrai -= Integer.valueOf(valorSubtrair);
			
		
		System.out.println(subtrai);
		return subtrai;
		
	}
	public int somar(String expressao) {
	    int soma = 10;
	    for (String valorSomar : expressao.split("\\,"))
	    	soma += Integer.valueOf(valorSomar);
			
	    System.out.println(soma);
	    return soma;
	}
	public int multiplicar(String expressao) {
	    int multi = 1;
	    for (String valorMultiplicar : expressao.split("\\,"))
	    	multi *= Integer.valueOf(valorMultiplicar);
			
	    System.out.println(multi);
	    return multi;
	}
	public int dividir(String expressao) {
	    int div = 10;
	    for (String valorDividir : expressao.split("\\,"))
	    	div /= Integer.valueOf(valorDividir);
			
	    System.out.println(div);
	    return div;
	}
		

}
