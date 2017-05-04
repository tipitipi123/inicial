package papa;

import java.util.Calendar;

public class hola {

	public static void main(String[] args) {
		
		String tiempo=hora(null);
		System.out.println(tiempo);



	}
	
	public static String hora (String tiempo){
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
