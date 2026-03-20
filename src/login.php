
<?php
// UC01: Fazer Login
function validarLogin($email, $senha) {
    if (empty($email) || empty($senha)) {
        return "Campos vazios";
    }
    if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        return "Email inválido";
    }
    if (strlen($senha) < 8) {
        return "Mínimo 8 caracteres";
    }
    if (!preg_match('/[0-9]/', $senha)) {
        return "Pelo menos 1 número";
    }
    if ($email == "admin@ucm.ac.mz" && $senha == "Senha123") {
        return "Login válido";
    } else {
        return "Senha incorrecta";
    }
}
?>
