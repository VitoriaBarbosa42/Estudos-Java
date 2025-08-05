package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa1 {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConnection();
		
		String sql = "select * from pessoas";
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Pessoas>  pessoas = new ArrayList<Pessoas>();
		
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoas(codigo, nome));
		}
		
		for(Pessoas p : pessoas) {
			System.out.println(p.getCodigo() + "==>" + p.getNome());
		}
		
		conexao.close();
	}

}
