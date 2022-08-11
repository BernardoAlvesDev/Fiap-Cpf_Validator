package br.com.fiap.cpfvalidator;
import br.com.fiap.cpf.validator.apis.Input;
import br.com.fiap.cpfvalidator.util.CpfV;

public class Main {

	public static void main(String[] args) {
		int cpf[] = new int[11], option = 0;


		Input.info("Atenção digite um número de cada vez");
		option = CpfV.startProgram(option);
		
		switch(option) {
		
		case 0:
			Input.info("Obrigado por me  ultilizar");
			break;
		
		case 1:
			Input.info("Digite os 9 números do CPF que deseja saber os digitos verificadores");
			CpfV.typeCpf(cpf, option);
			CpfV.cpfValidator(cpf);
			break;
			
		case 2:
			CpfV.typeCpf(cpf, option);
			CpfV.cpfLastDigitValidation(cpf);
			break;
			
		default:
			Input.info("Opção não existente");
		}
		
		
	}
}