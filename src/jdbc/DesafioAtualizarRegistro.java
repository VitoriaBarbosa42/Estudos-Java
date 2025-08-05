package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioAtualizarRegistro {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConnection();
		
		List<Pessoas>  pessoas = new ArrayList<Pessoas>();
		
		String select = "select * from pessoas";
		
		Statement stmt1 = conexao.createStatement();
		ResultSet resultado = stmt1.executeQuery(select);
		
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoas(codigo, nome));
		}
		
		for (Pessoas p: pessoas) {
			System.out.println(p.getCodigo() + " - " + p.getNome());
		}
		
	
		System.out.print("Digite o novo nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o id que gostaria de alterar: ");
		int id = entrada.nextInt();
		
		
		String update = "update pessoas set nome = ? where codigo = ?";
		
		PreparedStatement stmt2 = conexao.prepareStatement(update);
		stmt2.setString(1, nome);
		stmt2.setInt(2, id);
		
		stmt2.execute();
		
		conexao.close();
		entrada.close();
	}

}
