# project-test
# Projeto de Automação de Testes e CI/CD - UCM
**Estudante:** Berta Vicente  
**Curso:** Tecnologias de Informação  
**Docente:** Antonio Nhica  

##  Visão Geral do Projeto
Este projeto foi desenvolvido para demonstrar a implementação de uma esteira de **Integração Contínua (CI)** utilizando ferramentas de mercado como **Jira**, **GitHub** e **Jenkins**. O sistema consiste em 5 funcionalidades principais (Casos de Uso) com validações automatizadas.

##  Estrutura do Repositório
* **`/src`**: Contém o código-fonte em PHP das funcionalidades (Login, M-Pesa, Paridade, Idade e Temperatura).
* **`/tests/unit`**: Testes unitários para validação da lógica matemática e regras de negócio.
* **`/tests/selenium`**: Scripts de automação de interface (UI) desenvolvidos em Java/Selenium.
* **`Jenkinsfile`**: Ficheiro de configuração do Pipeline para execução automática dos testes.

##  Casos de Uso Automatizados (Jira)
Os testes cobrem os seguintes requisitos planejados no Jira:
1. **UC01 - Login:** Validação de credenciais e e-mail.
2. **UC02 - M-Pesa:** Validação de limites de levantamento (10 a 5000 MT).
3. **UC03 - Paridade:** Verificação de números pares e ímpares.
4. **UC04 - Idade:** Validação de elegibilidade para votação (18 anos).
5. **UC05 - Temperatura:** Classificação de estados térmicos.

##  Como Executar
O projeto está preparado para **CI/CD**. Ao realizar um *Push* para este repositório, o Jenkins lê o `Jenkinsfile` e executa as seguintes etapas:
1. Checkout do Código.
2. Verificação de Ambiente.
3. Execução dos Testes Automatizados (Unit & Selenium).
4. Relatório de Resultado.
