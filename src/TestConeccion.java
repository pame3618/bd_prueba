import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestConeccion {
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		conexion.conectar();
		Connection cn =null;
		Statement stm =null;
		ResultSet rs =null;
		
	try {
		cn = conexion.conectar();
		stm = cn.createStatement();
		rs = stm.executeQuery("SELECT * FROM TIPO");
		
		while (rs.next()) {
			String id =  rs.getString(1);
			Float num = rs.getFloat(2);
			System.out.println(id + " - "+ num);
		}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	}
}
