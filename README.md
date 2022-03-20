# PDV Automation

<p>Projeto criado para automação de casos de teste de uma aplicação PDV em Windows Forms.</p>

## Ferramentas utilizadas

- Java
- Maven
- JUnit
- Selenium
- Winnium Driver

## Preparação do ambiente
Para rodar o projeto, utlize a IDE que você mais se identifique **(no meu caso, utilizo o IntelliJ)**, em seguida, altere a classe **AbrirPDV.java** para que o projeto se adeque a ao 
executável **mais recente do PDV**:

**Trecho da classe que deve ser alterado**:

````java
	public void setUp() throws Exception {
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\PDV\\PDV.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		this.Driver = driver;
	}
````

Em seguida, basta rodar a classe Main.java. Lembrando que este é apenas um projeto utilizado como modelo, tendo sua versão do PDV não disponibilizada pela empresa para detentora do mesmo, com este projeto servindo apenas como portfólio.

## Tutoriais úteis para configurar sua estação de trabalho.

- [Configurar variáveis de ambiente JAVA](https://mauriciogeneroso.medium.com/configurando-java-4-como-configurar-as-vari%C3%A1veis-java-home-path-e-classpath-no-windows-46040950638f)
- [Configurar variáveis de ambiente MAVEN](https://pt.stackoverflow.com/questions/259927/como-configurar-vari%C3%A1veis-de-ambiente-maven-java)