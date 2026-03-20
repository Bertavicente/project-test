<?php
// UC04: Validação de Idade para votar
function podeVotar($idade) {
    if ($idade < 18) {
        return "Não pode votar"; // Teste com 17
    } elseif ($idade >= 18) {
        return "Pode votar"; // Teste com 18 e 19
    }
}
?>
