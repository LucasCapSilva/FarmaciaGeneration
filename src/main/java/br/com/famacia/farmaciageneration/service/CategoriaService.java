package br.com.famacia.farmaciageneration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.famacia.farmaciageneration.model.Categoria;
import br.com.famacia.farmaciageneration.model.Produto;
import br.com.famacia.farmaciageneration.repository.CategoriaRepository;
import br.com.famacia.farmaciageneration.repository.ProdutoRepository;

@Service
public class CategoriaService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria cadastroProdutoCategoria(long categoriaId, long produtoId) {
		
		Optional<Produto> produtoExistente = produtoRepository.findById(produtoId);
		Optional<Categoria> categoriaExistente = categoriaRepository.findById(categoriaId);
		
		if (produtoExistente.isPresent()&&categoriaExistente.isPresent()) {
			
			categoriaExistente.get().getProdutos().add(produtoExistente.get());
			
			categoriaRepository.save(categoriaExistente.get());
			
			return categoriaRepository.save(categoriaExistente.get());
		}
		
		return null;
		
	}
	
	
}
