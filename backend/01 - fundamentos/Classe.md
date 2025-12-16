## Objetos

### 1. Conceito teórico
Uma **classe** em POO trata-se, como dito anteriormente, de uma **molde** ou **modelo** para se criar um objeto. Ela descreve quais **atributos** os objetos terão, bem como quais *métodos** eles poderão executar.

A classe sozinha não representa algo concreto, mas sim uma **estrutura** que serve como base para instaanciar um objeto.

### 2. Papel da classe na POO

- Definir a estrutura dos objetos 
- Agruoa atributos e métodos relacionados 
- Serve como base para criação de objetos do mesmo tipo

### 3. Exemplos do mundo real
É como se eu tivesse que criar um brinquedo e para que esse brinquedo exista eu tenho que ter o desenho desse brinquedo. O **desenho**, nesse caso, assumirá o papel da classe.

Assim como o desenho do brinquedo define como ele será criado,
a classe abaixo define como os objetos do tipo `Aluno` serão instanciados.


### 4. Exemplo comentado em código (Java)
```java
// Definição da classe (molde)
class Aluno {

    // Atributos definidos pela classe
    String nome;
    int idade;

    // Métodos definidos pela classe
    void estudar() {
        System.out.println("O aluno está estudando");
    }
}
```

### Explicação do exemplo

1. **`class Aluno` define o modelo.
2. **`nome`** e **`idade`** são atributos da classe.
3. **`estudar()`** é um método disponivel para os objetos criados a partir dessa classe 
