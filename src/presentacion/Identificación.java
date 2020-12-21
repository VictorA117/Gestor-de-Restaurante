package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;
import javax.swing.UIManager;

public class Identificación {

	private JFrame frmIdentificacin;
	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField textusuario;
	private JButton btnAcceder;
	private JButton btnLimpiar;
	private JButton btnIn;
	private JButton btnEsp;
	private JPasswordField passwordcontraseña;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Identificación window = new Identificación();
					window.frmIdentificacin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Identificación() {
		initialize();
	}
	private void initialize() {
		frmIdentificacin = new JFrame();
		frmIdentificacin.getContentPane().setBounds(new Rectangle(0, 0, 500, 500));
		frmIdentificacin.setBounds(100, 100, 450, 300);
		//frmIdentificacin.setIconImage(Toolkit.getDefaultToolkit().getImage(Identificación.class.getResource("/presentacion/Captura de pantalla 2018-11-13 a las 13.19.02.png")));
		frmIdentificacin.setForeground(UIManager.getColor("FormattedTextField.selectionBackground"));
		
		frmIdentificacin.setTitle("IDENTIFICACIÓN");
		
		frmIdentificacin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBounds(new Rectangle(0, 0, 500, 500));
		
		frmIdentificacin.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 49, 96, 0, 0, 0, 0, 48, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{51, 59, 41, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		btnEsp = new JButton("");
		btnEsp.setBorderPainted(false);
		btnEsp.setContentAreaFilled(false);
		btnEsp.setForeground(new Color(255, 255, 255));
		btnEsp.setIcon(new ImageIcon(Identificación.class.getResource("/presentacion/banderaEsp.gif")));
		GridBagConstraints gbc_btnEsp = new GridBagConstraints();
		gbc_btnEsp.anchor = GridBagConstraints.EAST;
		gbc_btnEsp.insets = new Insets(0, 0, 5, 5);
		gbc_btnEsp.gridx = 7;
		gbc_btnEsp.gridy = 0;
		panel.add(btnEsp, gbc_btnEsp);
		
		btnIn = new JButton("");
		btnIn.setIcon(new ImageIcon(Identificación.class.getResource("/presentacion/banderaIng.gif")));
		btnIn.setBorderPainted(false);
		GridBagConstraints gbc_btnIn = new GridBagConstraints();
		gbc_btnIn.insets = new Insets(0, 0, 5, 5);
		gbc_btnIn.gridx = 8;
		gbc_btnIn.gridy = 0;
		panel.add(btnIn, gbc_btnIn);
		
		button = new JButton("");
		button.setBorderPainted(false);
		button.setBackground(new Color(238, 238, 238));
		button.setIcon(new ImageIcon(Identificación.class.getResource("/presentacion/Captura de pantalla 2018-11-14 a las 17_opt.png")));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 9;
		gbc_button.gridy = 0;
		panel.add(button, gbc_button);
		
		lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 1;
		panel.add(lblUsuario, gbc_lblUsuario);
		
		textusuario = new JTextField();
		textusuario.addFocusListener(new TextusuarioFocusListener());
		GridBagConstraints gbc_textusuario = new GridBagConstraints();
		gbc_textusuario.gridwidth = 3;
		gbc_textusuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_textusuario.insets = new Insets(0, 0, 5, 5);
		gbc_textusuario.gridx = 3;
		gbc_textusuario.gridy = 1;
		panel.add(textusuario, gbc_textusuario);
		textusuario.setColumns(10);
		
		lblContrasea = new JLabel("Contraseña:");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 2;
		gbc_lblContrasea.gridy = 2;
		panel.add(lblContrasea, gbc_lblContrasea);
		
		passwordcontraseña = new JPasswordField();
		passwordcontraseña.addFocusListener(new PasswordcontraseñaFocusListener());
		GridBagConstraints gbc_passwordcontraseña = new GridBagConstraints();
		gbc_passwordcontraseña.gridwidth = 3;
		gbc_passwordcontraseña.insets = new Insets(0, 0, 5, 5);
		gbc_passwordcontraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordcontraseña.gridx = 3;
		gbc_passwordcontraseña.gridy = 2;
		panel.add(passwordcontraseña, gbc_passwordcontraseña);
		
		btnAcceder = new JButton("Acceder");
		GridBagConstraints gbc_btnAcceder = new GridBagConstraints();
		gbc_btnAcceder.anchor = GridBagConstraints.EAST;
		gbc_btnAcceder.insets = new Insets(0, 0, 5, 5);
		gbc_btnAcceder.gridx = 4;
		gbc_btnAcceder.gridy = 4;
		panel.add(btnAcceder, gbc_btnAcceder);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.gridwidth = 3;
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 5;
		gbc_btnLimpiar.gridy = 4;
		panel.add(btnLimpiar, gbc_btnLimpiar);
	}
	private class TextusuarioFocusListener extends FocusAdapter {

		public void focusGained(FocusEvent e) {
			textusuario.setBackground(new Color(250,250,210));
		}
		
		
		public void focusLost(FocusEvent e) {
			textusuario.setBackground(new Color(250,250,250));
		}
		
	
	}	
	private class PasswordcontraseñaFocusListener extends FocusAdapter {
		
		public void focusGained(FocusEvent e) {
			passwordcontraseña.setBackground(new Color(250,250,210));
		}
		
		public void focusLost(FocusEvent e) {
			passwordcontraseña.setBackground(new Color(250,250,250));
		}
	}
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textusuario.setText("");
			passwordcontraseña.setText("");
			
			
		}
	
	}
	}

