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
  public void setCod_jogador(Integer cod_jogador){
    this.cod_jogador=cod_jogador;
  }

  public Integer getCod_jogador(){
    return cod_jogador;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public void setEmail(String email){
    this.email = email;
  }
  
  public String getEmail(){
    return email;
  }

  public void setDataNasc(String dataNasc){
    this.dataNasc = dataNasc;
  }

  public String getDataNasc(){
    return dataNasc;
  }

  @Override
  public String toString(){
    return " { Jogador Nome= " + nome + ", email= " + email + "Data de Nascimento= " + dataNasc + "ID= " + cod_jogador + "}" ;
  }
}
