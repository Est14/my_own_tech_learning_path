#!/bin/bash
#Programa para revisar la declaracion de variables
opcion=0
nombre=Esteban

echo "Opcion: $opcion y Nombre: $nombre"

# Exportar la varible nombre para ques estee disponible a los demas proceso
export nombre

# LLamar al siguiente script para recuperar la variable
./2_variables.sh
echo "I think you know I love $MY_VARIABLE"

