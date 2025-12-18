# REST 

## O que é REST

O REST trata-se de um conjunto de regras e princípios que define como uma API deve ser construída na Web.
Trata-se de um estilo arquitetural, amplamente utilizado no desenvolvimento de APIs, que utiliza o protocolo HTTP como meio de comunicação entre cliente e servidor.

O **REST** pode ser comparado às regras de um prédio: ele define como os acessos são organizados, como os recursos são identificados e como as ações devem ser realizadas. O HTTP é apenas o meio de comunicação utilizado para seguir essas regras.

# Como funciona a arquitetura REST?

Essa arquitetura funciona com base na comunicação cliente-servidor, por meio do **protocolo HTTP**. Onde tudo é tratado como recurso, acessados por URLs, e manipulados por metodos HTTP.

O cliente faz uma requisição -> o servidor processa -> responde com uma representação do recurso(JSON) e um status HTTP.

### Principios da arquitetura REST

1. Cliente -> Servidor possuem separação de responsabilidade, onde o cliente cuida da parte que interage com o usuario, enquanto o servidor cuida dos bastidores: as regras de negocio e os dados.

2. Stateless (sem estado): cada requisição é feita de forma independente, o servidor nao salva informaçoes da requisição anterior.

3. Identificação de recursos atraves de uma URL única.

4. Uso padronizado dos métodos HTTP: não cria novos métodos, apenas usa o corretamente o método HTTP.

5. O servidor retorna representações, não objetos internos. Normalmente **JSON**.

6. A resposta sempre informa o resultado da requisição, pelo código de status HTTP.

7. Respostas podem indicar se podem ser cacheadas.

8. Todas as APIs devem seguir o mesmo padrao.