package baseDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conectarSql {

	public static Connection getConexion(){
		
		Connection bD = null;
		boolean conexionCompletada = true;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/nombreBaseDatos";
			String usuario = "root";
			String pass = "";
			
			bD = DriverManager.getConnection(url,usuario,pass);
			
		} catch (ClassNotFoundException e) {
			conexionCompletada = false;
		} catch (SQLException e) {
			conexionCompletada = false;
		}
		
		if (conexionCompletada = true){
			System.out.print("Se ha conectado correctamente a la base de datos");
		}else{
			System.out.print("Error al conectarse a la base de datos");
		}
		
		return null;	
	}

}
