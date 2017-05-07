package papa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JTextField;

public class registroUsuario {

	private JFrame frame;
	private JTextField cdEmpleado;

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
		cdNRegistro.setFont(new Font("Tahoma", Font.BOLD, 16));
		cdNRegistro.setIcon(new ImageIcon(registroUsuario.class.getResource("/imagenes/blanco.PNG")));
		cdNRegistro.setBounds(170, 61, 199, 24);
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
		cdFecha.setBounds(170, 98, 199, 24);
		frame.getContentPane().add(cdFecha);
		String tiempo = hora(null);
		String fecha = fecha(null);
		String total = fecha + "-" + tiempo;
		cdFecha.setText(total);
		
		JLabel lblEmpleado = new JLabel("ID EMPLEADO :");
		lblEmpleado.setForeground(Color.WHITE);
		lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmpleado.setBounds(33, 133, 125, 20);
		frame.getContentPane().add(lblEmpleado);
		
		JLabel lblHoraDeEntrada = new JLabel("HORA DE ENTRADA :");
		lblHoraDeEntrada.setForeground(Color.WHITE);
		lblHoraDeEntrada.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHoraDeEntrada.setBounds(14, 302, 182, 16);
		frame.getContentPane().add(lblHoraDeEntrada);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombre.setBounds(75, 172, 82, 16);
		frame.getContentPane().add(lblNombre);
		
		JLabel cdNombre = new JLabel("");
		cdNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		cdNombre.setIcon(new ImageIcon(registroUsuario.class.getResource("/imagenes/blanco.PNG")));
		cdNombre.setBounds(170, 166, 201, 24);
		frame.getContentPane().add(cdNombre);
		
		JButton btnParar = new JButton("Boton para parar ");
		btnParar.setBounds(322, 444, 133, 59);
		frame.getContentPane().add(btnParar);
		
		JLabel cdTiempoEntrada = new JLabel("");
		cdTiempoEntrada.setForeground(Color.WHITE);
		cdTiempoEntrada.setFont(new Font("Tahoma", Font.BOLD, 16));
		cdTiempoEntrada.setBackground(Color.BLACK);
		cdTiempoEntrada.setBounds(196, 298, 182, 24);
		frame.getContentPane().add(cdTiempoEntrada);
		
		cdEmpleado = new JTextField();
		cdEmpleado.setBounds(170, 133, 199, 22);
		frame.getContentPane().add(cdEmpleado);
		cdEmpleado.setColumns(10);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setIcon(new ImageIcon(registroUsuario.class.getResource("/imagenes/fondo-negro.jpg")));
		lblNewLabel_1.setBounds(0, 0, 877, 620);
		frame.getContentPane().add(lblNewLabel_1);
	}
	
	
	//Clase que calcula el tiempo 
	public static String hora(String tiempo){
		Calendar calendario = Calendar.getInstance();
		int hora, minutos, segundos;

		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		
		tiempo = hora + ":" + minutos + ":" + segundos;
		
		return tiempo;
	}
	
	//Clase que calcula la fecha
	public static String fecha(String fecha){
		
		Calendar calendario = Calendar.getInstance();
		int annio, mes, dia;
		

		annio =calendario.get(Calendar.YEAR);
		mes = calendario.get(Calendar.MONTH);
		dia = calendario.get(Calendar.DAY_OF_MONTH);
		mes=mes+1;
		fecha = dia + "/" + mes + "/" + annio;
		
		
		return fecha;
	}
}
