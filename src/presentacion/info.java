package presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class info extends JPanel {
	private JScrollPane scrollPane;
	private JTextPane txtpnNombreNmeroPedido;

	/**
	 * Create the panel.
	 */
	public info() {
		setBorder(new TitledBorder(null, "INFORMACI\u00D3N DEL PEDIDO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{438, 0};
		gridBagLayout.rowHeights = new int[]{276, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		add(scrollPane, gbc_scrollPane);
		
		txtpnNombreNmeroPedido = new JTextPane();
		txtpnNombreNmeroPedido.setText("NOMBRE:\n\nNÚMERO PEDIDO:\n\nDESCRIPCIÓN PEDIDO:\n\nFECHA Y HORA:\n\nRESTRICCIONES ALIMENTARIAS:\n\nMÉTODO DE PAGO:\n\nDIRECCIÓN (opcional):\n\nFORMA DE RECOGIDA O ENTREGA PEDIDO:\n\nESTADO DEL PEDIDO:");
		scrollPane.setColumnHeaderView(txtpnNombreNmeroPedido);

	}

}
