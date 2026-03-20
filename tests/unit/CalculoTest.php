<?php
// Teste Unitário (Unit) para validar a lógica de Paridade
// Este teste verifica apenas o cálculo, sem usar o Selenium.

class CalculoTest {
    
    public function testVerificarPar() {
        $numero = 10;
        // Simula a lógica que está no src/paridade.php
        $resultado = ($numero % 2 == 0) ? "PAR" : "IMPAR";
        
        if ($resultado == "PAR") {
            echo "Teste Unitário Passou: 10 é PAR";
        } else {
            echo "Teste Unitário Falhou";
        }
    }
}
?>
