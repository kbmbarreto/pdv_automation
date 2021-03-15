package forms;

import org.openqa.selenium.winium.WiniumDriver;

import testcases.AbrirPDV;

public class Submenu {
	
	AbrirPDV abrirPDV = new AbrirPDV();
	MenuPrincipal menuPrincipal = new MenuPrincipal();
	
	/***********************************************/
	//----------------MENÚ CAIXA-------------------//
	/***********************************************/
	
	public void clicarSubmenuAberturaFechamentoCaixa(WiniumDriver driver) {
		driver.findElementByName("ABERTURA / FECHAMENTO CAIXA").click();
	}
	
	public void clicarSubmenuMovimento(WiniumDriver driver) {
		driver.findElementByName("MOVIMENTO").click();
	}
	
	public void clicarSubmenuPrestacaoDeContas(WiniumDriver driver) {
		driver.findElementByName("PRESTAÇÃO DE CONTAS").click();
	}
	
	public void clicarSubmenuRPS(WiniumDriver driver) {
		driver.findElementByName("RPS").click();
	}
	
	public void clicarSubmenuMobileConnect(WiniumDriver driver) {
		driver.findElementByName("MOBILE CONNECT").click();
	}
	
	public void clicarSubmenuSangria(WiniumDriver driver) {
		driver.findElementByName("SANGRIA").click();
	}
	
	/***********************************************/
	//-------------MENÚ ADMINISTRAÇÃO--------------//
	/***********************************************/
	
	public void clicarSubmenuCadastroDiaria(WiniumDriver driver) {
		driver.findElementByName("CADASTRO DE DIÁRIAS").click();
	}
	
	public void clicarSubmenuFeriados(WiniumDriver driver) {
		driver.findElementByName("FERIADOS").click();
	}
	
	public void clicarSubmenuLimparPatio(WiniumDriver driver) {
		driver.findElementByName("LIMPAR PÁTIO").click();
	}
	
	public void clicarSubmenuLogAcesso(WiniumDriver driver) {
		driver.findElementByName("LOG DE ACESSO").click();
	}
	
	public void clicarSubmenuMonitorServico(WiniumDriver driver) {
		driver.findElementByName("MONITOR DE SERVIÇO").click();
	}
	
	public void clicarSubmenuPerfisAcesso(WiniumDriver driver) {
		driver.findElementByName("PERFIS DE ACESSO").click();
	}
	
	public void clicarSubmenuPrismas(WiniumDriver driver) {
		driver.findElementByName("PRISMAS").click();
	}
	
	public void clicarSubmenuSelos(WiniumDriver driver) {
		driver.findElementByName("SELOS").click();
	}
	
	public void clicarSubmenuTabelaPrecos(WiniumDriver driver) {
		driver.findElementByName("TABELA DE PREÇOS").click();
	}
	
	public void clicarSubmenuUsuarios(WiniumDriver driver) {
		driver.findElementByName("USUÁRIOS").click();
	}
	
	public void clicarSubmenuVeiculos(WiniumDriver driver) {
		driver.findElementByName("VEÍCULOS").click();
	}
	
	public void clicarSubmenuOperacaoOsa(WiniumDriver driver) {
		driver.findElementByName("OPERAÇÃO OSA").click();
	}
	
	public void clicarSubmenuAlertaOcorrencias(WiniumDriver driver) {
		driver.findElementByName("ALERTA DE OCORRÊNCIAS").click();
	}
	
	public void clicarSubmenuDashboardOperacional(WiniumDriver driver) {
		driver.findElementByName("DASHBOARD OPERACIONAL").click();
	}
	
	public void clicarSubmenuDescontoParceiro(WiniumDriver driver) {
		driver.findElementByName("DESCONTO PARCEIRO").click();
	}
	
	public void clicarSubmenuDescontos(WiniumDriver driver) {
		driver.findElementByName("DESCONTOS").click();
	}
	
	public void clicarSubmenuDisplayVagas(WiniumDriver driver) {
		driver.findElementByName("DISPLAY DE VAGAS").click();
	}
	
	public void clicarSubmenuGaragemWhiteList(WiniumDriver driver) {
		driver.findElementByName("GARAGEM WHITE LIST").click();
	}
	
	public void clicarSubmenuJustificativasCancelamentoTicket(WiniumDriver driver) {
		driver.findElementByName("JUSTIFICATIVAS DE CANCELAMENTO DE TICKET").click();
	}
	
	public void clicarSubmenuManutencaoSaldoCartãoDebito(WiniumDriver driver) {
		driver.findElementByName("MANUTENÇÃO DO SALDO DE CARTÃO DE DÉBITO").click();
	}
	
	public void clicarSubmenuMonitoramento(WiniumDriver driver) {
		driver.findElementByName("MONITORAMENTO").click();
	}
	
	public void clicarSubmenuSimulacaoTabelaPreco(WiniumDriver driver) {
		driver.findElementByName("SIMULAÇÃO DE TABELA DE PREÇO").click();
	}
	
	public void clicarSubmenuTabelaPrecosPromocional(WiniumDriver driver) {
		driver.findElementByName("TABELA DE PREÇOS PROMOCIONAL").click();
	}
}