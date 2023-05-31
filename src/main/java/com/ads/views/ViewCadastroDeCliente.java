package com.ads.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ViewCadastroDeCliente {

	private JFrame frmCadastro;
	private JTextField tf_end;
	private JTextField tf_cpf;
	private JTextField tf_email;
	private JTextField tf_telefone;
	private JTextField tf_nome;
	private JTextField tf_cidade;
	private JTextField tf_estado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastroDeCliente window = new ViewCadastroDeCliente();
					window.frmCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewCadastroDeCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastro = new JFrame();
		frmCadastro.setTitle("EmpreGET");
		frmCadastro.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmCadastro.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(20, 20, 156, 13);
		frmCadastro.getContentPane().add(lblNewLabel);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCPF.setBounds(20, 79, 49, 13);
		frmCadastro.getContentPane().add(lblCPF);
		
		tf_end = new JTextField();
		tf_end.setBounds(86, 131, 335, 19);
		frmCadastro.getContentPane().add(tf_end);
		tf_end.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(20, 54, 49, 13);
		frmCadastro.getContentPane().add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefone.setBounds(291, 79, 75, 13);
		frmCadastro.getContentPane().add(lblTelefone);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(20, 104, 75, 13);
		frmCadastro.getContentPane().add(lblEmail);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEndereco.setBounds(20, 131, 75, 13);
		frmCadastro.getContentPane().add(lblEndereco);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCidade.setBounds(20, 160, 75, 13);
		frmCadastro.getContentPane().add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEstado.setBounds(275, 160, 75, 13);
		frmCadastro.getContentPane().add(lblEstado);
		
		tf_cpf = new JTextField();
		tf_cpf.setBounds(87, 77, 194, 19);
		frmCadastro.getContentPane().add(tf_cpf);
		tf_cpf.setColumns(10);
		
		tf_email = new JTextField();
		tf_email.setColumns(10);
		tf_email.setBounds(86, 102, 447, 19);
		frmCadastro.getContentPane().add(tf_email);
		
		tf_telefone = new JTextField();
		tf_telefone.setColumns(10);
		tf_telefone.setBounds(359, 77, 174, 19);
		frmCadastro.getContentPane().add(tf_telefone);
		
		tf_nome = new JTextField();
		tf_nome.setColumns(10);
		tf_nome.setBounds(87, 54, 447, 19);
		frmCadastro.getContentPane().add(tf_nome);
		
		tf_cidade = new JTextField();
		tf_cidade.setColumns(10);
		tf_cidade.setBounds(86, 160, 179, 19);
		frmCadastro.getContentPane().add(tf_cidade);
		
		tf_estado = new JTextField();
		tf_estado.setColumns(10);
		tf_estado.setBounds(341, 160, 50, 19);
		frmCadastro.getContentPane().add(tf_estado);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(118, 217, 133, 21);
		frmCadastro.getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelar.setBounds(307, 217, 133, 21);
		frmCadastro.getContentPane().add(btnCancelar);
		frmCadastro.setBounds(100, 100, 569, 296);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
