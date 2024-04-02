public class Aluno extends Pessoa {
    public int matricula;
    public Aluno(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    public void printMatricula() {
        System.out.println(this.matricula);
    }
}
 