#!/bin/bash
# Calculadora de interés simple
echo "Ingrese el capital:"
read capital
echo "Ingrese la tasa de interés (%):"
read tasa
echo "Ingrese el tiempo (años):"
read tiempo

interes=$(echo "$capital * $tasa * $tiempo / 100" | bc)
echo "El interés simple es: $interes"
