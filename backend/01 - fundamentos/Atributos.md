## Objetos

### 1. Conceito teórico
Lembra quando disse que para definir uma classe ou objeto devemos nos fazer duas perguntinhas: o que ele tem ? E o que ele faz? Então agora vamos falar sobre os **atribudos**.

Os **atributos** são as caracteristicas que uma classe ou objeto possuem. Eles armazenam informações que descrevem o estado do objeto em um determinado momento.

### 2. Características dos atributos
- São variáveis declaradas dentro da classe
- Definem o estado do objeto
- Cada objeto mantém seus próprios valores

### 3. Exemplos do mundo real
Podemos entender os **atributos** observando as características de uma pessoa.
Por exemplo, um aluno possui nome, idade, altura e cor do cabelo.
Essas informações descrevem quem é esse aluno, mas não representam nenhuma ação.

Essas características podem mudar ao longo do tempo.
Um aluno pode envelhecer, mudar de corte de cabelo ou de estado emocional.
Da mesma forma, em programação, os atributos representam o **estado** de um objeto
em um determinado momento.

Em Programação Orientada a Objetos, os atributos são as informações que descrevem
um objeto e permitem diferenciá-lo de outros objetos do mesmo tipo.

Assim como uma pessoa possui características próprias, cada objeto criado
a partir de uma classe possui seus próprios valores para os atributos definidos.


### 4. Exemplo comentado em código (Java)

```java
class Aluno {
    String nome;
    int idade;
}

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "João";
        aluno1.idade = 20;

        aluno2.nome = "Maria";
        aluno2.idade = 22;
    }
}
```
### Explicação do exemplo:

- **`nome` e **`idade`** são atributos da classe Aluno

- **`aluno1`** e **`aluno2`** são objetos diferentes

- Cada objeto possui seus próprios valores para os atributos
