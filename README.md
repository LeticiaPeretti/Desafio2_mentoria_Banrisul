# Desafio2_mentoria_Banrisul
Segundo desafio de automação de testes realizado para o projeto Banrisul.

O script de teste foi desenvolvido em API na URL:https://viacep.com.br/ws/90020100/json/ apresentando alguns conceitos de automação, tais como:

* TestSuite
* Tasks
* CasosDeTeste
* Eclipse IDE - eclipse.org
* Gradle - gradle.org
* JDK 8 - oracle.com
* Selenium WebDriver - seleniumhq.org
* JUnit - junit.org

## Execução:
Abra o projeto "Desafio2_mentoria_Banrisul" com o Eclipse IDE
Expandir o pacote "src/test/java", expandir Package viaCep
Clique com o botão direito na classe "validaCep.java"
Clique no menu "Run As -> JUnit Test"
Dependências obtidas através do gerenciador de dependências do Gradle.

## PASSO A PASSO
* Acessar a URL:https://viacep.com.br/ws/90020100/json/
* Consultar CEP valido
* Retornará o CEP, logradouro, complemento, bairro, localidade, UF, ibge, gia, ddd, siafi.
* Valida dados
* Consultar CEP inexistente 
* Valida CEP inexistente com mensagem na tela "erro": true
* Consulta CEP com formato invalido
* Valida CEP com formato invalido com mensagem na tela "Erro 400 Ops! Verifique a sua URL (Bad Request)"
