<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/pico.min.css">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"
    />
    <link rel="stylesheet" href="assets/components/css/style.css">

    <title>Calculadora</title>
</head>
<body>
<main class="container">
    <h1>Calculadora</h1>
    <form action="Calculadora" method="POST">
        <input type="text" name="number1" placeholder="Número 1" required aria-label="Número 1" />
        <input type="text" name="number2" placeholder="Número 2" required aria-label="Número 2" />
        <select name="operator" aria-label="Operación" required>
            <option value="" selected>Selecciona una operación</option>
            <option value="1">Suma</option>
            <option value="2">Resta</option>
            <option value="3">Multiplicación</option>
            <option value="4">División</option>
            <option value="5">Ordenar el número</option>
            <option value="6">Cuál es par e impar</option>
        </select>
        <input type="submit" value="Calcular">
    </form>
</main>

</body>
</html>