# JSON - Javascript Object Notation

## O que é o JSON

É um formato de texto utilizado para trocar dados entre sistemas, principalmente entre o frontend e o backend.

### Caracteristicas 
- Leve
- Facil de ler e escrever 
- Independente de linguagem, pois praticamente todas as linguegens endendem ele.

### Para que o JSON é usado?
- Usado em APIs REST
- Comunicação frontend -> backend
- Na troca de dados pela Web.

Agora fazendo uma analogia simples imagine uma caixa, dentro dela vão as informações e o formato dessa caixa vem em JSON.

### Como o JSON é por dentro?

Basicamente ele é formado por Objeto, no formato {pares de chave:valor}

### Tipos de dados no JSON
O JSON aceita alguns tipos de dados são eles:

- String, formato texto
- Numeros 
- Valores booleanos
- Listas(Arrays)
- Objetos.

### Fluxo da Informação.

Basicamente ele funciona assim:

1. O frontend faz um pedido:

2. O backend recebe, geramente em JSON

3. Envia uma resposta que tambem é em formato JSON para o frontend

4. O frontend lê o JSON e mostra os dados na tela.