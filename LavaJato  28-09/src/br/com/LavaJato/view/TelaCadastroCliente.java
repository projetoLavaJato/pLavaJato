package br.com.LavaJato.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textCliente;
	private JTextField textTelefone;
	private JTextField textEndereco;
	private JTextField textPlaca;
	private JTextField textEmail;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
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
	public TelaCadastroCliente() {
		setBackground(Color.LIGHT_GRAY);
		setTitle(" Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 427, 288);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(25, 26, 46, 14);
		contentPane.add(lblCliente);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(279, 26, 62, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblMarca = new JLabel("Endere\u00E7o");
		lblMarca.setBounds(25, 131, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(147, 131, 46, 14);
		contentPane.add(lblModelo);
		
		JButton btnCancelarCadastro = new JButton("Cancelar Cadastro");
		btnCancelarCadastro.setBounds(40, 210, 151, 23);
		contentPane.add(btnCancelarCadastro);
		
		JButton btnRegistrarCliente = new JButton("Registrar Cliente");
		btnRegistrarCliente.setBounds(217, 210, 145, 23);
		contentPane.add(btnRegistrarCliente);
		
		textCliente = new JTextField();
		textCliente.setBounds(25, 51, 233, 20);
		contentPane.add(textCliente);
		textCliente.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(278, 51, 116, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(25, 156, 105, 20);
		contentPane.add(textEndereco);
		textEndereco.setColumns(10);
		
		textPlaca = new JTextField();
		textPlaca.setBounds(147, 156, 88, 20);
		contentPane.add(textPlaca);
		textPlaca.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(25, 82, 46, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(25, 100, 233, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(279, 82, 46, 14);
		contentPane.add(lblCPF);
		
		textField = new JTextField();
		textField.setBounds(278, 100, 116, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(260, 131, 46, 14);
		contentPane.add(lblPlaca);
		
		textField_1 = new JTextField();
		textField_1.setBounds(255, 156, 107, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
