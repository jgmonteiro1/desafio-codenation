package com.jgmonteiro.desafiocodenation.criptografia;

public class CifraCesar {
		
	   public static String decifra(String cifrado, int numeroDeCasas) {
		   
		   StringBuilder decifrado = new StringBuilder();
		   int ascii;
		   for(int i = 0; i<cifrado.length();i++) {
			   ascii = cifrado.charAt(i) - numeroDeCasas;
			 
			   decifrado.append((char)ascii);
		   }
		   
		   return decifrado.toString();
	   }

}
