package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MiPanelReutilizable extends JPanel {
	private JLabel lblPedido;
	private JButton btnLimpiar;
	private Color color;
	private JScrollPane scrollPane;
	private JTextPane textPane;
	private JButton btnModificar;

	/**
	 * Create the panel.
	 */
	public MiPanelReutilizable() {
		addMouseListener(new ThisMouseListener_1());
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 94, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 63, 32, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblPedido = new JLabel("Pedido");
		GridBagConstraints gbc_lblPedido = new GridBagConstraints();
		gbc_lblPedido.anchor = GridBagConstraints.EAST;
		gbc_lblPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPedido.gridx = 1;
		gbc_lblPedido.gridy = 2;
		add(lblPedido, gbc_lblPedido);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 3;
		add(scrollPane, gbc_scrollPane);
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		
		btnModificar = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 0);
		gbc_btnModificar.gridx = 4;
		gbc_btnModificar.gridy = 4;
		add(btnModificar, gbc_btnModificar);
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 0);
		gbc_btnLimpiar.gridx = 4;
		gbc_btnLimpiar.gridy = 5;
		add(btnLimpiar, gbc_btnLimpiar);

	}

	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textPane.setText("");
		}
		}
	
	private class ThisMouseListener_1 extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent e) {
			
			color = getBackground();
			setBackground(new Color(250,250,190));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			setBackground(color);
		}
	}
	}

