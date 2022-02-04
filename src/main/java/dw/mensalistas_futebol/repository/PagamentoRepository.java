package dw.mensalistas_futebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dw.mensalistas_futebol.model.Pagamento;

import java.util.List;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
  
  List<Pagamento> findByCod_pagamento(Integer cod_pagamento);
  List<Pagamento> findByAno(String ano);
  List<Pagamento> findByMes(String mes);
  List<Pagamento> findByValor(String valor);
  
}
