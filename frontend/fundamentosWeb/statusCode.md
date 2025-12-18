## Status Code 

Os **códigos de status** são códigos de respostas para solicitações HTTP, indicando se ele foi concluida com sucesso. Essas respostas são agrupadas em **cinco classes:**
- Respostas informativas: 100 à 199.
- Respostas de sucesso: 200 à 299.
- Mensagens de redirecionamentos: 300 à 399.
- Respostas de erro do cliente: 400 à 499.
- Resposta de erro do servidor: 500 à 599.

Usando a analogia do restaurante, o **código de status** é a forma do garçom dizer o que aconteceu com o pedido.

Por enquanto vou trazer apenas algumas logo abaixo, são elas: 200, 201, 400, 401, 403, 404, 500.

### Status 200 (200 OK)

Indica que a solicitão foi bem-sucedida, em outras palavras deu tudo certo por aqui. Você pediu a comida e ela chegou certinha.

### Status 201 (Created)

Indica que a requisição foi bem sucedida e um novo recurso foi criado como resultado, normalmente são enviados após as solicitações de atualização foram enviadas ou em alguns casos, de alterações parciais (PATCH). Em outras palavras é como se um prato especial que você pediu e a cozinha criou agora e o garçom traz a mensagem: prato novo criado.

### Status 400 Bad Request

O servidor recibe a informação, porém não pode processá-la por estar mal fornecida ou com dados incorretos, é como a brincadeira do telefone sem fio, que a mensagem começa correta e chega incorreta ao destino final(servidor).

### Status 401 Unauthorized (autenticação)
Embora esse codigo tenha semantica por padrao, ele significa que o cliente precisará de autorização para ter acesso a informação. Já ouviu falar naquela famosa frase "acesso restrito, somente pessoas autorizadas", basicamente é isso que o servidor informa ao cliente.

### Status 403 Forbidden (autorização)

Nesse caso, o cliente é identificado pelo servidor, porém o cliente não tem autorização para acessar o conteúdo, então o servidor não informa. É o caso de um sistema com login para o usuário ter acesso as informações do painel, ele precisa ter autorização para ter acesso ao conteúdo.

### 404 Not Found

Significa que o recurso solicitado não existe. É como pedir um prato que não existe no cardápio. O garçom entende o pedido, mas informa que aquele item não está disponível.

### 500 Internal Server Error

Indica que o servidor encontrou um erro interno inesperado e não conseguiu processar a requisição. O problema não está no pedido do cliente, mas em algo que falhou dentro do próprio servidor.

É como se o pedido estivesse correto, mas algo deu errado na cozinha:
um equipamento quebrou, um erro aconteceu no preparo, e o prato não pôde ser entregue.