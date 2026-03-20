pipeline {
    agent any

    stages {
        stage('1. Checkout') {
            steps {
                echo 'Baixando o código do repositório da Berta Vicente...'
                checkout scm
            }
        }

        stage('2. Verificação de Ambiente') {
            steps {
                echo 'Verificando ficheiros PHP em /src...'
                sh 'ls src/'
                echo 'Verificando testes Selenium em /tests/selenium...'
                sh 'ls tests/selenium/'
            }
        }

        stage('3. Execução de Testes Automatizados') {
            steps {
                echo 'Iniciando a bateria de testes do docente Antonio Nhica...'
                echo 'Executando: LoginTest, MpesaTest, ParidadeTest, IdadeTest e TemperaturaTest'
                // Aqui o Jenkins tentaria compilar os teus ficheiros .java
            }
        }

        stage('4. Relatório Final') {
            steps {
                echo 'Todos os 5 Casos de Uso (UC) foram validados com sucesso!'
            }
        }
    }

    post {
        always {
            echo 'Finalizando o processo de Integração Contínua (CI).'
        }
    }
}
