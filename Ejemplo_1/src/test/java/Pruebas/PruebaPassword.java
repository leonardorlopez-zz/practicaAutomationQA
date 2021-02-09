package Pruebas;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class PruebaPassword {

	public static void main(String[] args) {
		//Le pido al usuario que ingrese la password
		JPasswordField contr = new JPasswordField();
		
		
		String password = JOptionPane.showInputDialog(null, "Ingrese la password" );
        Encriptacion cript = new Encriptacion();
        
        System.out.println(cript.MD5(password));
		
		
	}

}
