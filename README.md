# PrediccionConsumoCombustible

Proyecto en Java y Maven que entrena un modelo de **regresión lineal** mediante mínimos cuadrados ordinarios (**OLS**) con la librería **Smile** para estimar el consumo de combustible (en litros) de un vehículo a partir de la distancia recorrida (en kilómetros).

## Objetivo

Aprender la relación histórica entre distancia y consumo de combustible para predecir cuántos litros consumirá un nuevo viaje de **180 km**.

## Datos de entrenamiento

| Distancia (km) | Consumo de combustible (litros) |
| :---: | :---: |
| 50 | 5 |
| 100 | 10 |
| 150 | 15 |
| 200 | 20 |
| 250 | 25 |
| 300 | 30 |

* **Predicción objetivo:** para una distancia de `180.0 km`, el modelo estima `18,00 litros` (según la configuración regional del sistema).

## Tecnologías utilizadas

* **Java**
* **Maven** (`pom.xml`)
* **Smile** (`smile.data.DataFrame`, `smile.data.formula.Formula`, `smile.regression.LinearModel`, `smile.regression.OLS`)

## Estructura del proyecto

```text
PrediccionConsumoCombustible/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── bryanstrk/
                    └── Main.java
```

## Ejecución

1. Clona el repositorio:
   ```bash
   git clone [https://github.com/BryanStrk/PrediccionConsumoCombustible.git](https://github.com/BryanStrk/PrediccionConsumoCombustible.git)
   cd PrediccionConsumoCombustible
   ```
2. Ejecuta la clase `com.bryanstrk.Main` desde **IntelliJ IDEA** o compila el proyecto con Maven.
3. Revisa en consola el consumo estimado calculado para el viaje de 180 km.

## Posibles mejoras

* Solicitar la distancia dinámicamente por consola (`Scanner`) o leer datos históricos desde un archivo CSV.
* Incorporar más variables (velocidad media, carga, tipo de vehículo o conducción en ciudad/autopista).
* Evaluar métricas del modelo (`MAE`, `MSE`, `RMSE`, `R²`).
