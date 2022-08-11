package br.com.fiap.cpfvalidator.util;

import br.com.fiap.cpf.validator.apis.Input;

public interface CpfV {

	public static void cpfValidator(int cpf[]) {
		System.out.println("-----CPF VALIDATOR------");
		int contador = 10, firstDig = 0, secDig =0, somaCpf = 0, moduloCpf = 0, digDiv = 0;
		
		
		//PRIMEIRO DIGITO
		for(int i=0;i<9;i++) {
			somaCpf = somaCpf + (cpf[i] * contador);
			contador--;
			
		}
		digDiv = somaCpf / 11;
		moduloCpf = somaCpf % 11;
		
		if(moduloCpf < 2) {
			cpf[9] = 0;
		}else {
		 	firstDig = 11 - moduloCpf;
		 	cpf[9] = firstDig;
		}
		
		// SEGUNDO DIGITO
		
		somaCpf =0;
		contador = 11;
		for(int i=0;i<10;i++) {
			somaCpf = somaCpf + (cpf[i] * contador);
			contador--;
			
		}
		digDiv = somaCpf / 11;
		moduloCpf = somaCpf % 11; 
		
		if(moduloCpf < 2) {
			cpf[10] = 0;
		}else {
		 	secDig = 11 - moduloCpf;
		 	cpf[10] = secDig;
		}
		
		for(int i=0;i<cpf.length;i++) {
			System.out.print(cpf[i]);
		}
		System.out.println();
		Input.info("OS ÚLTIMOS DIGITOS GERADOS PARA O CPF INFORMADO SÃO " + firstDig + " e " + secDig);
	}
	
	public static void cpfLastDigitValidation(int cpf[]) {
		System.out.println("-----CPF VERIFICATION------");

		int contador = 10, firstDig = 0, secDig =0, somaCpf = 0, moduloCpf = 0, digDiv = 0;
		boolean stValidation, ndValidation;
		
		
		//PRIMEIRO DIGITO
		for(int i=0;i<9;i++) {
			somaCpf = somaCpf + (cpf[i] * contador);
			contador--;
			
		}
		digDiv = somaCpf / 11;
		moduloCpf = somaCpf % 11;
		
		if(moduloCpf < 2 && cpf[9] == 0 || cpf[9] == 11 - moduloCpf) {
			stValidation = true;
		}else {
	
		 stValidation = false;
		}
		
		// SEGUNDO DIGITO
		
		somaCpf =0;
		contador = 11;
		for(int i=0;i<10;i++) {
			somaCpf = somaCpf + (cpf[i] * contador);
			contador--;
			
		}
		digDiv = somaCpf / 11;
		moduloCpf = somaCpf % 11; 
		
		if(moduloCpf < 2 && cpf[10] == 0 || cpf[10] == 11 - moduloCpf) {

			ndValidation = true;
		}else {
		 ndValidation = false;
		}
		
		if(stValidation && ndValidation) {
			System.out.println("O CPF INFORMADO É VÁLIDO ");
			Input.info("O CPF INFORMADO É VÁLIDO");
		}else {
			System.out.println("O CPF INFORMADO NÃO É VÁLIDO");
			Input.info("O CPF INFORMADO NÃO É VÁLIDO");
		}
		
		for(int i=0;i<cpf.length;i++) {
			System.out.print(cpf[i]);
		}
		System.out.println();
	}
	
	public static void typeCpf(int[] cpf, int option) {
		if(option == 1) {try {
			for(int i=0;i<cpf.length-2;i++) {
				cpf[i] = (Input.integer("Digite (usando apenas números) o CPF que deseja validar: "));
				
				}
		}catch(NumberFormatException e) {
			System.out.println("Por Favor Digite apenas números");
			Input.info("Por Favor Digite apenas números");
			for(int i=0;i<cpf.length;i++) {
				cpf[i] = (Input.integer("Digite (usando apenas números) o CPF que deseja validar: "));
				
				}
		}	
		}else {
		try {
			for(int i=0;i<cpf.length;i++) {
				cpf[i] = (Input.integer("Digite (usando apenas números) o CPF que deseja validar: "));
				
				}
		}catch(NumberFormatException e) {
			System.out.println("Por Favor Digite apenas números");
			Input.info("Por Favor Digite apenas números");
			for(int i=0;i<cpf.length;i++) {
				cpf[i] = (Input.integer("Digite (usando apenas números) o CPF que deseja validar: "));
				
				}
			
		}
	}
	}

	public static int startProgram(int option) {
		option = Input.integer("VALIDAR CPF = 1 "
				+ " VERIFICAR SE O CPF É VALIDO = 2 " + "SAIR = 0");
		return option;
	}
}
