package chainofresponsability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuporteClienteTest {

    @Test
    void Given_SolicitacaoGeral_When_LidarComSolicitacao_Then_DeveSerAtendidaPelaEquipeGeral() {
        Solicitacao solicitacao = new Solicitacao(TipoSolicitacao.GERAL);
        EquipeSuporte equipe = new EquipeAtendimentoGeral();

        String resultado = equipe.lidarComSolicitacao(solicitacao);

        assertEquals("Equipe de Atendimento Geral", resultado);
    }

    @Test
    void Given_SolicitacaoTécnica_When_LidarComSolicitacao_Then_DeveSerAtendidaPelaEquipeTécnica() {
        Solicitacao solicitacao = new Solicitacao(TipoSolicitacao.TÉCNICA);
        EquipeSuporte equipe = new EquipeSuporteTécnico();

        String resultado = equipe.lidarComSolicitacao(solicitacao);

        assertEquals("Equipe de Suporte Técnico", resultado);
    }

    @Test
    void Given_SolicitacaoFinanceira_When_LidarComSolicitacao_Then_DeveSerAtendidaPelaEquipeFinanceira() {
        Solicitacao solicitacao = new Solicitacao(TipoSolicitacao.FINANCEIRA);
        EquipeSuporte equipe = new EquipeFinanceira();

        String resultado = equipe.lidarComSolicitacao(solicitacao);

        assertEquals("Equipe Financeira", resultado);
    }

    @Test
    void Given_SolicitacaoReclamação_When_LidarComSolicitacao_Then_DeveSerAtendidaPelaEquipeReclamação() {
        Solicitacao solicitacao = new Solicitacao(TipoSolicitacao.RECLAMAÇÃO);
        EquipeSuporte equipe = new EquipeReclamação();

        String resultado = equipe.lidarComSolicitacao(solicitacao);

        assertEquals("Equipe de Reclamação", resultado);
    }

    @Test
    void Given_SolicitacaoDesconhecida_When_LidarComSolicitacao_Then_DeveRetornarSolicitaçãoNãoAtendida() {
        Solicitacao solicitacao = new Solicitacao(TipoSolicitacao.DESCONHECIDA);
        EquipeSuporte equipe = new EquipeAtendimentoGeral();

        String resultado = equipe.lidarComSolicitacao(solicitacao);

        assertEquals("Solicitação não atendida", resultado);
    }
}