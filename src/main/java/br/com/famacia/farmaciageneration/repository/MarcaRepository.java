package br.com.famacia.farmaciageneration.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.famacia.farmaciageneration.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
