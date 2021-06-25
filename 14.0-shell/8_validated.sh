#!/bin/bash
#Programa para validar info capturada del usuario

#Auto: Esteban Martinez - est14.dart@gmail.com

option=0
backupName=""
clave=""

echo "Programa de utilidades PotsgresQL"
#Acepta el ingreso dei nformacion de solo un caracter
read -n1 -p "Ingresar una opcion: " option
echo -e "\n"
read -n10 -p "Ingresar el nombre del Backup: " backupName
echo -e "\n"
echo "La opcion: $option, Backup name: $backupName"
read -s -p "Clave:" clave
echo "Clave: " $clave

