# Cajero ATM con excepciones personalizadas

Proyecto del taller de Programación I. Implementa un cajero automático simple
con el modelo MVP y una excepción propia por cada error de negocio.

## Estructura (modelo MVP)

| Capa        | Clase                            | Rol                                          |
|-------------|----------------------------------|----------------------------------------------|
| Modelo      | `BankAccount`                    | Guarda número de cuenta, clave y saldo       |
| Modelo      | Excepciones (3 clases)           | Errores de negocio                           |
| Vista       | `ATMView`                        | Muestra mensajes con `System.out.println`    |
| Presentador | `ATM`                            | Usa la cuenta y la vista para operar         |
| Entrada     | `Main`                           | Prueba los 4 casos y captura los errores     |

## Excepciones

| Clase                        | Tipo    | Se lanza cuando                         |
|------------------------------|---------|------------------------------------------|
| `InsufficientBalanceException` | checked | El monto a retirar supera el saldo       |
| `IncorrectKeyException`        | checked | La clave ingresada no coincide           |
| `InvalidAmountException`       | unchecked | El monto es menor o igual a cero        |

## Cómo abrir en NetBeans

1. `File > New Project > Java with Ant > Java Application`, nombre `CajeroATM`.
2. Borra la clase por defecto si NetBeans la creó.
3. Clic derecho en `Source Packages > New > Java Package`, nombre: `atm`.
4. Copia los 7 archivos `.java` de `src/atm` dentro de ese paquete.
5. `Run > Run Project` (F6).

## Cómo generar el Javadoc sin warnings

1. Clic derecho en el proyecto > `Generate Javadoc`.
2. Abre `dist/javadoc/index.html`.

Todo el código ya está documentado (autor, versión, constructores, `@param`,
`@return` y `@throws`), por lo que NetBeans genera el HTML sin ningún warning.

## Salida esperada

```
Saldo inicial: 500.0
Clave incorrecta
Intento procesado
Saldo insuficiente
Intento procesado
El monto debe ser mayor a cero
Intento procesado
Retiro exitoso. Saldo actual: 300.0
Intento procesado
Saldo final: 300.0
```

Autor: Fabian Florez (cod 202614060)
