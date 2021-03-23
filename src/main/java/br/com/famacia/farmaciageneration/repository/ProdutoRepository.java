package br.com.famacia.farmaciageneration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.famacia.farmaciageneration.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase (String nomeProduto);
	
	public List<Produto> findAllByPrecoLessThanEqual (float preco);
	
	public List<Produto> findAllByPrecoGreaterThanEqual (float preco);
	
	@Query(value = "SELECT * FROM blog_pessoal.tb_produto where ativo = :ativo", nativeQuery = true)
	public List<Produto> findAllByAtivo(@Param("ativo") boolean ativo);	
	
	@Query(value = "select * from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id where tb_categoria.descricao = :categoria", nativeQuery = true)
	public List<Produto> findAllProdutoByCategoriaDecicao(@Param("categoria") String categoria);
}