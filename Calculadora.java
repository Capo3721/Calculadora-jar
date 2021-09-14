//Main
package com.teste;

public class Calculadora {
	
	public int subtrair(String expressao) {
		int subtrai = 10;
		for (String valorSubtrair : expressao.split("\\-"))
			subtrai -= Integer.valueOf(valorSubtrair);
			//System.out.println(subtrai);
		
		System.out.println(subtrai);
		return subtrai;
		
	}

}
