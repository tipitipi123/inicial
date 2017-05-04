package papa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.Calendar;

public class registroUsuario {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registroUsuario window = new registroUsuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registroUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 895, 648);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNRegistro = new JLabel("Nº REGISTRO:");
		lblNRegistro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNRegistro.setForeground(Color.WHITE);
		lblNRegistro.setBackground(Color.WHITE);
		lblNRegistro.setBounds(40, 61, 118, 24);
		frame.getContentPane().add(lblNRegistro);
		
		JLabel cdNRegistro = new JLabel("");
		cdNRegistro.setIcon(new ImageIcon(registroUsuario.class.getResource("/imagenes/blanco.PNG")));
		cdNRegistro.setBounds(170, 61, 40, 24);
		frame.getContentPane().add(cdNRegistro);
		
		JLabel lblFecha = new JLabel("FECHA :");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setBounds(93, 98, 65, 24);
		frame.getContentPane().add(lblFecha);
		
		JLabel cdFecha = new JLabel("");
		cdFecha.setForeground(Color.WHITE);
		cdFecha.setFont(new Font("Tahoma", Font.BOLD, 16));
		cdFecha.setBackground(Color.BLACK);
		cdFecha.setIcon(null);
		cdFecha.setBounds(170, 98, 125, 24);
		frame.getContentPane().add(cdFecha);
		String fecha = hora(null);
		cdFecha.setText(fecha);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(registroUsuario.class.getResource("/imagenes/fondo-negro.jpg")));
		lblNewLabel_1.setBounds(0, 0, 877, 620);
		frame.getContentPane().add(lblNewLabel_1);
	}
	
	public static String hora(String tiempo){
		Calendar calendario = Calendar.getInstance();
		//Calendar calendario = new GregorianCalendar();
		int hora, minutos, segundos;
		int num=1;

		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		
		tiempo = hora + ":" + minutos + ":" + segundos;
		
		return tiempo;
	}
}
