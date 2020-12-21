package presentacion;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class Mimenurenderizado extends DefaultTreeCellRenderer {
	
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded ,boolean leaf, int row, boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

		DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) value; 
		String c = (String)(nodo.getUserObject());
		 switch (c)
		   {
		   case "MENÚ": 
			     setIcon(new ImageIcon(Mimenurenderizado.class.getResource("42613197-menú-de-hamburguesa-icono-de-la-línea-de-arte-de-barras-para-aplicaciones-y-sitios-web_opt.jpg")));
			       break;
		 
		   case "INICIO": 
		     setIcon(new ImageIcon(Mimenurenderizado.class.getResource("inicio.png")));
		       break;
		   case "GESTIÓN DE PEDIDOS":
			setIcon(new ImageIcon(Mimenurenderizado.class.getResource("gestion_opt.png")));
		       break;
		   case "LISTADO DE PEDIDOS":
				setIcon(new ImageIcon(Mimenurenderizado.class.getResource("listapedidos_opt.png")));
			       break;
		   case "REALIZAR PEDIDO":
				setIcon(new ImageIcon(Mimenurenderizado.class.getResource("realizarpedido_opt.png")));
			       break;
		   case "INFORMACIÓN PEDIDO":
				setIcon(new ImageIcon(Mimenurenderizado.class.getResource("Finance-Purchase-Order-icon_opt.png")));
			       break;
		   case "ENTREGA A DOMICILIO":
				setIcon(new ImageIcon(Mimenurenderizado.class.getResource("mapa.jpg")));
			       break;
		   case "CLIENTES":
		setIcon(new ImageIcon(Mimenurenderizado.class.getResource("clientes_opt.png")));
		       break;
		   case "OFERTAS":
				setIcon(new ImageIcon(Mimenurenderizado.class.getResource("ofertas_opt.png")));
				       break;
		   case "AJUSTES":
				setIcon(new ImageIcon(Mimenurenderizado.class.getResource("ajustes_opt.png")));
				       break;
		   case "AYUDA":
				setIcon(new ImageIcon(Mimenurenderizado.class.getResource("pregunta.jpg")));
				       break;
		       
		  
		}
		return this;
		
	}
	}	
         
		
		

