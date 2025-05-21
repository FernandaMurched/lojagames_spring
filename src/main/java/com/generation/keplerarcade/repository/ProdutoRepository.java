package com.generation.keplerarcade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.keplerarcade.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	// Buscar pro nome
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	// Jogos com preço maior que o valor passado 
	public List<Produto> findAllByPrecoGreaterThan(Double preco);
	
	// Jogos com preço menor que o valor passado
	public List<Produto> findAllByPrecoLessThan(Double preco);
}
