package br.gov.sp.etec.financiamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.etec.financiamento.dto.FinanEntity;


public interface FinanRepository extends JpaRepository<FinanEntity, Long> {

}