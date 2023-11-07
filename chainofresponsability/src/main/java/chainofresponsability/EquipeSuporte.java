package chainofresponsability;

public abstract class EquipeSuporte {
    private EquipeSuporte equipeSuperior;

    public void setEquipeSuperior(EquipeSuporte equipeSuperior) {
        this.equipeSuperior = equipeSuperior;
    }

    public String lidarComSolicitacao(Solicitacao solicitacao) {
        if (podeLidarComSolicitacao(solicitacao.getTipoSolicitacao())) {
            return getDescricaoEquipe();
        } else if (equipeSuperior != null) {
            return equipeSuperior.lidarComSolicitacao(solicitacao);
        } else {
            return "Solicitação não atendida";
        }
    }

    public abstract boolean podeLidarComSolicitacao(TipoSolicitacao tipoSolicitacao);
    public abstract String getDescricaoEquipe();
}