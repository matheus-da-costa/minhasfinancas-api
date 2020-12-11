package com.matheus.minhasFinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.minhasFinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
