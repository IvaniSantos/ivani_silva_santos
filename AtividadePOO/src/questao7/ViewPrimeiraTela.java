package questao7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPrimeiraTela extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrimeiraTela frame = new ViewPrimeiraTela();
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
	public ViewPrimeiraTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("CLIQUE AQUI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("\nNome Completo:\n"+textNome.getText());
				System.out.println("\nNome Cidade:\n"+textCidade.getText());
				
			}
		});
		btnNewButton.setBounds(196, 120, 110, 23);
		contentPane.add(btnNewButton);
		
		textNome = new JTextField();
		textNome.setBounds(117, 25, 189, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome Completo:");
		lblNewLabel.setBounds(156, 11, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Cidade:");
		lblNewLabel_1.setBounds(156, 56, 137, 14);
		contentPane.add(lblNewLabel_1);
		
		textCidade = new JTextField();
		textCidade.setBounds(117, 70, 190, 20);
		contentPane.add(textCidade);
		textCidade.setColumns(10);
	}
}
