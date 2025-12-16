## Objetos

### 1. Conceito teórico
Em Programação Orientada a Objetos (POO), um objeto é qualquer coisa, seja ela material ou abstrata,
que possa ser descrita por meio de **características**, **comportamentos** e **estado**.

### 2. Características de um objeto
Um objeto é definido por:
- **Características (atributos)**: informações que descrevem o objeto
- **Comportamentos (métodos)**: ações que o objeto pode realizar
- **Estado**: situação atual do objeto em um determinado momento

### 3. Exemplos do mundo real
Objetos do mundo real são exemplos fáceis de entender, como um celular, um computador ou um carro.
Todos eles possuem características (cor, modelo, marca), realizam ações (ligar, desligar, acelerar)
e podem estar em um determinado estado (ligado, desligado, em movimento).

Em programação, objetos não se limitam a coisas físicas.
Um **aluno** ou um **professor** também podem ser considerados objetos.
Eles possuem características, como nome, altura ou cor do cabelo; realizam ações, como andar, correr
ou levantar os braços; e possuem um estado atual, como estar sentado, explicando a matéria ou assistindo à aula.

### 4. Relação entre objeto e classe
Para representar esse tipo de objeto na programação, criamos uma **classificação**, que chamamos de **classe**.
A classe funciona como um **molde ou modelo**, que define como os objetos daquele tipo serão criados.

Ao definir uma classe, duas perguntas ajudam a identificar seus elementos principais:
- **O que esse objeto tem?** → atributos
- **O que esse objeto faz?** → métodos

### 5. Exemplo comentado em código (Java)

```java
// Classe (molde) - apresentada apenas para permitir a criação do objeto
class Aluno {
    String nome;
    int idade;

    void estudar() {
        System.out.println("O aluno está estudando");
    }
}

public class Main {
    public static void main(String[] args) {

        // Criação do objeto (instância da classe Aluno)
        Aluno aluno1 = new Aluno();

        // Atribuindo valores às características do objeto
        aluno1.nome = "João";
        aluno1.idade = 20;

        // Executando um comportamento do objeto
        aluno1.estudar();
    }
}
```
### Explicação do exemplo

1. Foi criada a classe **`Aluno`**, que serve como um **molde** para a criação de objetos.
2. A classe define os **atributos** e **métodos**, ou seja, o que o objeto **tem** e o que ele **faz**.
3. Na classe **`Main`**, o objeto é de fato criado. Em Java, para dar “vida” a um objeto,
   utiliza-se a palavra reservada **`new`**.
4. O objeto **`aluno1`** é uma instância da classe `Aluno` e possui os atributos definidos na classe, além de poder executar os métodos associados a ela.


