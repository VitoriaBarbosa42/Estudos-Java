package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAlunos(aluno1);
		curso1.adicionarAlunos(aluno2);
		
		curso2.adicionarAlunos(aluno1);
		curso2.adicionarAlunos(aluno3);
		
		aluno1.adicionarAluno(curso3);
		aluno2.adicionarAluno(curso3);
		aluno3.adicionarAluno(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome + "...");
			System.out.println("... e meu nome é " + aluno.nome);
			
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
		
		System.out.println();
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
			
		}
		
	}

}
