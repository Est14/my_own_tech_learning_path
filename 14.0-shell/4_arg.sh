#!/bin/bash
#Programa para ejemplificar el paso de args

nombreCurso=$1
horarioCurso=$2

echo "El nombre del curso es: $nombreCurso y el horario es: $horarioCurso" 
echo "El numero de parametros es: $#"
echo "Los parametros enviados son: $*"

