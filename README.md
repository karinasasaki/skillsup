## Como Executar a Aplicação com Docker

### Pré-requisitos

Instale o [Docker Desktop](https://docs.docker.com/desktop/).

### Passos

1. Baixe o Projeto:
   
Faça o download do projeto ou clone o repositório:

```bash
git clone https://github.com/karinasasaki/skillsup.git
```

2. Navegue até a pasta do projeto:

```bash
cd skillsup
```

3. Execute o Docker Compose

No terminal, execute o seguinte comando para iniciar a aplicação e o banco de dados:

```bash
docker-compose up
```

4. Acesse a Aplicação

Após o Docker Compose terminar de inicializar, a aplicação estará disponível em:

```
http://localhost:8080/user
```

O link retorna uma array de usuários cadastrados, mas como a tabela está vazia, irá retornar uma lista vazia:

![image](https://github.com/user-attachments/assets/3963e2f9-8ad8-4c3c-aa50-108ba03850e1)


5. Parar a Aplicação

Para parar a aplicação e os contêineres, pressione Ctrl + C no terminal onde o Docker Compose está rodando.

Em seguida, execute:

```bash
docker-compose down
```

## Aplicação backend criado com Spring Initlizr:

![image](https://github.com/user-attachments/assets/5a28e78d-49d1-47ca-9bec-6051ae2e215e)

Java 21

Spring Boot 3.4.3

PostgreSQL 17.4
