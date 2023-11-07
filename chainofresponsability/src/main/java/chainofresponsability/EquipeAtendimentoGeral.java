package chainofresponsability;

public class EquipeAtendimentoGeral extends EquipeSuporte {
    public boolean podeLidarComSolicitacao(TipoSolicitacao tipoSolicitacao) {
        return tipoSolicitacao == TipoSolicitacao.GERAL;
    }

    public String getDescricaoEquipe() {
        return "Equipe de Atendimento Geral";
    }
}