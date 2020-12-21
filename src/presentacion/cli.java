package presentacion;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class cli extends JPanel {
	
 private	JLabel lblClientes;
 private JLabel lblDatos;
 private JScrollPane scrollPane_1;
 private JTextArea txtrNombreTelfonoNmero;
 private JButton btnAñadir;
 private JButton btnBorrar;
 private JLabel lblNewLabel;
 
	public cli() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel("CLIENTES");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		
		lblClientes = new JLabel("CLIENTES");
		GridBagConstraints gbc_lblClientes = new GridBagConstraints();
		gbc_lblClientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblClientes.gridx = 1;
		gbc_lblClientes.gridy = 1;
		//pnlprincipal.add(lblClientes, gbc_lblClientes);
		
		 lblDatos = new JLabel("DATOS");
		GridBagConstraints gbc_lblDatos = new GridBagConstraints();
		gbc_lblDatos.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatos.gridx = 4;
		gbc_lblDatos.gridy = 1;
		//pnlprincipal.add(lblDatos, gbc_lblDatos);
		
	MiPanelClientes panel = new MiPanelClientes();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		//pnlprincipal.add(panel, gbc_panel);
		
	scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.gridwidth = 3;
		gbc_scrollPane_1.gridheight = 5;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 6;
		gbc_scrollPane_1.gridy = 2;
		//pnlprincipal.add(scrollPane_1, gbc_scrollPane_1);
		
		 txtrNombreTelfonoNmero = new JTextArea();
		scrollPane_1.setColumnHeaderView(txtrNombreTelfonoNmero);
		txtrNombreTelfonoNmero.setText("NOMBRE:\n\nTELÉFONO:\n\nNÚMERO PEDIDO:\n\nTIPO CLIENTE:\n\nPUNTOS:\n\nALERGÍAS/INTOLERANCIAS:\n\nDIRECCIÓN:\n\nCORREO ELECTRONICO:");
		
		btnAñadir = new JButton("Añadir");
		GridBagConstraints gbc_btnAñadir = new GridBagConstraints();
		gbc_btnAñadir.anchor = GridBagConstraints.NORTH;
		gbc_btnAñadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadir.gridx = 1;
		gbc_btnAñadir.gridy = 5;
		//pnlprincipal.add(btnAñadir, gbc_btnAñadir);
		
		 btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.anchor = GridBagConstraints.NORTH;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 2;
		gbc_btnBorrar.gridy = 5;
		//pnlprincipal.add(btnBorrar, gbc_btnBorrar);
		
	}

}
