# FarmaciaGeneration

## endpoints

### marca

endpoint = http://localhost:8080/marcas
verbo = post

{
    "descricao":"Natura"
}
![alt text](https://i.imgur.com/bt95MSs.png)

### categoria

http://localhost:8080/categoria
verbo = post

#### objeto na body de request
{
    "descricao":"Cosmeticos"
}

![alt text](https://i.imgur.com/5hdcEWZ.png)

### produtos

http://localhost:8080/produtos
verbo = post

#### objeto na body de request
{
    "nomeProduto":"Batom Natura",
    "preco":2.00,
    "quantidade":200,
    "ativo":false,
    "marca":{
        "id":1
    }
}

![alt text](https://i.imgur.com/tM2H29d.png)

### produtos cadastro many to many

http://localhost:8080/categoria/categoriaProduto/categoria/1/produto/1
verbo = put;

![alt text](https://i.imgur.com/tJ5GP3q.png)

### produtos metodos especificos de busca por nome

http://localhost:8080/produtos/nome/Batom
verbo = get;

![alt text](https://i.imgur.com/vDIEuak.png)

### produtos metodos especificos de busca precoMaior

http://localhost:8080/produtos/precoMaior/1
verbo = get;


### produtos metodos especificos de busca precoMenor

http://localhost:8080/produtos/precoMenor/6
verbo = get;

![alt text](https://i.imgur.com/46naPW0.png)

### produtos metodos especificos de busca por ativo

http://localhost:8080/produtos/ativo/true
verbo = get;

![alt text](https://i.imgur.com/lKnqG9c.png)

### produtos metodos especificos de busca marca

http://localhost:8080/produtos/marca/Natura
verbo = get;

![alt text](https://i.imgur.com/ueb42uU.png)
