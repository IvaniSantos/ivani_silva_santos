package questao6;

import javax.swing.JOptionPane;

public class CarteiraMotorista {

	public static void main(String[] args) {
		JOptionPane . showInputDialog ( " Digite seu nome " );
		int idade =  Integer.parseInt ( JOptionPane . showInputDialog ( " Digite sua idade " ));
		
		if (idade >= 18 ) {
			JOptionPane . showMessageDialog ( null , " Você pode para tirar carteira de motorista. " );
		} else {
			JOptionPane . showMessageDialog ( null , " Você não tem idade para tirar carteira de motorista. " );
		}

	}

}
