<?php
// UC03: Teste de Função de Paridade
function verificarParidade($numero) {
    if ($numero % 2 == 0) {
        return "PAR"; // Condição verdadeira
    } else {
        return "IMPAR"; // Condição falsa
    }
}
?>
