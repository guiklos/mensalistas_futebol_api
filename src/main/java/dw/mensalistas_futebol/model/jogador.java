package dw.mensalistas_futebol.model;

import javax.persistence.*;

@Entity
@Table(name = "jogador")

public class Jogador {
  private int cod_jogador;

  private varchar(60) nome;

  private varchar(60) email;

  private date dataNasc;

  public Jogador(){}
}
