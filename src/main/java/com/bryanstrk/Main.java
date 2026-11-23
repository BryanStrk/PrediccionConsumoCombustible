package com.bryanstrk;

import smile.data.DataFrame;
import smile.data.formula.Formula;
import smile.regression.LinearModel;
import smile.regression.OLS;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // Datos históricos: {distancia_km, consumo_litros}
        double[][] datos = {
                {50, 5},
                {100, 10},
                {150, 15},
                {200, 20},
                {250, 25},
                {300, 30}
        };

        DataFrame viajes = DataFrame.of(
                datos,
                "distancia",
                "consumo"
        );

        Formula formula = Formula.lhs("consumo");
        LinearModel modelo = OLS.fit(formula, viajes);

        double distanciaViaje = 180.0;
        double[] nuevoViaje = {distanciaViaje};

        double consumoEstimado = modelo.predict(nuevoViaje);

        System.out.println("===== PREDICCIÓN DE CONSUMO =====");
        System.out.println("Distancia del viaje: " + distanciaViaje + " km");
        System.out.printf("Consumo estimado: %.2f litros%n", consumoEstimado);
    }
}





