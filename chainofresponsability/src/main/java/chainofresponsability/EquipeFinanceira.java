package chainofresponsability;

public class EquipeFinanceira extends EquipeSuporte {
    public boolean podeLidarComSolicitacao(TipoSolicitacao tipoSolicitacao) {
        return tipoSolicitacao == TipoSolicitacao.FINANCEIRA;
    }

    public String getDescricaoEquipe() {
        return "Equipe Financeira";
    }
}
