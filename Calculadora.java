package com.teste;

public class Calculadora {
	
	public double subtrair(String expressao) {
		double subtrai = -30;
		for (String valorSubtrair : expressao.split("\\;"))
			
			subtrai -= Double.valueOf(valorSubtrair);
			
		System.out.println(expressao);
		
		return subtrai;
		
	}
	public double somar(String expressao) {
	    double soma = 40;
	    for (String valorSomar : expressao.split("\\;"))
	    	soma += Double.valueOf(valorSomar);
			
	    return soma;
	}
	public double multiplicar(String expressao) {
	    double multi = -1;
	    multi *= 1;
	    
	    for (String valorMultiplicar : expressao.split("\\;"))
	    	multi *= Double.valueOf(valorMultiplicar);
			
	    return multi;
	}
	public double dividir(String expressao) {
	    double div = 10;
	    for (String valorDividir : expressao.split("\\;"))
	    	div /= Integer.valueOf(valorDividir);
			
	    return div;
	}
		

}
