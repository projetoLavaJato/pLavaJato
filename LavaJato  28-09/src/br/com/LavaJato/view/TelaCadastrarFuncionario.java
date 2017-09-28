package br.com.LavaJato.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSpinner;

public class TelaCadastrarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarFuncionario frame = new TelaCadastrarFuncionario();
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
	public TelaCadastrarFuncionario() {
		setTitle("Cadastrar Funcionario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 469, 296);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(28, 25, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(28, 50, 233, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(278, 25, 46, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(278, 50, 146, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(28, 91, 46, 14);
		contentPane.add(lblSalario);
		
		textField_2 = new JTextField();
		textField_2.setBounds(28, 116, 126, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(213, 91, 89, 14);
		contentPane.add(lblEndereco);
		
		textField_3 = new JTextField();
		textField_3.setBounds(213, 116, 209, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCadastra = new JButton("Cadastra");
		btnCadastra.setBounds(323, 222, 89, 23);
		contentPane.add(btnCadastra);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(213, 222, 89, 23);
		contentPane.add(btnNovo);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(28, 147, 46, 14);
		contentPane.add(lblTelefone);
		
		textField_4 = new JTextField();
		textField_4.setBounds(28, 172, 126, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(213, 172, 29, 20);
		contentPane.add(spinner);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(213, 147, 46, 14);
		contentPane.add(lblTipo);
	}
}
