package myNotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Window.Type;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class MyNotes {

	private JFrame frmRegistroDeLigaes;
	private JTextField txtData;
	private JTextField txtHora;
	private JTextField txtDuracao;
	private JTextField txtNomeArq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyNotes window = new MyNotes();
					window.frmRegistroDeLigaes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyNotes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDeLigaes = new JFrame();
		frmRegistroDeLigaes.getContentPane().setBackground(new Color(144, 238, 144));
		frmRegistroDeLigaes.setBackground(new Color(144, 238, 144));
		frmRegistroDeLigaes.setTitle("Registro de Liga\u00E7\u00F5es");
		frmRegistroDeLigaes.setResizable(false);
		frmRegistroDeLigaes.setType(Type.UTILITY);
		frmRegistroDeLigaes.setBounds(100, 100, 315, 175);
		frmRegistroDeLigaes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeLigaes.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(8, 161, 291, 340);
		frmRegistroDeLigaes.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 13, 69, 14);
		lblData.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblData);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setBounds(10, 40, 69, 14);
		lblHora.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblHora);
		
		txtData = new JTextField();
		txtData.setBounds(89, 8, 179, 20);
		txtData.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtData.setEnabled(false);
		txtData.setColumns(10);
		panel.add(txtData);
		
		txtHora = new JTextField();
		txtHora.setBounds(89, 34, 179, 20);
		txtHora.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtHora.setEnabled(false);
		txtHora.setColumns(10);
		panel.add(txtHora);
		
		txtDuracao = new JTextField();
		txtDuracao.setBounds(89, 61, 179, 20);
		txtDuracao.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtDuracao.setEnabled(false);
		txtDuracao.setColumns(10);
		panel.add(txtDuracao);
		
		JLabel lblDuracao = new JLabel("Dura\u00E7\u00E3o:");
		lblDuracao.setBounds(10, 67, 69, 14);
		lblDuracao.setFont(new Font("Calibri", Font.PLAIN, 18));
		panel.add(lblDuracao);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 148, 271, 176);
		panel.add(scrollPane_1);
		
		JTextArea txtRegistro = new JTextArea();
		txtRegistro.setFont(new Font("Calibri", Font.PLAIN, 20));
		scrollPane_1.setViewportView(txtRegistro);
		
		JLabel lblNomeArq = new JLabel("Nome do Arquivo:");
		lblNomeArq.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNomeArq.setBounds(10, 92, 258, 14);
		panel.add(lblNomeArq);
		
		txtNomeArq = new JTextField();
		txtNomeArq.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtNomeArq.setColumns(10);
		txtNomeArq.setBounds(10, 117, 258, 20);
		panel.add(txtNomeArq);
		
		JButton btnNovoAtendimento = new JButton("Registrar Liga\u00E7\u00E3o");
	
		btnNovoAtendimento.setBackground(new Color(224, 255, 255));
		btnNovoAtendimento.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNovoAtendimento.setIcon(new ImageIcon(MyNotes.class.getResource("/image/icons8-telefone-50.png")));
		btnNovoAtendimento.setBounds(10, 11, 289, 59);
		frmRegistroDeLigaes.getContentPane().add(btnNovoAtendimento);
		
		JButton btnSalvar = new JButton("Salvar");
		
		btnSalvar.setBackground(new Color(135, 206, 250));
		btnSalvar.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnSalvar.setIcon(new ImageIcon(MyNotes.class.getResource("/image/icons8-salvar-como-50.png")));
		btnSalvar.setBounds(164, 512, 135, 53);
		frmRegistroDeLigaes.getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		
		btnCancelar.setBackground(new Color(244, 164, 96));
		btnCancelar.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnCancelar.setIcon(new ImageIcon(MyNotes.class.getResource("/image/icons8-excluir-50.png")));
		btnCancelar.setBounds(8, 512, 146, 53);
		frmRegistroDeLigaes.getContentPane().add(btnCancelar);
		
		JButton btnAbrirRegistro = new JButton("Abrir Registro");
		btnAbrirRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAbrirRegistro.setIcon(new ImageIcon(MyNotes.class.getResource("/image/icons8-abrir-pasta-50.png")));
		btnAbrirRegistro.setFont(new Font("Calibri", Font.BOLD, 20));
		btnAbrirRegistro.setBackground(new Color(240, 230, 140));
		btnAbrirRegistro.setBounds(8, 81, 291, 59);
		frmRegistroDeLigaes.getContentPane().add(btnAbrirRegistro);
		
		btnNovoAtendimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//frmRegistroDeLigaes.setBounds(100, 100, largura, altura);
				
				frmRegistroDeLigaes.setBounds(100, 100, 315, 600);
				btnNovoAtendimento.setEnabled(false);
				btnAbrirRegistro.setEnabled(false);
				
				Date data = new Date();
				SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");				
				txtData.setText(String.valueOf(formatador.format(data)));
				
				SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");				
				txtHora.setText(String.valueOf(format.format(data)));				
				
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNovoAtendimento.setEnabled(true);
				frmRegistroDeLigaes.setBounds(100, 100, 315, 175);
				btnAbrirRegistro.setEnabled(true);
			}
			
			
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				
				int contadorErro = 0;
				String erro = "";
				
				if (txtNomeArq.getText().isEmpty())	{
					contadorErro ++;
					erro += "NOME DO ARQUIVO\n";
				}
					
				if (txtRegistro.getText().isEmpty()) {
					contadorErro ++;
					erro += "REGISTRO DA LIGAÇÃO\n\n";
				}
				
				if (contadorErro > 0)
				{
					JOptionPane.showConfirmDialog(null, "<html><body>PREENCHA OS CAMPOS ABAIXO LISTADOS: <br><br>" +erro, 
							"DADOS FALTANTES", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
					
				}else {
					
					
					switch (JOptionPane.showConfirmDialog(null, "<html>Os dados informados estão corretos? <br>" 
					+ "Data: " + txtData.getText() 
					+ "<br>" +"Hora: " + txtHora.getText() 
					+ "<br>" + "Nome do Arquivo: " + txtNomeArq.getText()  
					+ "<br>" + "Conteudo do arquivo: " + txtRegistro.getText() , "NOVO REGISTRO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE))
					{
		            case 0:
		            			            	
		            	btnNovoAtendimento.setEnabled(true);
						btnAbrirRegistro.setEnabled(true);
						frmRegistroDeLigaes.setBounds(100, 100, 315, 175);
						break;
					
		            
					}
				}
				
			}
		});
	}
}
