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
	
	public double percentualNeg(String expressao) {
	    double produto = 240;
	    double aux = produto;
	    double total = 0;
	    
	   
	    for (String valorDividir : expressao.split("\\;"))
		    produto /= Integer.valueOf(valorDividir);
	    	total = aux - produto;
				
	    return total;
	    	
	}
	public double percentualPos(String expressao) {
	    double produto = 240;
	    double aux = produto;
	    double total = 0;
	    
	   String sinal = "+";
	    for (String valorDividir : expressao.split("\\;"))
	    	
		    if (sinal == "+") {
	    	produto /= Integer.valueOf(valorDividir);
	    	total = aux + produto;
		    }
				
	    return total;
	    	
	}
	public double exponenciacao (String expressao) {
	    double exp = 3;
	    double aux = 0;
	    for (String valorExp : expressao.split("\\;"))
	    	aux = Double.valueOf(valorExp);
	    	exp = Math.pow(exp, aux);
	    	
			
	    return exp;
	}
	public double raiz (String expressao) {
	    double raizq = 0;
	    double aux = 0;
	    for (String valorRaiz : expressao.split("\\;"))
	    	aux = Double.valueOf(valorRaiz);
	        raizq = Math.sqrt(aux);    	
			
	    return raizq;
	}
		

}
