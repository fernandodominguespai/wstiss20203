//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.ans.padroes.tiss.schemas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CtProcedimentosRealizadosProcedimentoRealizadoValor_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "valor");
    private final static QName _CtProcedimentosRealizadosProcedimentoRealizadoValorTotal_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "valorTotal");
    private final static QName _CtEnderecoComplemento_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "complemento");
    private final static QName _CtDiagnosticoAtendimentoTempoReferidoEvolucaoDoenca_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "tempoReferidoEvolucaoDoenca");
    private final static QName _CtDiagnosticoAtendimentoTipoDoenca_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "tipoDoenca");
    private final static QName _CtHipoteseDiagnosticaDiagnosticosSecundarios_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "diagnosticosSecundarios");
    private final static QName _CtDiagnosticoDescricaoDiagnostico_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "descricaoDiagnostico");
    private final static QName _CtTabelaDescricao_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "descricao");
    private final static QName _CtGuiaSolicitacaoSPSADTIndicacaoClinica_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "indicacaoClinica");
    private final static QName _CtGuiaSolicitacaoSPSADTDiagnostico_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "Diagnostico");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.ans.padroes.tiss.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MensagemTISS }
     * 
     */
    public MensagemTISS createMensagemTISS() {
        return new MensagemTISS();
    }

    /**
     * Create an instance of {@link CtGuiaHonorarioIndividual }
     * 
     */
    public CtGuiaHonorarioIndividual createCtGuiaHonorarioIndividual() {
        return new CtGuiaHonorarioIndividual();
    }

    /**
     * Create an instance of {@link CtProcedimentosRealizados }
     * 
     */
    public CtProcedimentosRealizados createCtProcedimentosRealizados() {
        return new CtProcedimentosRealizados();
    }

    /**
     * Create an instance of {@link CtDadosGuia }
     * 
     */
    public CtDadosGuia createCtDadosGuia() {
        return new CtDadosGuia();
    }

    /**
     * Create an instance of {@link CtCabecalhoSolicitacao }
     * 
     */
    public CtCabecalhoSolicitacao createCtCabecalhoSolicitacao() {
        return new CtCabecalhoSolicitacao();
    }

    /**
     * Create an instance of {@link CtOPMSolicitadas }
     * 
     */
    public CtOPMSolicitadas createCtOPMSolicitadas() {
        return new CtOPMSolicitadas();
    }

    /**
     * Create an instance of {@link CtReciboComunicacaoBeneficiario }
     * 
     */
    public CtReciboComunicacaoBeneficiario createCtReciboComunicacaoBeneficiario() {
        return new CtReciboComunicacaoBeneficiario();
    }

    /**
     * Create an instance of {@link CtOPMUtilizadasRevisao }
     * 
     */
    public CtOPMUtilizadasRevisao createCtOPMUtilizadasRevisao() {
        return new CtOPMUtilizadasRevisao();
    }

    /**
     * Create an instance of {@link CtOPMUtilizadasRevisao.OPMUtilizada }
     * 
     */
    public CtOPMUtilizadasRevisao.OPMUtilizada createCtOPMUtilizadasRevisaoOPMUtilizada() {
        return new CtOPMUtilizadasRevisao.OPMUtilizada();
    }

    /**
     * Create an instance of {@link CtDadosProcedimento }
     * 
     */
    public CtDadosProcedimento createCtDadosProcedimento() {
        return new CtDadosProcedimento();
    }

    /**
     * Create an instance of {@link CtIdentificacaoFontePagadora }
     * 
     */
    public CtIdentificacaoFontePagadora createCtIdentificacaoFontePagadora() {
        return new CtIdentificacaoFontePagadora();
    }

    /**
     * Create an instance of {@link CtOutrasDespesas }
     * 
     */
    public CtOutrasDespesas createCtOutrasDespesas() {
        return new CtOutrasDespesas();
    }

    /**
     * Create an instance of {@link CtGuiaConsulta }
     * 
     */
    public CtGuiaConsulta createCtGuiaConsulta() {
        return new CtGuiaConsulta();
    }

    /**
     * Create an instance of {@link CtAtendimentoConsulta }
     * 
     */
    public CtAtendimentoConsulta createCtAtendimentoConsulta() {
        return new CtAtendimentoConsulta();
    }

    /**
     * Create an instance of {@link CtStatusProtocolo }
     * 
     */
    public CtStatusProtocolo createCtStatusProtocolo() {
        return new CtStatusProtocolo();
    }

    /**
     * Create an instance of {@link CtGuiaSolicitacaoOdonto }
     * 
     */
    public CtGuiaSolicitacaoOdonto createCtGuiaSolicitacaoOdonto() {
        return new CtGuiaSolicitacaoOdonto();
    }

    /**
     * Create an instance of {@link CtGuiaSolicitacaoOdonto.PlanoTratamento }
     * 
     */
    public CtGuiaSolicitacaoOdonto.PlanoTratamento createCtGuiaSolicitacaoOdontoPlanoTratamento() {
        return new CtGuiaSolicitacaoOdonto.PlanoTratamento();
    }

    /**
     * Create an instance of {@link CtGuiaSolicitacaoOdonto.DadosSolicitante }
     * 
     */
    public CtGuiaSolicitacaoOdonto.DadosSolicitante createCtGuiaSolicitacaoOdontoDadosSolicitante() {
        return new CtGuiaSolicitacaoOdonto.DadosSolicitante();
    }

    /**
     * Create an instance of {@link CtAnexoSituacaoInicial }
     * 
     */
    public CtAnexoSituacaoInicial createCtAnexoSituacaoInicial() {
        return new CtAnexoSituacaoInicial();
    }

    /**
     * Create an instance of {@link CtAnexoSituacaoInicial.DadosContratadoExecutante }
     * 
     */
    public CtAnexoSituacaoInicial.DadosContratadoExecutante createCtAnexoSituacaoInicialDadosContratadoExecutante() {
        return new CtAnexoSituacaoInicial.DadosContratadoExecutante();
    }

    /**
     * Create an instance of {@link CtDetalheGuiaOdonto }
     * 
     */
    public CtDetalheGuiaOdonto createCtDetalheGuiaOdonto() {
        return new CtDetalheGuiaOdonto();
    }

    /**
     * Create an instance of {@link CtDadosConta }
     * 
     */
    public CtDadosConta createCtDadosConta() {
        return new CtDadosConta();
    }

    /**
     * Create an instance of {@link CtGuiaSolicitacaoSPSADT }
     * 
     */
    public CtGuiaSolicitacaoSPSADT createCtGuiaSolicitacaoSPSADT() {
        return new CtGuiaSolicitacaoSPSADT();
    }

    /**
     * Create an instance of {@link CtDetalheProtocolo }
     * 
     */
    public CtDetalheProtocolo createCtDetalheProtocolo() {
        return new CtDetalheProtocolo();
    }

    /**
     * Create an instance of {@link CtGuiaConsultaReapresentacao }
     * 
     */
    public CtGuiaConsultaReapresentacao createCtGuiaConsultaReapresentacao() {
        return new CtGuiaConsultaReapresentacao();
    }

    /**
     * Create an instance of {@link CtLoteGuias }
     * 
     */
    public CtLoteGuias createCtLoteGuias() {
        return new CtLoteGuias();
    }

    /**
     * Create an instance of {@link CtGuias }
     * 
     */
    public CtGuias createCtGuias() {
        return new CtGuias();
    }

    /**
     * Create an instance of {@link CtCabecalhoGuia }
     * 
     */
    public CtCabecalhoGuia createCtCabecalhoGuia() {
        return new CtCabecalhoGuia();
    }

    /**
     * Create an instance of {@link CtSituacaoAutorizacao }
     * 
     */
    public CtSituacaoAutorizacao createCtSituacaoAutorizacao() {
        return new CtSituacaoAutorizacao();
    }

    /**
     * Create an instance of {@link CtAutorizacaoProcedimento }
     * 
     */
    public CtAutorizacaoProcedimento createCtAutorizacaoProcedimento() {
        return new CtAutorizacaoProcedimento();
    }

    /**
     * Create an instance of {@link CtSituacaoAutorizacao.DadosAutorizacao }
     * 
     */
    public CtSituacaoAutorizacao.DadosAutorizacao createCtSituacaoAutorizacaoDadosAutorizacao() {
        return new CtSituacaoAutorizacao.DadosAutorizacao();
    }

    /**
     * Create an instance of {@link CtDadosPagamento }
     * 
     */
    public CtDadosPagamento createCtDadosPagamento() {
        return new CtDadosPagamento();
    }

    /**
     * Create an instance of {@link CtIdentificacaoEquipe }
     * 
     */
    public CtIdentificacaoEquipe createCtIdentificacaoEquipe() {
        return new CtIdentificacaoEquipe();
    }

    /**
     * Create an instance of {@link CtGuiaOdontologia }
     * 
     */
    public CtGuiaOdontologia createCtGuiaOdontologia() {
        return new CtGuiaOdontologia();
    }

    /**
     * Create an instance of {@link CtGuiaOdontologia.ProcedimentosExecutados }
     * 
     */
    public CtGuiaOdontologia.ProcedimentosExecutados createCtGuiaOdontologiaProcedimentosExecutados() {
        return new CtGuiaOdontologia.ProcedimentosExecutados();
    }

    /**
     * Create an instance of {@link CtGuiaOdontologia.DadosContratadoExecutante }
     * 
     */
    public CtGuiaOdontologia.DadosContratadoExecutante createCtGuiaOdontologiaDadosContratadoExecutante() {
        return new CtGuiaOdontologia.DadosContratadoExecutante();
    }

    /**
     * Create an instance of {@link CtProtocoloRecebimentoAnexo }
     * 
     */
    public CtProtocoloRecebimentoAnexo createCtProtocoloRecebimentoAnexo() {
        return new CtProtocoloRecebimentoAnexo();
    }

    /**
     * Create an instance of {@link CtProtocoloRecebimentoAnexo.ProtocoloRecebimento }
     * 
     */
    public CtProtocoloRecebimentoAnexo.ProtocoloRecebimento createCtProtocoloRecebimentoAnexoProtocoloRecebimento() {
        return new CtProtocoloRecebimentoAnexo.ProtocoloRecebimento();
    }

    /**
     * Create an instance of {@link CtOPMUtilizada }
     * 
     */
    public CtOPMUtilizada createCtOPMUtilizada() {
        return new CtOPMUtilizada();
    }

    /**
     * Create an instance of {@link CtOPMUtilizada.OPM }
     * 
     */
    public CtOPMUtilizada.OPM createCtOPMUtilizadaOPM() {
        return new CtOPMUtilizada.OPM();
    }

    /**
     * Create an instance of {@link CtCabecalhoGuiaOdonto }
     * 
     */
    public CtCabecalhoGuiaOdonto createCtCabecalhoGuiaOdonto() {
        return new CtCabecalhoGuiaOdonto();
    }

    /**
     * Create an instance of {@link CtLoteAnexo }
     * 
     */
    public CtLoteAnexo createCtLoteAnexo() {
        return new CtLoteAnexo();
    }

    /**
     * Create an instance of {@link CtProtocoloRecebimento }
     * 
     */
    public CtProtocoloRecebimento createCtProtocoloRecebimento() {
        return new CtProtocoloRecebimento();
    }

    /**
     * Create an instance of {@link CtGuiaHonorarioIndividualReapresentacao }
     * 
     */
    public CtGuiaHonorarioIndividualReapresentacao createCtGuiaHonorarioIndividualReapresentacao() {
        return new CtGuiaHonorarioIndividualReapresentacao();
    }

    /**
     * Create an instance of {@link CtProcedimentoRevisao }
     * 
     */
    public CtProcedimentoRevisao createCtProcedimentoRevisao() {
        return new CtProcedimentoRevisao();
    }

    /**
     * Create an instance of {@link CtProcedimentoOdontoRevisao }
     * 
     */
    public CtProcedimentoOdontoRevisao createCtProcedimentoOdontoRevisao() {
        return new CtProcedimentoOdontoRevisao();
    }

    /**
     * Create an instance of {@link CtAutorizacaoProcedimentoOdonto }
     * 
     */
    public CtAutorizacaoProcedimentoOdonto createCtAutorizacaoProcedimentoOdonto() {
        return new CtAutorizacaoProcedimentoOdonto();
    }

    /**
     * Create an instance of {@link CtDescontos }
     * 
     */
    public CtDescontos createCtDescontos() {
        return new CtDescontos();
    }

    /**
     * Create an instance of {@link CtAtendimentoConsultaReapr }
     * 
     */
    public CtAtendimentoConsultaReapr createCtAtendimentoConsultaReapr() {
        return new CtAtendimentoConsultaReapr();
    }

    /**
     * Create an instance of {@link CtDemonstrativoPagamento }
     * 
     */
    public CtDemonstrativoPagamento createCtDemonstrativoPagamento() {
        return new CtDemonstrativoPagamento();
    }

    /**
     * Create an instance of {@link CtGuiaSolicInternacao }
     * 
     */
    public CtGuiaSolicInternacao createCtGuiaSolicInternacao() {
        return new CtGuiaSolicInternacao();
    }

    /**
     * Create an instance of {@link CtReciboCancelaGuia }
     * 
     */
    public CtReciboCancelaGuia createCtReciboCancelaGuia() {
        return new CtReciboCancelaGuia();
    }

    /**
     * Create an instance of {@link CtReciboCancelaGuia.GuiasCanceladas }
     * 
     */
    public CtReciboCancelaGuia.GuiasCanceladas createCtReciboCancelaGuiaGuiasCanceladas() {
        return new CtReciboCancelaGuia.GuiasCanceladas();
    }

    /**
     * Create an instance of {@link CtProcedimentosSolicitados }
     * 
     */
    public CtProcedimentosSolicitados createCtProcedimentosSolicitados() {
        return new CtProcedimentosSolicitados();
    }

    /**
     * Create an instance of {@link CtGuiaSPSADTReapresentacao }
     * 
     */
    public CtGuiaSPSADTReapresentacao createCtGuiaSPSADTReapresentacao() {
        return new CtGuiaSPSADTReapresentacao();
    }

    /**
     * Create an instance of {@link CtGuiaSPSADTReapresentacao.PrestadorExecutante }
     * 
     */
    public CtGuiaSPSADTReapresentacao.PrestadorExecutante createCtGuiaSPSADTReapresentacaoPrestadorExecutante() {
        return new CtGuiaSPSADTReapresentacao.PrestadorExecutante();
    }

    /**
     * Create an instance of {@link CtSituacaoClinica }
     * 
     */
    public CtSituacaoClinica createCtSituacaoClinica() {
        return new CtSituacaoClinica();
    }

    /**
     * Create an instance of {@link CtItemSolicitacaoOdonto }
     * 
     */
    public CtItemSolicitacaoOdonto createCtItemSolicitacaoOdonto() {
        return new CtItemSolicitacaoOdonto();
    }

    /**
     * Create an instance of {@link CtProcedimentoRealizadoEquipe }
     * 
     */
    public CtProcedimentoRealizadoEquipe createCtProcedimentoRealizadoEquipe() {
        return new CtProcedimentoRealizadoEquipe();
    }

    /**
     * Create an instance of {@link CtDemonstrativoAnaliseConta }
     * 
     */
    public CtDemonstrativoAnaliseConta createCtDemonstrativoAnaliseConta() {
        return new CtDemonstrativoAnaliseConta();
    }

    /**
     * Create an instance of {@link CtProcedimentoOdontoRealizado }
     * 
     */
    public CtProcedimentoOdontoRealizado createCtProcedimentoOdontoRealizado() {
        return new CtProcedimentoOdontoRealizado();
    }

    /**
     * Create an instance of {@link CtOutrasDespesasRevisao }
     * 
     */
    public CtOutrasDespesasRevisao createCtOutrasDespesasRevisao() {
        return new CtOutrasDespesasRevisao();
    }

    /**
     * Create an instance of {@link CtItemSolicitacao }
     * 
     */
    public CtItemSolicitacao createCtItemSolicitacao() {
        return new CtItemSolicitacao();
    }

    /**
     * Create an instance of {@link CtSolicitacaoStatusProtocolo }
     * 
     */
    public CtSolicitacaoStatusProtocolo createCtSolicitacaoStatusProtocolo() {
        return new CtSolicitacaoStatusProtocolo();
    }

    /**
     * Create an instance of {@link CtGuiaSPSADT }
     * 
     */
    public CtGuiaSPSADT createCtGuiaSPSADT() {
        return new CtGuiaSPSADT();
    }

    /**
     * Create an instance of {@link CtGuiaSPSADT.PrestadorExecutante }
     * 
     */
    public CtGuiaSPSADT.PrestadorExecutante createCtGuiaSPSADTPrestadorExecutante() {
        return new CtGuiaSPSADT.PrestadorExecutante();
    }

    /**
     * Create an instance of {@link CtDemonstrativoOdontologia }
     * 
     */
    public CtDemonstrativoOdontologia createCtDemonstrativoOdontologia() {
        return new CtDemonstrativoOdontologia();
    }

    /**
     * Create an instance of {@link CtOPMAutorizada }
     * 
     */
    public CtOPMAutorizada createCtOPMAutorizada() {
        return new CtOPMAutorizada();
    }

    /**
     * Create an instance of {@link CtDadosLote }
     * 
     */
    public CtDadosLote createCtDadosLote() {
        return new CtDadosLote();
    }

    /**
     * Create an instance of {@link CtSolicitaStatusAutorizacao }
     * 
     */
    public CtSolicitaStatusAutorizacao createCtSolicitaStatusAutorizacao() {
        return new CtSolicitaStatusAutorizacao();
    }

    /**
     * Create an instance of {@link CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao }
     * 
     */
    public CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao createCtSolicitaStatusAutorizacaoIdentificacaoAutorizacao() {
        return new CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao();
    }

    /**
     * Create an instance of {@link CtGuiaTratamentoOdontologicoReapresentacao }
     * 
     */
    public CtGuiaTratamentoOdontologicoReapresentacao createCtGuiaTratamentoOdontologicoReapresentacao() {
        return new CtGuiaTratamentoOdontologicoReapresentacao();
    }

    /**
     * Create an instance of {@link CtGuiaTratamentoOdontologicoReapresentacao.DadosContratadoExecutante }
     * 
     */
    public CtGuiaTratamentoOdontologicoReapresentacao.DadosContratadoExecutante createCtGuiaTratamentoOdontologicoReapresentacaoDadosContratadoExecutante() {
        return new CtGuiaTratamentoOdontologicoReapresentacao.DadosContratadoExecutante();
    }

    /**
     * Create an instance of {@link CtStatusLote }
     * 
     */
    public CtStatusLote createCtStatusLote() {
        return new CtStatusLote();
    }

    /**
     * Create an instance of {@link CtStatusLote.Guias }
     * 
     */
    public CtStatusLote.Guias createCtStatusLoteGuias() {
        return new CtStatusLote.Guias();
    }

    /**
     * Create an instance of {@link CtStatusLote.Guias.DetalheguiaOdonto }
     * 
     */
    public CtStatusLote.Guias.DetalheguiaOdonto createCtStatusLoteGuiasDetalheguiaOdonto() {
        return new CtStatusLote.Guias.DetalheguiaOdonto();
    }

    /**
     * Create an instance of {@link CtStatusLote.Guias.DetalheguiaMedica }
     * 
     */
    public CtStatusLote.Guias.DetalheguiaMedica createCtStatusLoteGuiasDetalheguiaMedica() {
        return new CtStatusLote.Guias.DetalheguiaMedica();
    }

    /**
     * Create an instance of {@link CtCancelaGuia }
     * 
     */
    public CtCancelaGuia createCtCancelaGuia() {
        return new CtCancelaGuia();
    }

    /**
     * Create an instance of {@link MensagemTISS.PrestadorParaOperadora }
     * 
     */
    public MensagemTISS.PrestadorParaOperadora createMensagemTISSPrestadorParaOperadora() {
        return new MensagemTISS.PrestadorParaOperadora();
    }

    /**
     * Create an instance of {@link MensagemTISS.OperadoraParaPrestador }
     * 
     */
    public MensagemTISS.OperadoraParaPrestador createMensagemTISSOperadoraParaPrestador() {
        return new MensagemTISS.OperadoraParaPrestador();
    }

    /**
     * Create an instance of {@link MensagemTISS.OperadoraParaPrestador.AutorizacaoServico }
     * 
     */
    public MensagemTISS.OperadoraParaPrestador.AutorizacaoServico createMensagemTISSOperadoraParaPrestadorAutorizacaoServico() {
        return new MensagemTISS.OperadoraParaPrestador.AutorizacaoServico();
    }

    /**
     * Create an instance of {@link CabecalhoTransacao }
     * 
     */
    public CabecalhoTransacao createCabecalhoTransacao() {
        return new CabecalhoTransacao();
    }

    /**
     * Create an instance of {@link NodoTissnet }
     * 
     */
    public NodoTissnet createNodoTissnet() {
        return new NodoTissnet();
    }

    /**
     * Create an instance of {@link DefinicaoTissNet }
     * 
     */
    public DefinicaoTissNet createDefinicaoTissNet() {
        return new DefinicaoTissNet();
    }

    /**
     * Create an instance of {@link MensagemTISS.Epilogo }
     * 
     */
    public MensagemTISS.Epilogo createMensagemTISSEpilogo() {
        return new MensagemTISS.Epilogo();
    }

    /**
     * Create an instance of {@link CtDenteRegiao }
     * 
     */
    public CtDenteRegiao createCtDenteRegiao() {
        return new CtDenteRegiao();
    }

    /**
     * Create an instance of {@link CtExecutanteComplementar }
     * 
     */
    public CtExecutanteComplementar createCtExecutanteComplementar() {
        return new CtExecutanteComplementar();
    }

    /**
     * Create an instance of {@link CtObitoInternacao }
     * 
     */
    public CtObitoInternacao createCtObitoInternacao() {
        return new CtObitoInternacao();
    }

    /**
     * Create an instance of {@link CtCabecalhoDemonstrativo }
     * 
     */
    public CtCabecalhoDemonstrativo createCtCabecalhoDemonstrativo() {
        return new CtCabecalhoDemonstrativo();
    }

    /**
     * Create an instance of {@link CtIdentificacaoProfissional }
     * 
     */
    public CtIdentificacaoProfissional createCtIdentificacaoProfissional() {
        return new CtIdentificacaoProfissional();
    }

    /**
     * Create an instance of {@link CtPeriodoProcessamento }
     * 
     */
    public CtPeriodoProcessamento createCtPeriodoProcessamento() {
        return new CtPeriodoProcessamento();
    }

    /**
     * Create an instance of {@link CtMotivoGlosa }
     * 
     */
    public CtMotivoGlosa createCtMotivoGlosa() {
        return new CtMotivoGlosa();
    }

    /**
     * Create an instance of {@link CtRetornoElegibilidade }
     * 
     */
    public CtRetornoElegibilidade createCtRetornoElegibilidade() {
        return new CtRetornoElegibilidade();
    }

    /**
     * Create an instance of {@link CtDiagnostico }
     * 
     */
    public CtDiagnostico createCtDiagnostico() {
        return new CtDiagnostico();
    }

    /**
     * Create an instance of {@link CtDadoBancario }
     * 
     */
    public CtDadoBancario createCtDadoBancario() {
        return new CtDadoBancario();
    }

    /**
     * Create an instance of {@link CtIdentificadorPrestOdontoDemo }
     * 
     */
    public CtIdentificadorPrestOdontoDemo createCtIdentificadorPrestOdontoDemo() {
        return new CtIdentificadorPrestOdontoDemo();
    }

    /**
     * Create an instance of {@link CtDiagnosticosSecundarios }
     * 
     */
    public CtDiagnosticosSecundarios createCtDiagnosticosSecundarios() {
        return new CtDiagnosticosSecundarios();
    }

    /**
     * Create an instance of {@link CtDadosResumo }
     * 
     */
    public CtDadosResumo createCtDadosResumo() {
        return new CtDadosResumo();
    }

    /**
     * Create an instance of {@link CtDiagnosticoGuia }
     * 
     */
    public CtDiagnosticoGuia createCtDiagnosticoGuia() {
        return new CtDiagnosticoGuia();
    }

    /**
     * Create an instance of {@link CtGuiaResumoInternacaoReapresentacao }
     * 
     */
    public CtGuiaResumoInternacaoReapresentacao createCtGuiaResumoInternacaoReapresentacao() {
        return new CtGuiaResumoInternacaoReapresentacao();
    }

    /**
     * Create an instance of {@link CtCabecalhoAnexoOdonto }
     * 
     */
    public CtCabecalhoAnexoOdonto createCtCabecalhoAnexoOdonto() {
        return new CtCabecalhoAnexoOdonto();
    }

    /**
     * Create an instance of {@link CtSolicitaElegibilidade }
     * 
     */
    public CtSolicitaElegibilidade createCtSolicitaElegibilidade() {
        return new CtSolicitaElegibilidade();
    }

    /**
     * Create an instance of {@link CtProcedimentoOdontologia }
     * 
     */
    public CtProcedimentoOdontologia createCtProcedimentoOdontologia() {
        return new CtProcedimentoOdontologia();
    }

    /**
     * Create an instance of {@link CtIdentificacaoPrestadorExecutante }
     * 
     */
    public CtIdentificacaoPrestadorExecutante createCtIdentificacaoPrestadorExecutante() {
        return new CtIdentificacaoPrestadorExecutante();
    }

    /**
     * Create an instance of {@link CtIdentificacaoPrestador }
     * 
     */
    public CtIdentificacaoPrestador createCtIdentificacaoPrestador() {
        return new CtIdentificacaoPrestador();
    }

    /**
     * Create an instance of {@link CtTotalDemoOdonto }
     * 
     */
    public CtTotalDemoOdonto createCtTotalDemoOdonto() {
        return new CtTotalDemoOdonto();
    }

    /**
     * Create an instance of {@link CtLoteOdonto }
     * 
     */
    public CtLoteOdonto createCtLoteOdonto() {
        return new CtLoteOdonto();
    }

    /**
     * Create an instance of {@link CtSituacaoDentes }
     * 
     */
    public CtSituacaoDentes createCtSituacaoDentes() {
        return new CtSituacaoDentes();
    }

    /**
     * Create an instance of {@link CtObitoNeonatal }
     * 
     */
    public CtObitoNeonatal createCtObitoNeonatal() {
        return new CtObitoNeonatal();
    }

    /**
     * Create an instance of {@link CtAtendimentoOdontologia }
     * 
     */
    public CtAtendimentoOdontologia createCtAtendimentoOdontologia() {
        return new CtAtendimentoOdontologia();
    }

    /**
     * Create an instance of {@link CtValorTotalServicos }
     * 
     */
    public CtValorTotalServicos createCtValorTotalServicos() {
        return new CtValorTotalServicos();
    }

    /**
     * Create an instance of {@link CtSituacaoInicial }
     * 
     */
    public CtSituacaoInicial createCtSituacaoInicial() {
        return new CtSituacaoInicial();
    }

    /**
     * Create an instance of {@link CtTabela }
     * 
     */
    public CtTabela createCtTabela() {
        return new CtTabela();
    }

    /**
     * Create an instance of {@link CtAutorizacaoGuiaInternacao }
     * 
     */
    public CtAutorizacaoGuiaInternacao createCtAutorizacaoGuiaInternacao() {
        return new CtAutorizacaoGuiaInternacao();
    }

    /**
     * Create an instance of {@link CtDiagnosticoSaidaInternacao }
     * 
     */
    public CtDiagnosticoSaidaInternacao createCtDiagnosticoSaidaInternacao() {
        return new CtDiagnosticoSaidaInternacao();
    }

    /**
     * Create an instance of {@link CtGuiaSolicitacaoProrrogacao }
     * 
     */
    public CtGuiaSolicitacaoProrrogacao createCtGuiaSolicitacaoProrrogacao() {
        return new CtGuiaSolicitacaoProrrogacao();
    }

    /**
     * Create an instance of {@link CtHipoteseDiagnostica }
     * 
     */
    public CtHipoteseDiagnostica createCtHipoteseDiagnostica() {
        return new CtHipoteseDiagnostica();
    }

    /**
     * Create an instance of {@link CtIdentificacaoPrestadorEquipe }
     * 
     */
    public CtIdentificacaoPrestadorEquipe createCtIdentificacaoPrestadorEquipe() {
        return new CtIdentificacaoPrestadorEquipe();
    }

    /**
     * Create an instance of {@link CtDescontoOdonto }
     * 
     */
    public CtDescontoOdonto createCtDescontoOdonto() {
        return new CtDescontoOdonto();
    }

    /**
     * Create an instance of {@link CtGuiaResumoInternacao }
     * 
     */
    public CtGuiaResumoInternacao createCtGuiaResumoInternacao() {
        return new CtGuiaResumoInternacao();
    }

    /**
     * Create an instance of {@link CtSolicitacaoDemonstrativoPagamento }
     * 
     */
    public CtSolicitacaoDemonstrativoPagamento createCtSolicitacaoDemonstrativoPagamento() {
        return new CtSolicitacaoDemonstrativoPagamento();
    }

    /**
     * Create an instance of {@link CtNumeroDN }
     * 
     */
    public CtNumeroDN createCtNumeroDN() {
        return new CtNumeroDN();
    }

    /**
     * Create an instance of {@link CtDiagnosticoAtendimento }
     * 
     */
    public CtDiagnosticoAtendimento createCtDiagnosticoAtendimento() {
        return new CtDiagnosticoAtendimento();
    }

    /**
     * Create an instance of {@link CtIdentificacaoProfissionalCompl }
     * 
     */
    public CtIdentificacaoProfissionalCompl createCtIdentificacaoProfissionalCompl() {
        return new CtIdentificacaoProfissionalCompl();
    }

    /**
     * Create an instance of {@link CtTempoEvolucaoDoenca }
     * 
     */
    public CtTempoEvolucaoDoenca createCtTempoEvolucaoDoenca() {
        return new CtTempoEvolucaoDoenca();
    }

    /**
     * Create an instance of {@link CtProfissionalExecutante }
     * 
     */
    public CtProfissionalExecutante createCtProfissionalExecutante() {
        return new CtProfissionalExecutante();
    }

    /**
     * Create an instance of {@link CtBeneficiario }
     * 
     */
    public CtBeneficiario createCtBeneficiario() {
        return new CtBeneficiario();
    }

    /**
     * Create an instance of {@link CtConselhoProfissional }
     * 
     */
    public CtConselhoProfissional createCtConselhoProfissional() {
        return new CtConselhoProfissional();
    }

    /**
     * Create an instance of {@link CtCreditoOdonto }
     * 
     */
    public CtCreditoOdonto createCtCreditoOdonto() {
        return new CtCreditoOdonto();
    }

    /**
     * Create an instance of {@link CtEndereco }
     * 
     */
    public CtEndereco createCtEndereco() {
        return new CtEndereco();
    }

    /**
     * Create an instance of {@link CtAutorizacaoGuia }
     * 
     */
    public CtAutorizacaoGuia createCtAutorizacaoGuia() {
        return new CtAutorizacaoGuia();
    }

    /**
     * Create an instance of {@link CtDiariaProrrogacao }
     * 
     */
    public CtDiariaProrrogacao createCtDiariaProrrogacao() {
        return new CtDiariaProrrogacao();
    }

    /**
     * Create an instance of {@link CtTratamenteOdontoRealizado }
     * 
     */
    public CtTratamenteOdontoRealizado createCtTratamenteOdontoRealizado() {
        return new CtTratamenteOdontoRealizado();
    }

    /**
     * Create an instance of {@link CtTratamentoOdontoSolicitado }
     * 
     */
    public CtTratamentoOdontoSolicitado createCtTratamentoOdontoSolicitado() {
        return new CtTratamentoOdontoSolicitado();
    }

    /**
     * Create an instance of {@link CtSolicitante }
     * 
     */
    public CtSolicitante createCtSolicitante() {
        return new CtSolicitante();
    }

    /**
     * Create an instance of {@link CtComunicacaoBeneficiario }
     * 
     */
    public CtComunicacaoBeneficiario createCtComunicacaoBeneficiario() {
        return new CtComunicacaoBeneficiario();
    }

    /**
     * Create an instance of {@link CtHostporta }
     * 
     */
    public CtHostporta createCtHostporta() {
        return new CtHostporta();
    }

    /**
     * Create an instance of {@link CtTotaisOdonto }
     * 
     */
    public CtTotaisOdonto createCtTotaisOdonto() {
        return new CtTotaisOdonto();
    }

    /**
     * Create an instance of {@link CtContratado }
     * 
     */
    public CtContratado createCtContratado() {
        return new CtContratado();
    }

    /**
     * Create an instance of {@link CtIdentificacaoSoftwareGerador }
     * 
     */
    public CtIdentificacaoSoftwareGerador createCtIdentificacaoSoftwareGerador() {
        return new CtIdentificacaoSoftwareGerador();
    }

    /**
     * Create an instance of {@link CtContratadoSolicitante }
     * 
     */
    public CtContratadoSolicitante createCtContratadoSolicitante() {
        return new CtContratadoSolicitante();
    }

    /**
     * Create an instance of {@link CtInternacaoObstetrica }
     * 
     */
    public CtInternacaoObstetrica createCtInternacaoObstetrica() {
        return new CtInternacaoObstetrica();
    }

    /**
     * Create an instance of {@link br.gov.ans.padroes.tiss.schemas.CtDiariaProrrogacaoAutorizada }
     * 
     */
    public br.gov.ans.padroes.tiss.schemas.CtDiariaProrrogacaoAutorizada createCtDiariaProrrogacaoAutorizada() {
        return new br.gov.ans.padroes.tiss.schemas.CtDiariaProrrogacaoAutorizada();
    }

    /**
     * Create an instance of {@link CtGuiaHonorarioIndividual.ContratadoExecutante }
     * 
     */
    public CtGuiaHonorarioIndividual.ContratadoExecutante createCtGuiaHonorarioIndividualContratadoExecutante() {
        return new CtGuiaHonorarioIndividual.ContratadoExecutante();
    }

    /**
     * Create an instance of {@link CtGuiaHonorarioIndividual.ProcedimentosExamesRealizados }
     * 
     */
    public CtGuiaHonorarioIndividual.ProcedimentosExamesRealizados createCtGuiaHonorarioIndividualProcedimentosExamesRealizados() {
        return new CtGuiaHonorarioIndividual.ProcedimentosExamesRealizados();
    }

    /**
     * Create an instance of {@link CtProcedimentosRealizados.ProcedimentoRealizado }
     * 
     */
    public CtProcedimentosRealizados.ProcedimentoRealizado createCtProcedimentosRealizadosProcedimentoRealizado() {
        return new CtProcedimentosRealizados.ProcedimentoRealizado();
    }

    /**
     * Create an instance of {@link CtDadosGuia.Procedimentos }
     * 
     */
    public CtDadosGuia.Procedimentos createCtDadosGuiaProcedimentos() {
        return new CtDadosGuia.Procedimentos();
    }

    /**
     * Create an instance of {@link CtCabecalhoSolicitacao.IdentificacaoFontePagadora }
     * 
     */
    public CtCabecalhoSolicitacao.IdentificacaoFontePagadora createCtCabecalhoSolicitacaoIdentificacaoFontePagadora() {
        return new CtCabecalhoSolicitacao.IdentificacaoFontePagadora();
    }

    /**
     * Create an instance of {@link CtOPMSolicitadas.OPMSolicitada }
     * 
     */
    public CtOPMSolicitadas.OPMSolicitada createCtOPMSolicitadasOPMSolicitada() {
        return new CtOPMSolicitadas.OPMSolicitada();
    }

    /**
     * Create an instance of {@link CtReciboComunicacaoBeneficiario.ReciboComunicacao }
     * 
     */
    public CtReciboComunicacaoBeneficiario.ReciboComunicacao createCtReciboComunicacaoBeneficiarioReciboComunicacao() {
        return new CtReciboComunicacaoBeneficiario.ReciboComunicacao();
    }

    /**
     * Create an instance of {@link CtOPMUtilizadasRevisao.OPMUtilizada.OPM }
     * 
     */
    public CtOPMUtilizadasRevisao.OPMUtilizada.OPM createCtOPMUtilizadasRevisaoOPMUtilizadaOPM() {
        return new CtOPMUtilizadasRevisao.OPMUtilizada.OPM();
    }

    /**
     * Create an instance of {@link CtDadosProcedimento.RelacaoGlosa }
     * 
     */
    public CtDadosProcedimento.RelacaoGlosa createCtDadosProcedimentoRelacaoGlosa() {
        return new CtDadosProcedimento.RelacaoGlosa();
    }

    /**
     * Create an instance of {@link CtIdentificacaoFontePagadora.OperadoraRegulada }
     * 
     */
    public CtIdentificacaoFontePagadora.OperadoraRegulada createCtIdentificacaoFontePagadoraOperadoraRegulada() {
        return new CtIdentificacaoFontePagadora.OperadoraRegulada();
    }

    /**
     * Create an instance of {@link CtIdentificacaoFontePagadora.EntidadeNaoRegulada }
     * 
     */
    public CtIdentificacaoFontePagadora.EntidadeNaoRegulada createCtIdentificacaoFontePagadoraEntidadeNaoRegulada() {
        return new CtIdentificacaoFontePagadora.EntidadeNaoRegulada();
    }

    /**
     * Create an instance of {@link CtOutrasDespesas.Despesa }
     * 
     */
    public CtOutrasDespesas.Despesa createCtOutrasDespesasDespesa() {
        return new CtOutrasDespesas.Despesa();
    }

    /**
     * Create an instance of {@link CtGuiaConsulta.HipoteseDiagnostica }
     * 
     */
    public CtGuiaConsulta.HipoteseDiagnostica createCtGuiaConsultaHipoteseDiagnostica() {
        return new CtGuiaConsulta.HipoteseDiagnostica();
    }

    /**
     * Create an instance of {@link CtGuiaConsulta.DadosAtendimento }
     * 
     */
    public CtGuiaConsulta.DadosAtendimento createCtGuiaConsultaDadosAtendimento() {
        return new CtGuiaConsulta.DadosAtendimento();
    }

    /**
     * Create an instance of {@link CtAtendimentoConsulta.Procedimento }
     * 
     */
    public CtAtendimentoConsulta.Procedimento createCtAtendimentoConsultaProcedimento() {
        return new CtAtendimentoConsulta.Procedimento();
    }

    /**
     * Create an instance of {@link CtStatusProtocolo.Lote }
     * 
     */
    public CtStatusProtocolo.Lote createCtStatusProtocoloLote() {
        return new CtStatusProtocolo.Lote();
    }

    /**
     * Create an instance of {@link CtGuiaSolicitacaoOdonto.DadosBeneficiario }
     * 
     */
    public CtGuiaSolicitacaoOdonto.DadosBeneficiario createCtGuiaSolicitacaoOdontoDadosBeneficiario() {
        return new CtGuiaSolicitacaoOdonto.DadosBeneficiario();
    }

    /**
     * Create an instance of {@link CtGuiaSolicitacaoOdonto.PlanoTratamento.ProcedimentoSolicitado }
     * 
     */
    public CtGuiaSolicitacaoOdonto.PlanoTratamento.ProcedimentoSolicitado createCtGuiaSolicitacaoOdontoPlanoTratamentoProcedimentoSolicitado() {
        return new CtGuiaSolicitacaoOdonto.PlanoTratamento.ProcedimentoSolicitado();
    }

    /**
     * Create an instance of {@link CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosContratado }
     * 
     */
    public CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosContratado createCtGuiaSolicitacaoOdontoDadosSolicitanteDadosContratado() {
        return new CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosContratado();
    }

    /**
     * Create an instance of {@link CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosProfissional }
     * 
     */
    public CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosProfissional createCtGuiaSolicitacaoOdontoDadosSolicitanteDadosProfissional() {
        return new CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosProfissional();
    }

    /**
     * Create an instance of {@link CtAnexoSituacaoInicial.DadosBeneficiario }
     * 
     */
    public CtAnexoSituacaoInicial.DadosBeneficiario createCtAnexoSituacaoInicialDadosBeneficiario() {
        return new CtAnexoSituacaoInicial.DadosBeneficiario();
    }

    /**
     * Create an instance of {@link CtAnexoSituacaoInicial.DadosContratadoExecutante.DadosContratado }
     * 
     */
    public CtAnexoSituacaoInicial.DadosContratadoExecutante.DadosContratado createCtAnexoSituacaoInicialDadosContratadoExecutanteDadosContratado() {
        return new CtAnexoSituacaoInicial.DadosContratadoExecutante.DadosContratado();
    }

    /**
     * Create an instance of {@link CtDetalheGuiaOdonto.ProcedimentoRealizado }
     * 
     */
    public CtDetalheGuiaOdonto.ProcedimentoRealizado createCtDetalheGuiaOdontoProcedimentoRealizado() {
        return new CtDetalheGuiaOdonto.ProcedimentoRealizado();
    }

    /**
     * Create an instance of {@link CtDadosConta.Lote }
     * 
     */
    public CtDadosConta.Lote createCtDadosContaLote() {
        return new CtDadosConta.Lote();
    }

    /**
     * Create an instance of {@link CtGuiaSolicitacaoSPSADT.PrestadorExecutante }
     * 
     */
    public CtGuiaSolicitacaoSPSADT.PrestadorExecutante createCtGuiaSolicitacaoSPSADTPrestadorExecutante() {
        return new CtGuiaSolicitacaoSPSADT.PrestadorExecutante();
    }

    /**
     * Create an instance of {@link CtDetalheProtocolo.CodigoGlosaProtocolo }
     * 
     */
    public CtDetalheProtocolo.CodigoGlosaProtocolo createCtDetalheProtocoloCodigoGlosaProtocolo() {
        return new CtDetalheProtocolo.CodigoGlosaProtocolo();
    }

    /**
     * Create an instance of {@link CtDetalheProtocolo.Guias }
     * 
     */
    public CtDetalheProtocolo.Guias createCtDetalheProtocoloGuias() {
        return new CtDetalheProtocolo.Guias();
    }

    /**
     * Create an instance of {@link CtGuiaConsultaReapresentacao.HipoteseDiagnostica }
     * 
     */
    public CtGuiaConsultaReapresentacao.HipoteseDiagnostica createCtGuiaConsultaReapresentacaoHipoteseDiagnostica() {
        return new CtGuiaConsultaReapresentacao.HipoteseDiagnostica();
    }

    /**
     * Create an instance of {@link CtLoteGuias.Guias }
     * 
     */
    public CtLoteGuias.Guias createCtLoteGuiasGuias() {
        return new CtLoteGuias.Guias();
    }

    /**
     * Create an instance of {@link CtGuias.GuiaFaturamento }
     * 
     */
    public CtGuias.GuiaFaturamento createCtGuiasGuiaFaturamento() {
        return new CtGuias.GuiaFaturamento();
    }

    /**
     * Create an instance of {@link CtGuias.GuiaRevisaoGlosa }
     * 
     */
    public CtGuias.GuiaRevisaoGlosa createCtGuiasGuiaRevisaoGlosa() {
        return new CtGuias.GuiaRevisaoGlosa();
    }

    /**
     * Create an instance of {@link CtCabecalhoGuia.IdentificacaoFontePagadora }
     * 
     */
    public CtCabecalhoGuia.IdentificacaoFontePagadora createCtCabecalhoGuiaIdentificacaoFontePagadora() {
        return new CtCabecalhoGuia.IdentificacaoFontePagadora();
    }

    /**
     * Create an instance of {@link CtAutorizacaoProcedimento.MotivoNegativa }
     * 
     */
    public CtAutorizacaoProcedimento.MotivoNegativa createCtAutorizacaoProcedimentoMotivoNegativa() {
        return new CtAutorizacaoProcedimento.MotivoNegativa();
    }

    /**
     * Create an instance of {@link CtAutorizacaoProcedimento.Procedimentos }
     * 
     */
    public CtAutorizacaoProcedimento.Procedimentos createCtAutorizacaoProcedimentoProcedimentos() {
        return new CtAutorizacaoProcedimento.Procedimentos();
    }

    /**
     * Create an instance of {@link CtSituacaoAutorizacao.DadosAutorizacao.TotalOdonto }
     * 
     */
    public CtSituacaoAutorizacao.DadosAutorizacao.TotalOdonto createCtSituacaoAutorizacaoDadosAutorizacaoTotalOdonto() {
        return new CtSituacaoAutorizacao.DadosAutorizacao.TotalOdonto();
    }

    /**
     * Create an instance of {@link CtSituacaoAutorizacao.DadosAutorizacao.CtDiariaProrrogacaoAutorizada }
     * 
     */
    public CtSituacaoAutorizacao.DadosAutorizacao.CtDiariaProrrogacaoAutorizada createCtSituacaoAutorizacaoDadosAutorizacaoCtDiariaProrrogacaoAutorizada() {
        return new CtSituacaoAutorizacao.DadosAutorizacao.CtDiariaProrrogacaoAutorizada();
    }

    /**
     * Create an instance of {@link CtDadosPagamento.LoteOdonto }
     * 
     */
    public CtDadosPagamento.LoteOdonto createCtDadosPagamentoLoteOdonto() {
        return new CtDadosPagamento.LoteOdonto();
    }

    /**
     * Create an instance of {@link CtIdentificacaoEquipe.MembroEquipe }
     * 
     */
    public CtIdentificacaoEquipe.MembroEquipe createCtIdentificacaoEquipeMembroEquipe() {
        return new CtIdentificacaoEquipe.MembroEquipe();
    }

    /**
     * Create an instance of {@link CtGuiaOdontologia.DadosBeneficiario }
     * 
     */
    public CtGuiaOdontologia.DadosBeneficiario createCtGuiaOdontologiaDadosBeneficiario() {
        return new CtGuiaOdontologia.DadosBeneficiario();
    }

    /**
     * Create an instance of {@link CtGuiaOdontologia.ProcedimentosExecutados.ProcedimentoExecutado }
     * 
     */
    public CtGuiaOdontologia.ProcedimentosExecutados.ProcedimentoExecutado createCtGuiaOdontologiaProcedimentosExecutadosProcedimentoExecutado() {
        return new CtGuiaOdontologia.ProcedimentosExecutados.ProcedimentoExecutado();
    }

    /**
     * Create an instance of {@link CtGuiaOdontologia.DadosContratadoExecutante.DadosContratado }
     * 
     */
    public CtGuiaOdontologia.DadosContratadoExecutante.DadosContratado createCtGuiaOdontologiaDadosContratadoExecutanteDadosContratado() {
        return new CtGuiaOdontologia.DadosContratadoExecutante.DadosContratado();
    }

    /**
     * Create an instance of {@link CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo }
     * 
     */
    public CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo createCtProtocoloRecebimentoAnexoProtocoloRecebimentoRelacaoAnexo() {
        return new CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo();
    }

    /**
     * Create an instance of {@link CtOPMUtilizada.OPM.IdentificacaoOPM }
     * 
     */
    public CtOPMUtilizada.OPM.IdentificacaoOPM createCtOPMUtilizadaOPMIdentificacaoOPM() {
        return new CtOPMUtilizada.OPM.IdentificacaoOPM();
    }

    /**
     * Create an instance of {@link CtCabecalhoGuiaOdonto.IdentificacaoFontePagadora }
     * 
     */
    public CtCabecalhoGuiaOdonto.IdentificacaoFontePagadora createCtCabecalhoGuiaOdontoIdentificacaoFontePagadora() {
        return new CtCabecalhoGuiaOdonto.IdentificacaoFontePagadora();
    }

    /**
     * Create an instance of {@link CtLoteAnexo.AnexoGuia }
     * 
     */
    public CtLoteAnexo.AnexoGuia createCtLoteAnexoAnexoGuia() {
        return new CtLoteAnexo.AnexoGuia();
    }

    /**
     * Create an instance of {@link CtProtocoloRecebimento.ProtocoloRecebimento }
     * 
     */
    public CtProtocoloRecebimento.ProtocoloRecebimento createCtProtocoloRecebimentoProtocoloRecebimento() {
        return new CtProtocoloRecebimento.ProtocoloRecebimento();
    }

    /**
     * Create an instance of {@link CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante }
     * 
     */
    public CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante createCtGuiaHonorarioIndividualReapresentacaoContratadoExecutante() {
        return new CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante();
    }

    /**
     * Create an instance of {@link CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados }
     * 
     */
    public CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados createCtGuiaHonorarioIndividualReapresentacaoProcedimentosExamesRealizados() {
        return new CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados();
    }

    /**
     * Create an instance of {@link CtProcedimentoRevisao.ProcedimentosRevisao }
     * 
     */
    public CtProcedimentoRevisao.ProcedimentosRevisao createCtProcedimentoRevisaoProcedimentosRevisao() {
        return new CtProcedimentoRevisao.ProcedimentosRevisao();
    }

    /**
     * Create an instance of {@link CtProcedimentoOdontoRevisao.ProcedimentoOdontologia }
     * 
     */
    public CtProcedimentoOdontoRevisao.ProcedimentoOdontologia createCtProcedimentoOdontoRevisaoProcedimentoOdontologia() {
        return new CtProcedimentoOdontoRevisao.ProcedimentoOdontologia();
    }

    /**
     * Create an instance of {@link CtAutorizacaoProcedimentoOdonto.MotivoNegativa }
     * 
     */
    public CtAutorizacaoProcedimentoOdonto.MotivoNegativa createCtAutorizacaoProcedimentoOdontoMotivoNegativa() {
        return new CtAutorizacaoProcedimentoOdonto.MotivoNegativa();
    }

    /**
     * Create an instance of {@link CtAutorizacaoProcedimentoOdonto.Procedimentos }
     * 
     */
    public CtAutorizacaoProcedimentoOdonto.Procedimentos createCtAutorizacaoProcedimentoOdontoProcedimentos() {
        return new CtAutorizacaoProcedimentoOdonto.Procedimentos();
    }

    /**
     * Create an instance of {@link CtAutorizacaoProcedimentoOdonto.TotalOdonto }
     * 
     */
    public CtAutorizacaoProcedimentoOdonto.TotalOdonto createCtAutorizacaoProcedimentoOdontoTotalOdonto() {
        return new CtAutorizacaoProcedimentoOdonto.TotalOdonto();
    }

    /**
     * Create an instance of {@link CtDescontos.ItemDesconto }
     * 
     */
    public CtDescontos.ItemDesconto createCtDescontosItemDesconto() {
        return new CtDescontos.ItemDesconto();
    }

    /**
     * Create an instance of {@link CtAtendimentoConsultaReapr.Procedimento }
     * 
     */
    public CtAtendimentoConsultaReapr.Procedimento createCtAtendimentoConsultaReaprProcedimento() {
        return new CtAtendimentoConsultaReapr.Procedimento();
    }

    /**
     * Create an instance of {@link CtDemonstrativoPagamento.DadosResumo }
     * 
     */
    public CtDemonstrativoPagamento.DadosResumo createCtDemonstrativoPagamentoDadosResumo() {
        return new CtDemonstrativoPagamento.DadosResumo();
    }

    /**
     * Create an instance of {@link CtGuiaSolicInternacao.PrestadorSolicitado }
     * 
     */
    public CtGuiaSolicInternacao.PrestadorSolicitado createCtGuiaSolicInternacaoPrestadorSolicitado() {
        return new CtGuiaSolicInternacao.PrestadorSolicitado();
    }

    /**
     * Create an instance of {@link CtReciboCancelaGuia.GuiasCanceladas.DadosGuia }
     * 
     */
    public CtReciboCancelaGuia.GuiasCanceladas.DadosGuia createCtReciboCancelaGuiaGuiasCanceladasDadosGuia() {
        return new CtReciboCancelaGuia.GuiasCanceladas.DadosGuia();
    }

    /**
     * Create an instance of {@link CtProcedimentosSolicitados.ProcedimentoSolicitado }
     * 
     */
    public CtProcedimentosSolicitados.ProcedimentoSolicitado createCtProcedimentosSolicitadosProcedimentoSolicitado() {
        return new CtProcedimentosSolicitados.ProcedimentoSolicitado();
    }

    /**
     * Create an instance of {@link CtGuiaSPSADTReapresentacao.PrestadorExecutante.ProfissionalExecutanteCompl }
     * 
     */
    public CtGuiaSPSADTReapresentacao.PrestadorExecutante.ProfissionalExecutanteCompl createCtGuiaSPSADTReapresentacaoPrestadorExecutanteProfissionalExecutanteCompl() {
        return new CtGuiaSPSADTReapresentacao.PrestadorExecutante.ProfissionalExecutanteCompl();
    }

    /**
     * Create an instance of {@link CtSituacaoClinica.Dentes }
     * 
     */
    public CtSituacaoClinica.Dentes createCtSituacaoClinicaDentes() {
        return new CtSituacaoClinica.Dentes();
    }

    /**
     * Create an instance of {@link CtItemSolicitacaoOdonto.Glosas }
     * 
     */
    public CtItemSolicitacaoOdonto.Glosas createCtItemSolicitacaoOdontoGlosas() {
        return new CtItemSolicitacaoOdonto.Glosas();
    }

    /**
     * Create an instance of {@link CtProcedimentoRealizadoEquipe.Procedimentos }
     * 
     */
    public CtProcedimentoRealizadoEquipe.Procedimentos createCtProcedimentoRealizadoEquipeProcedimentos() {
        return new CtProcedimentoRealizadoEquipe.Procedimentos();
    }

    /**
     * Create an instance of {@link CtDemonstrativoAnaliseConta.Fatura }
     * 
     */
    public CtDemonstrativoAnaliseConta.Fatura createCtDemonstrativoAnaliseContaFatura() {
        return new CtDemonstrativoAnaliseConta.Fatura();
    }

    /**
     * Create an instance of {@link CtProcedimentoOdontoRealizado.Glosas }
     * 
     */
    public CtProcedimentoOdontoRealizado.Glosas createCtProcedimentoOdontoRealizadoGlosas() {
        return new CtProcedimentoOdontoRealizado.Glosas();
    }

    /**
     * Create an instance of {@link CtOutrasDespesasRevisao.ItensDespesas }
     * 
     */
    public CtOutrasDespesasRevisao.ItensDespesas createCtOutrasDespesasRevisaoItensDespesas() {
        return new CtOutrasDespesasRevisao.ItensDespesas();
    }

    /**
     * Create an instance of {@link CtItemSolicitacao.Glosas }
     * 
     */
    public CtItemSolicitacao.Glosas createCtItemSolicitacaoGlosas() {
        return new CtItemSolicitacao.Glosas();
    }

    /**
     * Create an instance of {@link CtSolicitacaoStatusProtocolo.DetalheProtocolo }
     * 
     */
    public CtSolicitacaoStatusProtocolo.DetalheProtocolo createCtSolicitacaoStatusProtocoloDetalheProtocolo() {
        return new CtSolicitacaoStatusProtocolo.DetalheProtocolo();
    }

    /**
     * Create an instance of {@link CtGuiaSPSADT.PrestadorExecutante.ProfissionalExecutanteCompl }
     * 
     */
    public CtGuiaSPSADT.PrestadorExecutante.ProfissionalExecutanteCompl createCtGuiaSPSADTPrestadorExecutanteProfissionalExecutanteCompl() {
        return new CtGuiaSPSADT.PrestadorExecutante.ProfissionalExecutanteCompl();
    }

    /**
     * Create an instance of {@link CtDemonstrativoOdontologia.DadosPrestador }
     * 
     */
    public CtDemonstrativoOdontologia.DadosPrestador createCtDemonstrativoOdontologiaDadosPrestador() {
        return new CtDemonstrativoOdontologia.DadosPrestador();
    }

    /**
     * Create an instance of {@link CtDemonstrativoOdontologia.DadosPagamento }
     * 
     */
    public CtDemonstrativoOdontologia.DadosPagamento createCtDemonstrativoOdontologiaDadosPagamento() {
        return new CtDemonstrativoOdontologia.DadosPagamento();
    }

    /**
     * Create an instance of {@link CtDemonstrativoOdontologia.DebitosCreditosTributaveis }
     * 
     */
    public CtDemonstrativoOdontologia.DebitosCreditosTributaveis createCtDemonstrativoOdontologiaDebitosCreditosTributaveis() {
        return new CtDemonstrativoOdontologia.DebitosCreditosTributaveis();
    }

    /**
     * Create an instance of {@link CtDemonstrativoOdontologia.DemaisImpostos }
     * 
     */
    public CtDemonstrativoOdontologia.DemaisImpostos createCtDemonstrativoOdontologiaDemaisImpostos() {
        return new CtDemonstrativoOdontologia.DemaisImpostos();
    }

    /**
     * Create an instance of {@link CtDemonstrativoOdontologia.DebitosCreditosNaoTributaveis }
     * 
     */
    public CtDemonstrativoOdontologia.DebitosCreditosNaoTributaveis createCtDemonstrativoOdontologiaDebitosCreditosNaoTributaveis() {
        return new CtDemonstrativoOdontologia.DebitosCreditosNaoTributaveis();
    }

    /**
     * Create an instance of {@link CtOPMAutorizada.OPMAutorizada }
     * 
     */
    public CtOPMAutorizada.OPMAutorizada createCtOPMAutorizadaOPMAutorizada() {
        return new CtOPMAutorizada.OPMAutorizada();
    }

    /**
     * Create an instance of {@link CtDadosLote.Guia }
     * 
     */
    public CtDadosLote.Guia createCtDadosLoteGuia() {
        return new CtDadosLote.Guia();
    }

    /**
     * Create an instance of {@link CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao }
     * 
     */
    public CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao createCtSolicitaStatusAutorizacaoIdentificacaoAutorizacaoIdentificacaoSolicitacao() {
        return new CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao();
    }

    /**
     * Create an instance of {@link CtGuiaTratamentoOdontologicoReapresentacao.DadosBeneficiario }
     * 
     */
    public CtGuiaTratamentoOdontologicoReapresentacao.DadosBeneficiario createCtGuiaTratamentoOdontologicoReapresentacaoDadosBeneficiario() {
        return new CtGuiaTratamentoOdontologicoReapresentacao.DadosBeneficiario();
    }

    /**
     * Create an instance of {@link CtGuiaTratamentoOdontologicoReapresentacao.ProcedimentosExecutados }
     * 
     */
    public CtGuiaTratamentoOdontologicoReapresentacao.ProcedimentosExecutados createCtGuiaTratamentoOdontologicoReapresentacaoProcedimentosExecutados() {
        return new CtGuiaTratamentoOdontologicoReapresentacao.ProcedimentosExecutados();
    }

    /**
     * Create an instance of {@link CtGuiaTratamentoOdontologicoReapresentacao.DadosContratadoExecutante.DadosContratado }
     * 
     */
    public CtGuiaTratamentoOdontologicoReapresentacao.DadosContratadoExecutante.DadosContratado createCtGuiaTratamentoOdontologicoReapresentacaoDadosContratadoExecutanteDadosContratado() {
        return new CtGuiaTratamentoOdontologicoReapresentacao.DadosContratadoExecutante.DadosContratado();
    }

    /**
     * Create an instance of {@link CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados }
     * 
     */
    public CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados createCtStatusLoteGuiasDetalheguiaOdontoProcedimentosAnalisados() {
        return new CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados();
    }

    /**
     * Create an instance of {@link CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados }
     * 
     */
    public CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados createCtStatusLoteGuiasDetalheguiaMedicaProcedimentosAnalisados() {
        return new CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados();
    }

    /**
     * Create an instance of {@link CtCancelaGuia.Guia }
     * 
     */
    public CtCancelaGuia.Guia createCtCancelaGuiaGuia() {
        return new CtCancelaGuia.Guia();
    }

    /**
     * Create an instance of {@link MensagemTISS.PrestadorParaOperadora.SolicitacaoProcedimento }
     * 
     */
    public MensagemTISS.PrestadorParaOperadora.SolicitacaoProcedimento createMensagemTISSPrestadorParaOperadoraSolicitacaoProcedimento() {
        return new MensagemTISS.PrestadorParaOperadora.SolicitacaoProcedimento();
    }

    /**
     * Create an instance of {@link MensagemTISS.PrestadorParaOperadora.ComunicacaoBeneficiario }
     * 
     */
    public MensagemTISS.PrestadorParaOperadora.ComunicacaoBeneficiario createMensagemTISSPrestadorParaOperadoraComunicacaoBeneficiario() {
        return new MensagemTISS.PrestadorParaOperadora.ComunicacaoBeneficiario();
    }

    /**
     * Create an instance of {@link MensagemTISS.OperadoraParaPrestador.DemonstrativosRetorno }
     * 
     */
    public MensagemTISS.OperadoraParaPrestador.DemonstrativosRetorno createMensagemTISSOperadoraParaPrestadorDemonstrativosRetorno() {
        return new MensagemTISS.OperadoraParaPrestador.DemonstrativosRetorno();
    }

    /**
     * Create an instance of {@link MensagemTISS.OperadoraParaPrestador.AutorizacaoServicoOdonto }
     * 
     */
    public MensagemTISS.OperadoraParaPrestador.AutorizacaoServicoOdonto createMensagemTISSOperadoraParaPrestadorAutorizacaoServicoOdonto() {
        return new MensagemTISS.OperadoraParaPrestador.AutorizacaoServicoOdonto();
    }

    /**
     * Create an instance of {@link MensagemTISS.OperadoraParaPrestador.AutorizacaoServico.DiariaProrrogacaoAutorizada }
     * 
     */
    public MensagemTISS.OperadoraParaPrestador.AutorizacaoServico.DiariaProrrogacaoAutorizada createMensagemTISSOperadoraParaPrestadorAutorizacaoServicoDiariaProrrogacaoAutorizada() {
        return new MensagemTISS.OperadoraParaPrestador.AutorizacaoServico.DiariaProrrogacaoAutorizada();
    }

    /**
     * Create an instance of {@link CabecalhoTransacao.IdentificacaoTransacao }
     * 
     */
    public CabecalhoTransacao.IdentificacaoTransacao createCabecalhoTransacaoIdentificacaoTransacao() {
        return new CabecalhoTransacao.IdentificacaoTransacao();
    }

    /**
     * Create an instance of {@link CabecalhoTransacao.FalhaNegocio }
     * 
     */
    public CabecalhoTransacao.FalhaNegocio createCabecalhoTransacaoFalhaNegocio() {
        return new CabecalhoTransacao.FalhaNegocio();
    }

    /**
     * Create an instance of {@link CabecalhoTransacao.Origem }
     * 
     */
    public CabecalhoTransacao.Origem createCabecalhoTransacaoOrigem() {
        return new CabecalhoTransacao.Origem();
    }

    /**
     * Create an instance of {@link CabecalhoTransacao.Destino }
     * 
     */
    public CabecalhoTransacao.Destino createCabecalhoTransacaoDestino() {
        return new CabecalhoTransacao.Destino();
    }

    /**
     * Create an instance of {@link NodoTissnet.PontoAPonto }
     * 
     */
    public NodoTissnet.PontoAPonto createNodoTissnetPontoAPonto() {
        return new NodoTissnet.PontoAPonto();
    }

    /**
     * Create an instance of {@link NodoTissnet.WebServices }
     * 
     */
    public NodoTissnet.WebServices createNodoTissnetWebServices() {
        return new NodoTissnet.WebServices();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "valor", scope = CtProcedimentosRealizados.ProcedimentoRealizado.class)
    public JAXBElement<BigDecimal> createCtProcedimentosRealizadosProcedimentoRealizadoValor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CtProcedimentosRealizadosProcedimentoRealizadoValor_QNAME, BigDecimal.class, CtProcedimentosRealizados.ProcedimentoRealizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "valorTotal", scope = CtProcedimentosRealizados.ProcedimentoRealizado.class)
    public JAXBElement<BigDecimal> createCtProcedimentosRealizadosProcedimentoRealizadoValorTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CtProcedimentosRealizadosProcedimentoRealizadoValorTotal_QNAME, BigDecimal.class, CtProcedimentosRealizados.ProcedimentoRealizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "complemento", scope = CtEndereco.class)
    public JAXBElement<String> createCtEnderecoComplemento(String value) {
        return new JAXBElement<String>(_CtEnderecoComplemento_QNAME, String.class, CtEndereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CtTempoEvolucaoDoenca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "tempoReferidoEvolucaoDoenca", scope = CtDiagnosticoAtendimento.class)
    public JAXBElement<CtTempoEvolucaoDoenca> createCtDiagnosticoAtendimentoTempoReferidoEvolucaoDoenca(CtTempoEvolucaoDoenca value) {
        return new JAXBElement<CtTempoEvolucaoDoenca>(_CtDiagnosticoAtendimentoTempoReferidoEvolucaoDoenca_QNAME, CtTempoEvolucaoDoenca.class, CtDiagnosticoAtendimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StTipoDoenca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "tipoDoenca", scope = CtDiagnosticoAtendimento.class)
    public JAXBElement<StTipoDoenca> createCtDiagnosticoAtendimentoTipoDoenca(StTipoDoenca value) {
        return new JAXBElement<StTipoDoenca>(_CtDiagnosticoAtendimentoTipoDoenca_QNAME, StTipoDoenca.class, CtDiagnosticoAtendimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CtDiagnosticosSecundarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "diagnosticosSecundarios", scope = CtHipoteseDiagnostica.class)
    public JAXBElement<CtDiagnosticosSecundarios> createCtHipoteseDiagnosticaDiagnosticosSecundarios(CtDiagnosticosSecundarios value) {
        return new JAXBElement<CtDiagnosticosSecundarios>(_CtHipoteseDiagnosticaDiagnosticosSecundarios_QNAME, CtDiagnosticosSecundarios.class, CtHipoteseDiagnostica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "valor", scope = CtProcedimentoRealizadoEquipe.Procedimentos.class)
    public JAXBElement<BigDecimal> createCtProcedimentoRealizadoEquipeProcedimentosValor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CtProcedimentosRealizadosProcedimentoRealizadoValor_QNAME, BigDecimal.class, CtProcedimentoRealizadoEquipe.Procedimentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "valorTotal", scope = CtProcedimentoRealizadoEquipe.Procedimentos.class)
    public JAXBElement<BigDecimal> createCtProcedimentoRealizadoEquipeProcedimentosValorTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CtProcedimentosRealizadosProcedimentoRealizadoValorTotal_QNAME, BigDecimal.class, CtProcedimentoRealizadoEquipe.Procedimentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "valor", scope = CtProcedimentoRevisao.ProcedimentosRevisao.class)
    public JAXBElement<BigDecimal> createCtProcedimentoRevisaoProcedimentosRevisaoValor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CtProcedimentosRealizadosProcedimentoRealizadoValor_QNAME, BigDecimal.class, CtProcedimentoRevisao.ProcedimentosRevisao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "valorTotal", scope = CtProcedimentoRevisao.ProcedimentosRevisao.class)
    public JAXBElement<BigDecimal> createCtProcedimentoRevisaoProcedimentosRevisaoValorTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CtProcedimentosRealizadosProcedimentoRealizadoValorTotal_QNAME, BigDecimal.class, CtProcedimentoRevisao.ProcedimentosRevisao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "descricaoDiagnostico", scope = CtDiagnostico.class)
    public JAXBElement<String> createCtDiagnosticoDescricaoDiagnostico(String value) {
        return new JAXBElement<String>(_CtDiagnosticoDescricaoDiagnostico_QNAME, String.class, CtDiagnostico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "descricao", scope = CtTabela.class)
    public JAXBElement<String> createCtTabelaDescricao(String value) {
        return new JAXBElement<String>(_CtTabelaDescricao_QNAME, String.class, CtTabela.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "indicacaoClinica", scope = CtGuiaSolicitacaoSPSADT.class)
    public JAXBElement<String> createCtGuiaSolicitacaoSPSADTIndicacaoClinica(String value) {
        return new JAXBElement<String>(_CtGuiaSolicitacaoSPSADTIndicacaoClinica_QNAME, String.class, CtGuiaSolicitacaoSPSADT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CtDiagnostico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "Diagnostico", scope = CtGuiaSolicitacaoSPSADT.class)
    public JAXBElement<CtDiagnostico> createCtGuiaSolicitacaoSPSADTDiagnostico(CtDiagnostico value) {
        return new JAXBElement<CtDiagnostico>(_CtGuiaSolicitacaoSPSADTDiagnostico_QNAME, CtDiagnostico.class, CtGuiaSolicitacaoSPSADT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CtTempoEvolucaoDoenca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "tempoReferidoEvolucaoDoenca", scope = CtDiagnosticoGuia.class)
    public JAXBElement<CtTempoEvolucaoDoenca> createCtDiagnosticoGuiaTempoReferidoEvolucaoDoenca(CtTempoEvolucaoDoenca value) {
        return new JAXBElement<CtTempoEvolucaoDoenca>(_CtDiagnosticoAtendimentoTempoReferidoEvolucaoDoenca_QNAME, CtTempoEvolucaoDoenca.class, CtDiagnosticoGuia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StTipoDoenca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "tipoDoenca", scope = CtDiagnosticoGuia.class)
    public JAXBElement<StTipoDoenca> createCtDiagnosticoGuiaTipoDoenca(StTipoDoenca value) {
        return new JAXBElement<StTipoDoenca>(_CtDiagnosticoAtendimentoTipoDoenca_QNAME, StTipoDoenca.class, CtDiagnosticoGuia.class, value);
    }

}
