
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMySQL {

	public static void main(String[] args) {

		try {
			// leerBD("carlos");
			insertar();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void conectar() {

		Connection conexion = null;
		// Statement sentenciaSQL = null;

		try {
			// error
			Class.forName("com.mysql.jdbc.Driver");
			// Intenta establecer una conexión con la URL de la base de datos dada.
			conexion = DriverManager.getConnection("jdbc:mysql://mysql-5603.dinaserver.com", "betec_addist",
					"Morcilla01.");
			// conexion =
			// DriverManager.getConnection("jdbc:mysql://mysql-5603.dinaserver.com",
			// "betec_admin", "Morcilla01.");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("El login es incorrecto o no hay conexión con la base de datos");

		} catch (Exception e) {
			System.out.println("ERROR CONEXION");
			e.printStackTrace();

		} finally {

			// cerrar la conexión
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			System.out.println("Se ejecuta finalmente");
		}

	}

	private static void leerBD(String persona) throws ClassNotFoundException {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://mysql-5603.dinaserver.com/betec_damdawdist",
					"betec_addist", "Morcilla01.");

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "SELECT * FROM peliculas WHERE persona='" + persona + "' order by valoracion";
			// System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println("titulo: " + rs.getString("titulo") + " - nota: " + rs.getInt("valoracion"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {

			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

	private static void insertar() throws ClassNotFoundException, SQLException {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado = 0;

		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://mysql-5603.dinaserver.com/betec_damdawdist",
					"betec_addist", "Morcilla01.");

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)

			sql = "INSERT INTO peliculas (titulo, persona, valoracion) VALUES ( 'Contacto', 'Claudia', 10)";

			// System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println("Se ha insertado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			sentenciaSQL.close();
			conexion.close();

		}

		System.out.println("Conectado/desconectado");

	}

}
