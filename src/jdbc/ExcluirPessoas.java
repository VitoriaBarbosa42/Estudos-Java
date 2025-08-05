package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoas {
	
	public static void main(String[] args) throws SQLException{
		
		String path = System.getProperty("user.dir");
		
		System.out.println(path);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o código: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConnection();
		String sql = "delete from pessoas where codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		}else {
			System.out.println("Nada feito!");
		}
		
		System.out.println("Linhas afetadas: " + contador);
		
		conexao.close();
		entrada.close();
	}

}
