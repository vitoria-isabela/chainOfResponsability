package chainofresponsability;

public class Solicitacao {
    private TipoSolicitacao tipoSolicitacao;

    public Solicitacao(TipoSolicitacao tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }

    public TipoSolicitacao getTipoSolicitacao() {
        return tipoSolicitacao;
    }
}