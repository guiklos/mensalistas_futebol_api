package dw.mensalistas_futebol.model;

import javax.persistence.*;

@Entity
@Table(name = "pagamento")

public class Pagamento {


  @Id
  private Integer cod_pagamento;


  @Column
  private String ano;


  @Column
  private String mes;


  @Column
  private String valor;


  public Pagamento() {

  }

  public Pagamento (Integer cod_pagamento, String ano, String mes, String valor){
    this.cod_pagamento=cod_pagamento;
    this.ano=ano;
    this.mes=mes;
    this.valor=valor;
}
  public void setcod_pagamento(Integer cod_pagamento){
    this.cod_pagamento=cod_pagamento;
  }

  public Integer getcod_pagamento(){
    return cod_pagamento;
  }

  public void setano(String ano){
    this.ano = ano;
  }

  public String getano(){
    return ano;
  }

  public void setmes(String mes){
    this.mes = mes;
  }
  
  public String getmes(){
    return mes;
  }

  public void setvalor(String valor){
    this.valor = valor;
  }

  public String getvalor(){
    return valor;
  }

  @Override
  public String toString(){
    return " { Pagamento ano= " + ano + ", mes= " + mes + "Data de Nascimento= " + valor + "ID= " + cod_pagamento + "}" ;
  }
}
