package dw.mensalistas_futebol.model;

import javax.persistence.*;

@Entity
@Table(name = "jogador")

public class Jogador {

  private Integer cod_jogador;

  private String nome;

  private String email;

  private String dataNasc;


  public Jogador (Integer cod_jogador, String nome, String email, String dataNasc){
    this.cod_jogador=cod_jogador;
    this.nome=nome;
    this.email=email;
    this.dataNasc=dataNasc;
}

  public Integer getCod_jogador(){
    return cod_jogador;
  }

  public String getNome(){
    return nome;
  }
  
  public String getEmail(){
    return email;
  }

  public String getDataNasc(){
    return dataNasc;
  }
}
