package br.com.LavaJato.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Lava Jato 6 Irm\u00E3os");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		JMenuItem menuCadastraCliente = new JMenuItem("Cadastra");
		menuCadastraCliente.addActionListener(new ActionListener() { // Ação para o Menu CadastraCliente
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaCadastroCliente().setVisible(true);// Acesso a TelaCadastroCliente
				
			}
		});
		mnCliente.add(menuCadastraCliente);
		
		JMenuItem menuConsultarCliente = new JMenuItem("Consultar");
		menuConsultarCliente.addActionListener(new ActionListener() { // Ação para o Menu ConsultarCliente
			public void actionPerformed(ActionEvent e) {
				
				new TelaConsultaCliente().setVisible(true); //Acesso a TelaConsultaCliente
			}
		});
		mnCliente.add(menuConsultarCliente);
		
		JMenu mnFuncionario = new JMenu("Funcionario");
		menuBar.add(mnFuncionario);
		
		JMenuItem menuCadastraFuncionario = new JMenuItem("Cadastra");
		mnFuncionario.add(menuCadastraFuncionario);
	}
}
