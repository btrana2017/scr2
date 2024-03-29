package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
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
	public FrmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JToolBar toolBar = new JToolBar();
		scrollPane.setColumnHeaderView(toolBar);
		
		JButton btnMasNuevo = new JButton("Mas nuevo");
		toolBar.add(btnMasNuevo);
		
		JButton btnNuevo = new JButton("Nuevo");
		toolBar.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		toolBar.add(btnGuardar);
		
		JButton btnNewButton = new JButton("New b");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolBar.add(btnNewButton);
		
		JButton btnReporte = new JButton("Reportes");
		btnReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolBar.add(btnReporte);
		JButton btnImprimir = new JButton("Imprimir");
		toolBar.add(btnImprimir);
	}

}
