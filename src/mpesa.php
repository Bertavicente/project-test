<?php
// UC02: Sistema de Levantamento M-Pesa
function verificarLevantamento($valor, $saldo, $codigoDigitado, $codigoCorreto) {
    if ($valor < 10) {
        return "Abaixo do mínimo";
    }
    if ($valor > 5000) {
        return "Acima do máximo";
    }
    if ($valor > $saldo) {
        return "Saldo insuficiente";
    }
    if ($codigoDigitado != $codigoCorreto) {
        return "Codigo inválido";
    }
    return "Levantamento aprovado";
}
?>
