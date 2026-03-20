<?php
// UC05: Classificação de Temperatura
function classificarTemperatura($temp) {
    if ($temp < 15) {
        return "temperatura fria";
    } elseif ($temp >= 15 && $temp <= 25) {
        return "temperatura agradavel";
    } else {
        return "temperatura quente";
    }
}
?>
