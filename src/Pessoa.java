public class Pessoa {
    public String nome;
    public int idade;
    private String CPF;

    public Pessoa(String nome, int idade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }

    public void printNome() {
        System.out.println(this.nome);
    }

    public void printIdade() {
        System.out.println(this.idade);
    }
}
