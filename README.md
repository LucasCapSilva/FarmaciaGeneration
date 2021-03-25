# FarmaciaGeneration

## endpoints

### marcas

endpoint = http://localhost:8080/marcas
verbo = post

### categoria

http://localhost:8080/categoria
verbo = post
{
    "descricao":"Cosmeticos"
}

### produtos

http://localhost:8080/produtos
verbo = post

{
    "nomeProduto":"Batom Natura",
    "preco":2.00,
    "quantidade":200,
    "ativo":false,
    "marca":{
        "id":1
    }
}
### produtos cadastro many to many

http://localhost:8080/categoria/categoriaProduto/categoria/1/produto/1
verbo = put;

### produtos metodos especificos de busca por nome

http://localhost:8080/produtos/nome/Batom
verbo = get;

### produtos metodos especificos de busca precoMaior

http://localhost:8080/produtos/precoMaior/1
verbo = get;

### produtos metodos especificos de busca precoMenor

http://localhost:8080/produtos/precoMenor/6
verbo = get;

### produtos metodos especificos de busca por ativo

http://localhost:8080/produtos/ativo/true
verbo = get;

### produtos metodos especificos de busca marca

http://localhost:8080/produtos/marca/Natura
verbo = get;
