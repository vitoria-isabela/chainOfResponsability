package chainofresponsability;

public class EquipeReclamação extends EquipeSuporte {
    public boolean podeLidarComSolicitacao(TipoSolicitacao tipoSolicitacao) {
        return tipoSolicitacao == TipoSolicitacao.RECLAMAÇÃO;
    }

    public String getDescricaoEquipe() {
        return "Equipe de Reclamação";
    }
}