package dw.mensalistas_futebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dw.mensalistas_futebol.model.Jogador;

import java.util.List;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
  
  List<Jogador> findByCod_jogador(Integer cod_jogador);
  List<Jogador> findByNome(String nome);
  List<Jogador> findByEmail(String email);
  List<Jogador> findByDataNasc(String dataNasc);
  
}
