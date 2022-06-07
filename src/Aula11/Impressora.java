package Aula11;

import java.time.LocalDate;

public abstract class Impressora {
  private String modelo;
  private String tipoConexao;
  private LocalDate dataFabricacao;
  private Integer folhasDisponiveis;
  private Double porcentagemTinta;

  public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, Integer folhasDisponiveis, Double porcentagemTinta) {
    this.modelo = modelo;
    this.tipoConexao = tipoConexao;
    this.dataFabricacao = dataFabricacao;
    this.folhasDisponiveis = folhasDisponiveis;
    this.porcentagemTinta = porcentagemTinta;
  }

  public boolean temPapel(){
    return this.folhasDisponiveis > 0;
  }

  public boolean precisaTinta(){
    return this.porcentagemTinta > 5.0;
  }

  public abstract String imprimir();

  public String getModelo() {
    return modelo;
  }

  public String getTipoConexao() {
    return tipoConexao;
  }

  public LocalDate getDataFabricacao() {
    return dataFabricacao;
  }

  public Integer getFolhasDisponiveis() {
    return folhasDisponiveis;
  }

  public Double getPorcentagemTinta() {
    return porcentagemTinta;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setTipoConexao(String tipoConexao) {
    this.tipoConexao = tipoConexao;
  }

  public void setDataFabricacao(LocalDate dataFabricacao) {
    this.dataFabricacao = dataFabricacao;
  }

  public void setFolhasDisponiveis(Integer folhasDisponiveis) {
    this.folhasDisponiveis = folhasDisponiveis;
  }

  public void setPorcentagemTinta(Double porcentagemTinta) {
    this.porcentagemTinta = porcentagemTinta;
  }
}
