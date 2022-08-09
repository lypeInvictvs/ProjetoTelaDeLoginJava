package br.felype.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.DropMode;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.security.PublicKey;
import java.awt.Toolkit;

public class TelaLogin extends JFrame {

	// Definindo area da tela
	int xMouse, yMouse;

	private JPanel PaineldeBackground;
	private JTextField InsiraSeuNome;
	private JPasswordField SenhaLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		// Configuracoes JFrame
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(TelaLogin.class.getResource("/br/felype/login/imagens/alien-monster_1f47e (1).png")));
		setUndecorated(true);
		setLocationByPlatform(true);
		setForeground(Color.BLACK);
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(800, 500);

		// Adicionando Painel de Fundo e configurando o layout
		PaineldeBackground = new JPanel();
		setContentPane(PaineldeBackground);
		PaineldeBackground.setLayout(null);

		// Adicionar Painel Principal
		JPanel PainelPrincipal = new JPanel();
		// Configurar Painel Principal
		PainelPrincipal.setBorder(null);
		PainelPrincipal.setBackground(Color.WHITE);
		PainelPrincipal.setBounds(0, 0, 413, 500);
		PainelPrincipal.setLayout(null);

		// Adicionando Painel principal ao Painel de fundo
		PaineldeBackground.add(PainelPrincipal);

		// Adicionando e configurando separadores
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(35, 287, 334, 2);
		PainelPrincipal.add(separator_1);
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(35, 229, 334, 2);
		PainelPrincipal.add(separator_2);

		// Adicionando label Login
		JLabel lb_Login = new JLabel("LOGIN");
		// Configurando label Login
		lb_Login.setBackground(Color.BLACK);
		lb_Login.setFont(new Font("Roboto", Font.PLAIN, 28));
		lb_Login.setForeground(Color.BLACK);
		lb_Login.setBounds(159, 46, 86, 35);

		// Adicionando label Login ao Painel Principal
		PainelPrincipal.add(lb_Login);

		// Adicionando label NomeEmpresa
		JLabel lb_NomeEmpresa = new JLabel("GoSpace Group Corporation");
		// Configurando label NomeEmpresa
		lb_NomeEmpresa.setBackground(Color.BLACK);
		lb_NomeEmpresa.setForeground(Color.BLACK);
		lb_NomeEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
		lb_NomeEmpresa.setBounds(120, 447, 176, 17);
		lb_NomeEmpresa.setFont(new Font("Roboto", Font.PLAIN, 11));

		// Adicionando label NomeEmpresa ao Painel Principal
		PainelPrincipal.add(lb_NomeEmpresa);

		// Adicionando label Iniciar Sessao
		JLabel lb_IniciarSessao = new JLabel("INICIAR SESSÃO");
		// Configurando label Iniciar Sessao
		lb_IniciarSessao.setForeground(Color.BLACK);
		lb_IniciarSessao.setFont(new Font("Roboto", Font.PLAIN, 20));
		lb_IniciarSessao.setBounds(35, 128, 197, 24);

		// Adicionando label Iniciar Sessao ao Painel Princpal
		PainelPrincipal.add(lb_IniciarSessao);

		// Adicionando label "NomeUsuario"
		JLabel lb_NomeUsuario = new JLabel("NOME");
		// Configurando label "NomeUsuario"
		lb_NomeUsuario.setFont(new Font("Roboto", Font.PLAIN, 11));
		lb_NomeUsuario.setForeground(Color.BLACK);
		lb_NomeUsuario.setBounds(35, 184, 49, 14);

		// Adicionando label "NomeUsuario" ao Painel Principal
		PainelPrincipal.add(lb_NomeUsuario);

		// Adicionando label "SenhaUsuario"
		JLabel lb_Senha = new JLabel("SENHA");
		// Configurando label "SenhaUsuario"
		lb_Senha.setForeground(Color.BLACK);
		lb_Senha.setFont(new Font("Roboto", Font.PLAIN, 11));
		lb_Senha.setBounds(35, 242, 49, 14);

		// Adicionando label "SenhaUsuario" ao Painel Principal
		PainelPrincipal.add(lb_Senha);

		// Adicionando JTextField "InsiraSeuNome"
		InsiraSeuNome = new JTextField();
		// Configurando JTextField "InsiraSeuNome"
		InsiraSeuNome.setBorder(null);
		InsiraSeuNome.setForeground(Color.GRAY);
		InsiraSeuNome.setFont(new Font("Roboto", Font.PLAIN, 13));
		InsiraSeuNome.setText("Insira seu nome");
		InsiraSeuNome.setBounds(35, 209, 334, 20);
		InsiraSeuNome.setColumns(10);

		// Adicionando JTextField "InsiraSeuNome" ao Painel Principal
		PainelPrincipal.add(InsiraSeuNome);

		// Adicionando JPasswordField "SenhaLogin"
		SenhaLogin = new JPasswordField();
		// Configurando JPasswordField "SenhaLogin"
		SenhaLogin.setForeground(Color.GRAY);
		SenhaLogin.setText("●●●●●●●●●●");
		SenhaLogin.setBorder(null);
		SenhaLogin.setBounds(35, 267, 334, 20);

		// Adicionando JPasswordField "SenhaLogin" ao Painel Principal
		PainelPrincipal.add(SenhaLogin);

		// Adicionando efeito PlaceHolder
		InsiraSeuNome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				boolean textoVazio = InsiraSeuNome.getText().equals("Insira seu nome");
				if (textoVazio) {
					InsiraSeuNome.setText("");
					InsiraSeuNome.setForeground(Color.BLACK);
				}
			}
		});

		SenhaLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				boolean senhaVazio = String.valueOf(SenhaLogin.getPassword()).equals("●●●●●●●●●●");
				if (senhaVazio) {
					SenhaLogin.setText("");
					SenhaLogin.setForeground(Color.BLACK);
				}
			}
		});

		InsiraSeuNome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {

				boolean textoVazio = InsiraSeuNome.getText().equals("");
				if (textoVazio) {
					InsiraSeuNome.setText("Insira seu nome");
					InsiraSeuNome.setForeground(Color.GRAY);
				}
			}
		});

		SenhaLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {

				boolean senhaVazia = String.valueOf(SenhaLogin.getPassword()).equals("");
				if (senhaVazia) {
					SenhaLogin.setText("●●●●●●●●●●");
					SenhaLogin.setForeground(Color.GRAY);
				}
			}
		});

		// Adicionando animação do botão
		JPanel btn_Acessar = new JPanel();
		btn_Acessar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Acessar.setBackground(Color.GREEN);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_Acessar.setBackground(Color.BLACK);
			}
		});

		// Configuração de interação
		JPanel panel_Interacao = new JPanel();
		panel_Interacao.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

		panel_Interacao.setBackground(Color.WHITE);
		panel_Interacao.setBounds(0, 0, 800, 35);
		PainelPrincipal.add(panel_Interacao);
		panel_Interacao.setLayout(null);

		//Movendo JFrame pelo panel_Interacao
		panel_Interacao.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent evt) {
				xMouse = evt.getX();
				yMouse = evt.getY();
			}
		});

		panel_Interacao.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				int x = evt.getXOnScreen();
				int y = evt.getYOnScreen();
				setLocation(x - xMouse, y - yMouse); // A localização do JFrame segue o mouse
			}
		});

		// BTN
		JPanel panel_Sair = new JPanel();
		JLabel lb_IconeSair = new JLabel("X");
		
		//Adicionando botão sair
		Btn_Sair(panel_Sair, lb_IconeSair, panel_Interacao);

		btn_Acessar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Acessar.setBorder(null);
		btn_Acessar.setBackground(Color.BLACK);
		btn_Acessar.setForeground(Color.BLACK);
		btn_Acessar.setBounds(159, 334, 86, 33);
		PainelPrincipal.add(btn_Acessar);
		btn_Acessar.setLayout(null);

		JLabel lbl_Acessar = new JLabel("ACESSAR");

		lbl_Acessar.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Acessar.setForeground(Color.WHITE);
		lbl_Acessar.setFont(new Font("Roboto", Font.PLAIN, 13));
		lbl_Acessar.setBounds(0, 0, 86, 33);
		btn_Acessar.add(lbl_Acessar);

		// Adicionando CopyRight
		JLabel lbl_CopyRights = new JLabel("COPYRIGHT © 2022. ALL RIGTHS RESERVED");
		lbl_CopyRights.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CopyRights.setFont(new Font("Roboto", Font.PLAIN, 7));
		lbl_CopyRights.setBounds(86, 461, 252, 14);
		PainelPrincipal.add(lbl_CopyRights);

		// Adicionando animação à lbl_EsquecerSenha
		JLabel lbl_EsquecerSenha = new JLabel("Esqueceu senha?");
		lbl_EsquecerSenha.setFont(new Font("Roboto", Font.PLAIN, 8));
		lbl_EsquecerSenha.setBounds(35, 298, 75, 14);
		PainelPrincipal.add(lbl_EsquecerSenha);
		lbl_EsquecerSenha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_EsquecerSenha.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lbl_EsquecerSenha.setForeground(Color.BLACK);
			}
		});

		JLabel lbl_logo = new JLabel("                 ");
		lbl_logo.setIcon(
				new ImageIcon(TelaLogin.class.getResource("/br/felype/login/imagens/alien-monster_1f47e (1).png")));
		lbl_logo.setBounds(86, 404, 41, 103);
		PainelPrincipal.add(lbl_logo);

		JLabel lb_ImageBackground = new JLabel("");
		lb_ImageBackground.setIcon(new ImageIcon(TelaLogin.class.getResource(
				"/br/felype/login/imagens/fan-response-to-biomutant-game-status-statement-is-positive_77jg (1).png")));
		lb_ImageBackground.setBounds(180, 0, 647, 500);
		PaineldeBackground.add(lb_ImageBackground);

	}

	public static void Btn_Sair(JPanel panel_Sair, JLabel lb_IconeSair, JPanel painel_interacao) {
		// Estilizando botao

		panel_Sair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lb_IconeSair.setForeground(Color.BLACK);
		panel_Sair.setBounds(0, 0, 36, 35);

		panel_Sair.setLayout(null);
		panel_Sair.setBackground(Color.WHITE);
		panel_Sair.add(lb_IconeSair);

		panel_Sair.setBounds(0, 0, 36, 35);
		painel_interacao.add(panel_Sair);

		panel_Sair.setLayout(null);
		panel_Sair.setBackground(Color.WHITE);
		panel_Sair.add(lb_IconeSair);

		lb_IconeSair.setHorizontalAlignment(SwingConstants.CENTER);
		lb_IconeSair.setPreferredSize(new Dimension(40, 40));
		lb_IconeSair.setFont(new Font("Roboto Light", Font.PLAIN, 25));
		lb_IconeSair.setBounds(0, 1, 36, 34);

		// Eventos "Botao Sair"
		lb_IconeSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_Sair.setBackground(Color.GREEN);
				lb_IconeSair.setForeground(Color.WHITE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel_Sair.setBackground(Color.WHITE);
				lb_IconeSair.setForeground(Color.BLACK);
			}
		});

		lb_IconeSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
	}
}
