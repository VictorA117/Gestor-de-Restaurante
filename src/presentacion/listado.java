package presentacion;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;



import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class listado extends JPanel {
	private JPanel panel;
	private JButton btnAñadir;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JPanel pnlListado;

	
	public listado() {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "PEDIDOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(new btnAñadirActionListener());
		panel.add(btnAñadir);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar .addActionListener(new btnBorrarActionListener());
		btnBorrar.setRolloverEnabled(true);
		panel.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		pnlListado = new JPanel();
		scrollPane.setViewportView(pnlListado);
		pnlListado.setLayout(new GridLayout(0, 1, 0, 0));

	}
	private class  btnAñadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pnlListado.add(new MiPanelReutilizable()); 
			pnlListado.repaint();
			pnlListado.revalidate();
		}
	}
	private class btnBorrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (pnlListado.getComponents().length>=1) {
			
			
			pnlListado.remove(pnlListado.getComponents().length-1);
			pnlListado.repaint();
			pnlListado.revalidate();
			}
		}
	}
	

}
