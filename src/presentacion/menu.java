package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

//import presentacion.arbol.TreeTreeSelectionListener;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import java.awt.Color;

public class menu {

	private JFrame frame;
	private JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_2;
	private JTree tree;
	private JPanel pnl;
	private JPanel pnlGestion;
	private JPanel pnlClientes;
	private JPanel pnlOfertas;
	private JPanel pnlAjuestes;
	private JPanel pnlAyuda;
	private JPanel pnlRealizar;
	private JPanel pnlInformacion;
	private JPanel pnlDomicilio;
	
	private JPanel pnlInicio;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public menu() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(new Rectangle(0, 0, 1000, 900));
		frame.setBounds(100, 100, 816, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
		splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		{
		scrollPane = new JScrollPane();
		scrollPane.setMinimumSize(new Dimension(200, 0));
		splitPane.setLeftComponent(scrollPane);
		{
		tree = new JTree();
		tree.setRowHeight(30);
		//tree.setCellRenderer(new Mimenurenderizado());
		tree.addTreeSelectionListener(new TreeTreeSelectionListener());
		
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("MENÚ") {
				{
					
					add(new DefaultMutableTreeNode("INICIO"));
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("GESTIÓN DE PEDIDOS");
						node_1.add(new DefaultMutableTreeNode("LISTADO DE PEDIDOS"));
						node_1.add(new DefaultMutableTreeNode("REALIZAR PEDIDO"));
						node_1.add(new DefaultMutableTreeNode("INFORMACIÓN PEDIDO"));
						node_1.add(new DefaultMutableTreeNode("ENTREGA A DOMICILIO"));
					add(node_1);
					add(new DefaultMutableTreeNode("CLIENTES"));
					add(new DefaultMutableTreeNode("OFERTAS"));
					add(new DefaultMutableTreeNode("AJUSTES"));
					add(new DefaultMutableTreeNode("AYUDA"));
				}
			}
		));
		scrollPane.setViewportView(tree);
		tree.setCellRenderer(new Mimenurenderizado());
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		}
	}
	{
		pnl = new JPanel();
		splitPane.setRightComponent(pnl);
		pnl.setLayout(new CardLayout(0, 0));
		{
		pnlGestion = new JPanel();
		pnl.add(pnlGestion, "GESTIÓN DE PEDIDOS");
		}
		{


		JPanel pnlListado = new listado();
		pnl.add(pnlListado,"LISTADO DE PEDIDOS");
		}
		{
		
		pnlRealizar = new JPanel();
		pnl.add(pnlRealizar,"REALIZAR PEDIDO");
		
		}
		{
		pnlInformacion = new info();
		pnl.add(pnlInformacion,"INFORMACIÓN PEDIDO");
		
		}
		{
		pnlDomicilio = new JPanel();
		pnl.add(pnlDomicilio,"ENTREGA A DOMICILIO");
		}
		{
		pnlClientes = new cli();
		pnl.add(pnlClientes, "CLIENTES");
		}
		{
		pnlOfertas = new JPanel();
		pnl.add(pnlOfertas, "OFERTAS");
		}
		{
		pnlAjuestes = new JPanel();
		pnl.add(pnlAjuestes, "AJUSTES");
		}
		{
		pnlAyuda = new JPanel();
		pnl.add(pnlAyuda, "AYUDA");
		}
		{
		pnlInicio = new JPanel();
		pnl.add(pnlInicio, "INICIO");
		GridBagLayout gbl_pnlInicio = new GridBagLayout();
		gbl_pnlInicio.columnWidths = new int[]{0};
		gbl_pnlInicio.rowHeights = new int[]{0, 0};
		gbl_pnlInicio.columnWeights = new double[]{};
		gbl_pnlInicio.rowWeights = new double[]{};
		pnlInicio.setLayout(gbl_pnlInicio);
		
		pnlInicio.setBorder(new TitledBorder(null, "INICIO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	
		GridBagLayout gbl_pnlini = new GridBagLayout();
		gbl_pnlini.columnWidths = new int[]{0, 143, 69, 0, 158, 0, 0, 0, 0};
		gbl_pnlini.rowHeights = new int[]{0, 0, 115, 41, 0, 0, 0};
		gbl_pnlini.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlini.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlInicio.setLayout(gbl_pnlini);
		
		JLabel lblFoto = new JLabel("FOTO");
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.anchor = GridBagConstraints.WEST;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 1;
		gbc_lblFoto.gridy = 1;
		pnlInicio.add(lblFoto, gbc_lblFoto);
		
		scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		pnlInicio.add(scrollPane_2, gbc_scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 4;
		gbc_scrollPane_1.gridheight = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 3;
		gbc_scrollPane_1.gridy = 2;
		pnlInicio.add(scrollPane_1, gbc_scrollPane_1);
		
		JTextPane txtpnBienvenidALa = new JTextPane();
		txtpnBienvenidALa.setEditable(false);
		scrollPane_1.setColumnHeaderView(txtpnBienvenidALa);
		txtpnBienvenidALa.setText("BIENVENID@ A LA APLICACIÓN HELLOFOOD\n\nNOMBRE:\n\nÚLTIMA CONEXIÓN:");
	
		
		}
	}
		}
	}
		

	class TreeTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent e) {
			System.out.println("Nodo seleccionado "+e.getPath().getLastPathComponent()); 
			String nodo = (e.getPath().getLastPathComponent()).toString();
			switch (nodo){
			case "INICIO":
			case "GESTIÓN DE PEDIDOS":
			case "LISTADO DE PEDIDOS":
			case "REALIZAR PEDIDO":
			case "INFORMACIÓN PEDIDO":
			case "ENTREGA A DOMICILIO":
			case "CLIENTES":
			case "OFERTAS":
			case "AJUSTES":
			case "AYUDA":
				
			((CardLayout) pnl.getLayout()).show(pnl, nodo);
			}
		}
	}
}


