package EscolaMusica;

import javax.swing.JOptionPane;

public class Aluno {

	private String nome;
	private int idade;
	private String curso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNomeAluno() {

		nome = JOptionPane.showInputDialog(null, "Digite o nome do Aluno:");
		JOptionPane.showMessageDialog(null, " O Aluno chama-se: " + this.nome + "!");
		return nome;
	}
	
	public int getIdadeAluno() {
		
		idade =  Integer.parseInt(JOptionPane.showInputDialog(null, "digite a idade do aluno:")); 
		JOptionPane.showMessageDialog(null, "O Aluno " +this.nome + " tem " + this.idade + " anos de idade." );
		return idade;
	}
}
