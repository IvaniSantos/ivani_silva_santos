package questao8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewSexo extends JFrame {

	private JPanel contentPane;
	private JTextField Campo_Nome;
	protected JTextArea Campo_Resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSexo frame = new ViewSexo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewSexo() {
		setTitle("Definir Sexo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o Nome:");
		lblNewLabel.setBounds(10, 11, 101, 14);
		contentPane.add(lblNewLabel);
		
		Campo_Nome = new JTextField();
		Campo_Nome.setBounds(133, 8, 240, 20);
		contentPane.add(Campo_Nome);
		Campo_Nome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Informe o Sexo:");
		lblNewLabel_1.setBounds(10, 50, 117, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton Campo_Feminino = new JRadioButton("Feminino");
		Campo_Feminino.setBounds(133, 46, 109, 23);
		contentPane.add(Campo_Feminino);
		
		JRadioButton Campo_Masculino = new JRadioButton("Masculino");
		Campo_Masculino.setBounds(264, 46, 109, 23);
		contentPane.add(Campo_Masculino);
		
		JButton Campo_Verificar = new JButton("Verificar");
		Campo_Verificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nome=Campo_Nome.getText();
				if(Campo_Feminino.isSelected()) {
					JOptionPane . showMessageDialog(null,"\n"+"Nome: "+Nome+"\n"+"Sexo: Feminino");
				} else {
					if(Campo_Masculino.isSelected()) {
						JOptionPane . showMessageDialog(null,"\n"+"Nome: "+Nome+"\n"+"Sexo: Masculino");
				}
				}
				} 
				});
		
		Campo_Verificar.setBounds(192, 93, 89, 23);
		contentPane.add(Campo_Verificar);
	}
}
