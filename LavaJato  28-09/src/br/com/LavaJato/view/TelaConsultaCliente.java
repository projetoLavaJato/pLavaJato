package br.com.LavaJato.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;

public class TelaConsultaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textConsultaCliente;
	private JLabel lblMarca;
	private JTextField txtMarca;
	private JTextField textModelo;
	private JTextField textPlaca;
	private JLabel lblModelo;
	private JLabel lblPlaca;
	private JLabel lblServio;
	private JLabel lblNome;
	private JTextField textField;
	private JLabel lblDescrio;
	private JTextField textDescricaoServico;
	private JLabel lblValor;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultaCliente frame = new TelaConsultaCliente();
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
	public TelaConsultaCliente() {
		setTitle("Consulta Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlacaDoVeiculotelefone = new JLabel("Placa do Veiculo/Telefone");
		lblPlacaDoVeiculotelefone.setBounds(21, 48, 170, 14);
		contentPane.add(lblPlacaDoVeiculotelefone);
		
		textConsultaCliente = new JTextField();
		textConsultaCliente.setBounds(21, 73, 262, 20);
		contentPane.add(textConsultaCliente);
		textConsultaCliente.setColumns(10);
		
		JButton btnConsultarCliente = new JButton("Consultar Cliente");
		btnConsultarCliente.setBounds(289, 72, 146, 23);
		contentPane.add(btnConsultarCliente);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setEnabled(false);
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setBounds(21, 126, 80, 14);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setEditable(false);
		txtMarca.setEnabled(false);
		txtMarca.setBounds(21, 145, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		textModelo = new JTextField();
		textModelo.setEnabled(false);
		textModelo.setEditable(false);
		textModelo.setColumns(10);
		textModelo.setBounds(116, 145, 86, 20);
		contentPane.add(textModelo);
		
		textPlaca = new JTextField();
		textPlaca.setEnabled(false);
		textPlaca.setEditable(false);
		textPlaca.setColumns(10);
		textPlaca.setBounds(212, 145, 86, 20);
		contentPane.add(textPlaca);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setEnabled(false);
		lblModelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo.setBounds(116, 126, 80, 14);
		contentPane.add(lblModelo);
		
		lblPlaca = new JLabel("Placa");
		lblPlaca.setEnabled(false);
		lblPlaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlaca.setBounds(212, 126, 86, 14);
		contentPane.add(lblPlaca);
		
		lblServio = new JLabel("Servi\u00E7o");
		lblServio.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblServio.setBounds(21, 210, 80, 29);
		contentPane.add(lblServio);
		
		lblNome = new JLabel("Nome");
		lblNome.setEnabled(false);
		lblNome.setBounds(21, 251, 86, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(21, 275, 181, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setEnabled(false);
		lblDescrio.setBounds(21, 306, 86, 14);
		contentPane.add(lblDescrio);
		
		textDescricaoServico = new JTextField();
		textDescricaoServico.setEnabled(false);
		textDescricaoServico.setEditable(false);
		textDescricaoServico.setColumns(10);
		textDescricaoServico.setBounds(20, 331, 182, 20);
		contentPane.add(textDescricaoServico);
		
		lblValor = new JLabel("Valor");
		lblValor.setEnabled(false);
		lblValor.setBounds(21, 362, 86, 14);
		contentPane.add(lblValor);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(21, 387, 86, 20);
		contentPane.add(textField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 210, 445, 2);
		contentPane.add(separator);
		
		JButton btnNovoServico = new JButton("Novo Servi\u00E7o");
		btnNovoServico.setEnabled(false);
		btnNovoServico.setBounds(281, 274, 139, 23);
		contentPane.add(btnNovoServico);
		
		JButton btnFinalizarServico = new JButton("Finalizar Servi\u00E7o");
		btnFinalizarServico.setEnabled(false);
		btnFinalizarServico.setBounds(281, 306, 139, 23);
		contentPane.add(btnFinalizarServico);
		
		JButton btnAlterarServico = new JButton("Alterar Servi\u00E7o");
		btnAlterarServico.setEnabled(false);
		btnAlterarServico.setBounds(281, 340, 139, 23);
		contentPane.add(btnAlterarServico);
		
		JButton btnNotaFiscal = new JButton("Nota Fiscal");
		btnNotaFiscal.setEnabled(false);
		btnNotaFiscal.setBounds(281, 374, 139, 23);
		contentPane.add(btnNotaFiscal);
	}
}
