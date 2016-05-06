package conexaoDB;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Usuario {
	public int usuarioExiste(String email, String senha){
		try {
			java.sql.Connection conn = ConexaoMySQL.getConexaoMySQL();
			java.sql.Statement stmt = conn.createStatement();
			String sql = "SELECT id FROM `usuarios` WHERE `email`=\""+email+"\" AND `senha`=\""+senha+"\"";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s = rs.getString("id");
				int i = Integer.parseInt(s);
				return i;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public int getCPF(String email, String senha){
		try {
			java.sql.Connection conn = ConexaoMySQL.getConexaoMySQL();
			java.sql.Statement stmt = conn.createStatement();
			String sql = "SELECT cpf FROM `usuarios` WHERE `email`=\""+email+"\" AND `senha`=\""+senha+"\"";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s = rs.getString("cpf");
				int i = Integer.parseInt(s);
				return i;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public int getCPF(int id){
		try {
			java.sql.Connection conn = ConexaoMySQL.getConexaoMySQL();
			java.sql.Statement stmt = conn.createStatement();
			String sql = "SELECT id FROM `usuarios` WHERE id="+id;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s = rs.getString("cpf");
				int i = Integer.parseInt(s);
				return i;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	
	}
}
