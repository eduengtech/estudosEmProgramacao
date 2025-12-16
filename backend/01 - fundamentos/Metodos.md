## Objetos

### 1. Conceito teórico
Agora chegou a vez de trazer a segunda pergunta que nos fazemos ao criar um objeto, que é: on que ele faz? Tambem chamados de **métodos**.

Os **métodos** representam os **comportamentos** de um objeto.
Eles definem as ações que um objeto pode executar.
### 2. Características de um objeto
Um objeto é definido por:
- **Características (atributos)**: informações que descrevem o objeto
- **Comportamentos (métodos)**: ações que o objeto pode realizar
- **Estado**: situação atual do objeto em um determinado momento

### 3. Exemplos do mundo real

Os **métodos** podem ser comparados às ações que uma pessoa é capaz de realizar.
Um aluno pode estudar, caminhar, falar ou escrever.
Essas ações representam comportamentos, não características.

Ao executar uma ação, o estado da pessoa pode mudar.
Por exemplo, após estudar, o aluno pode estar mais cansado ou mais preparado.
Da mesma forma, em programação, os métodos representam comportamentos que
podem alterar o estado de um objeto.

Em Programação Orientada a Objetos, os métodos definem as ações que um objeto
pode executar e como ele reage a determinadas situações.

Assim como uma pessoa possui características próprias, cada objeto criado
a partir de uma classe possui seus próprios valores para os atributos definidos.


### 4. Exemplo comentado em código (Java)
```java
class Aluno {
    String nome;

    void estudar() {
        System.out.println(nome + " está estudando");
    }
}

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";

        aluno1.estudar();
    }
}
```
### 5. Explicação do exemplo:

1. **`estudar()`** é um método da classe Aluno

2. O método representa uma ação do objeto

3. O método utiliza um atributo do próprio objeto