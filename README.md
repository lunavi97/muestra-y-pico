# Muestra y Pico

## Muestra

Se tiene como dato unas mediciones definidas de la siguiente manera: medicion(N, ValMin, ValMax)

La validación de las muestras es realizada a través de la regla: muestra_valida(N, Min, Max)

La primera muestra válida encontrada se puede observar al ejecutar: primera_muestra_valida(N, Min, Max)

Para obtener las muestras que tienen el mayor valor máximo se puede utilizar: muestra_mayor_val_max(N, Min, Max)

## Pico

Teniendo un vector con determinadas características se puede buscar el valor del pico y su posición.

El vector debe ser creciente hasta el pico y decreciente a partir de éste.

solve(int[] vec) : Integer
Devuelve el valor del pico (es decir, en la posición que le corresponde en el vector).

pos(int[] vec) : int
Devuelve la posición del pico, en el vector, tomando como punto de partida el 0.
