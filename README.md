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

### categoria

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

http://localhost:8080/categoria/categoriaProduto/categoria/1/produto/1
verbo = put;

http://localhost:8080/produtos/nome/Batom
verbo = get;

http://localhost:8080/produtos/precoMaior/1
verbo = get;

http://localhost:8080/produtos/precoMenor/6
verbo = get;

http://localhost:8080/produtos/ativo/true
verbo = get;

http://localhost:8080/produtos/marca/Natura
verbo = get;
