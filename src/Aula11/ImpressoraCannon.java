package Aula11;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora {
  public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, Integer folhasDisponiveis, Double porcentagemTinta) {
    super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
  }

  @Override
  public String imprimir() {
    if (temPapel() && !precisaTinta()){
      return "Imprimindo folhas";
    } else {
      return "Não impresso";
    }
  }

  @Override
  public boolean precisaTinta(){
    return this.getPorcentagemTinta() > 3.0;
  }
}
