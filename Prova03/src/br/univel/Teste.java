package br.univel;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Teste{
	public Teste(){
		try{
			Connection con = getConexao();
			excluirTodosCLientes(con);
			insereCliente(con,1,"Hugo");
			insereCliente(con,2,"Jose");
			insereCliente(con,3,"Luiz");
			mostrarTodosClientes(con);
			
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	public Connection getConexao() throws SQLException{
		
		Connection con = DriverManager.getConnection("jdbc:h2:~aulah2","sa","sa");
		return con;
		
	}
	public void insereCliente(Connection con , int id ,String nome)throws SQLException {
		PreparedStatement ps = con.prepareStatement("INSERT INTO cliente(id, nome)" + "VALUES(?,?)");
		ps.setInt(1,id);
		ps.setString(2,nome);
		ps.executeUpdate();
	}
	private void excluirTodosCLientes(Connection con)throws SQLException{
		PreparedStatement ps = con.prepareStatement("DELETE FROM cliente");
		ps.executeUpdate();
		
	}private List<Cliente>mostrarTodosClientes(Connection con)throws SQLException{
		PreparedStatement ps = con.prepareStatement("SELECT * FROM cliente");
		ResultSet rs = ps.executeQuery();
		List<Cliente> lista = new ArrayList<>();
		while(rs.next()){
			System.out.println(rs.getInt(1) + "\t"+rs.getString(2));
		}
		return lista;
		
	//
}

	public static void main(String[] args) {
		new Teste();

	}

}
