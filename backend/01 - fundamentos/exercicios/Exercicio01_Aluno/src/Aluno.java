public class Aluno {
    public String nome;
    public int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void estudar(){
        System.out.println(nome + " está estudando");
    }
}