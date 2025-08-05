package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsultarRegistro {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConnection();
		
		List<Pessoas>  pessoas = new ArrayList<Pessoas>();
		
		System.out.print("Digite as letras que gostaria de consultar: ");
		String consulta = entrada.nextLine();
		
		
		String sql = "select * from pessoas where nome like ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + consulta + "%");
		
		ResultSet resultado = stmt.executeQuery();
		
		System.out.println("Pessoa incluida com sucesso!" );
		
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoas(codigo, nome));
		}
		
		for (Pessoas p: pessoas) {
			System.out.println(p.getCodigo() + " - " + p.getNome());
		}
		
		conexao.close();
		entrada.close();
	}

}
