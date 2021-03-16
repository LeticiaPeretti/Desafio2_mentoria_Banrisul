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
* REST Assured

## Execução:
* Abra o projeto "Desafio2_mentoria_Banrisul" com o Eclipse IDE
* Expandir o pacote "src/test/java", expandir Package viaCep
* Clique com o botão direito na classe "validaCep.java"
* Clique no menu "Run As -> JUnit Test"
* Dependências obtidas através do gerenciador de dependências do Gradle.

## PASSO A PASSO
* Utilizando a URL:https://viacep.com.br/ws/90020100/json/
* Cenário: Consulta CEP valido
* Dado que o usuário inseri um CEP válido
* Quando o serviço é consultado
* Então é retornado o CEP, logradouro, complemento, bairro, localidade, uf e ibge

* Cenário: Consulta CEP inexixtente
* Dado que o usuário inseri um CEP que não exista na base dos Correios
* Quando o serviço é consultado
* Então é retornado um atributo erro

* Cenário: Consulta CEP com formato inválido
* Dado que o usuário inseri um CEP com formato inválido
* Quando o serviço é consultado
* Então é retornado uma mensagem de erro

Extras:
* Utilizando a URL:https://viacep.com.br/ws/Gravatai/Barroso/json/
* Cenário: Consulta Endereço
* Dado que o usuário inseri um Endereço
* Quando o serviço é consultado
* Então é retornado uma lista de  Cep, logradouro, complemento, bairro, localidade, uf e ibge.

