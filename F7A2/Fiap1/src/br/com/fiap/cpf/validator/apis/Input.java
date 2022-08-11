package br.com.fiap.cpf.validator.apis;

import javax.swing.JOptionPane;

public class Input {
	public static void info(String msg) {
		try {
		JOptionPane.showInternalMessageDialog(null, msg);
		}catch(NumberFormatException e) {
			System.out.println("Digite apenas números por favor");
			info(msg);
		}
	}
	public static String text(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int integer(String msg) {
		try {
		return Integer.parseInt(text(msg).toUpperCase());
	}catch(NumberFormatException e) {
		System.out.println("Por Favor Digite apenas números");
		info("Por Favor Digite apenas números");
		return integer(msg);
	}catch(NullPointerException e) {
		return 0;
	}
	}
	
	public static double decimalD(String msg) {
		return Double.parseDouble(text(msg).toUpperCase());
	}
	
	public static float decimal(String msg) {
		return Float.parseFloat(text(msg).toUpperCase());
	}
	
	public static char caracter(String msg) {
		return text(msg).toUpperCase().charAt(0);
	}
	
	public static boolean logic(String msg) {
		if(JOptionPane.showConfirmDialog(null, msg, "Question", JOptionPane.YES_NO_OPTION) == 0) {
			return true;
		}
		return false;
	}

}
