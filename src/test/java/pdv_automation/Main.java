package pdv_automation;

import testcases.AbrirPDV;

public class Main {

	public static void main(String[] args) throws Exception {
		
		AbrirPDV abrirPDV = new AbrirPDV();
		Playlist playlist = new Playlist();

		//Entrada PDV
		
		abrirPDV.setUp();
		abrirPDV.splashScreen();
		abrirPDV.loginValido();
		
		//Executar todos os testes da Playlist
		playlist.executarPlaylist(abrirPDV.getDriver());
		
		//Fechar Driver
		abrirPDV.Driver.close();
	}
}