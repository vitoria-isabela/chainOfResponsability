package chainofresponsability;

public class EquipeSuporteTécnico extends EquipeSuporte {
    public boolean podeLidarComSolicitacao(TipoSolicitacao tipoSolicitacao) {
        return tipoSolicitacao == TipoSolicitacao.TÉCNICA;
    }

    public String getDescricaoEquipe() {
        return "Equipe de Suporte Técnico";
    }
}