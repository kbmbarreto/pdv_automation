package pdv_automation;

import org.openqa.selenium.winium.WiniumDriver;

import testcases.MenuAdmin;
import testcases.MenuCaixa;

public class Playlist {
	
	MenuAdmin menuAdmin = new MenuAdmin();
	MenuCaixa menuCaixa = new MenuCaixa();
	
	public void executarPlaylist(WiniumDriver driver) {
		
		/***********************************************/
		//----------------MENÚ CAIXA-------------------//
		/***********************************************/
		
		//Sub-menu Abertura/Fechamento Caixa
		menuCaixa.abrirCaixaSemFundos(driver);
		menuCaixa.fecharCaixaCancelar(driver);
		menuCaixa.fecharCaixaManual(driver);
		menuCaixa.abrirCaixaFundoNegativo(driver);
		menuCaixa.fecharCaixaManual(driver);
		menuCaixa.abrirCaixaFundoPositivo(driver);
		
		//Sub-menu Movimento
		menuCaixa.validarMovimento(driver);
		
		//Sub-menu Mobile Conect
		menuCaixa.validarMobileConect(driver);
		
		//Sub-menu RPS
		menuCaixa.validarRPS(driver);
		
		//Sub-menu Sangria
		menuCaixa.validarSangria(driver);
		
		/***********************************************/
		//-------------MENÚ ADMINISTRAÇÃO--------------//
		/***********************************************/
		
		//Sub-menu Cadastro de diárias
		
		menuAdmin.cadastroDiariaCancelar(driver);
		menuAdmin.cadastroDiaria(driver);
		menuAdmin.pesquisarDiaria(driver);
		menuAdmin.excluirDiariaCancelar(driver);
		menuAdmin.excluirDiaria(driver);
		
		//Sub-menu Feriados
		
		menuAdmin.cadastrarFeriadoCancelar(driver);
		menuAdmin.cadastrarFeriado(driver);
		menuAdmin.pesquisarFeriado(driver);
	}
}
