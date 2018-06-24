%medicion(NumMuestra, ValMin, ValMax).
medicion(1, 19000, 25000).
medicion(2, 10000, 30000).
medicion(3, 12000, 19000).
medicion(4, 18000, 26000).
medicion(5, 24000, 25000).
medicion(6, 24000, 30000).
medicion(7, 27000, 28000).
medicion(8, 12000, 23000).
medicion(9, 21000, 32000).
medicion(10, 15000, 16000).

%Las muestras válidas tienen ValMax - ValMin < 10000
muestra_valida(N, Min, Max) :- medicion(N, Min, Max), Max - Min < 10000.

%Primera muestra válida
primera_muestra_valida(N, Min, Max) :- muestra_valida(N, Min, Max), !.

%Muestras válidas con mayor ValMax
menores_val_max(Max) :- muestra_valida(_, _, Max), muestra_valida(_, _, Max2), Max < Max2.
muestra_mayor_val_max(N, Min, Max) :- muestra_valida(N, Min, Max), not(menores_val_max(Max)).
